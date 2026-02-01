package OOPS_QNS.parkingLot;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;

public class ParkingLot {
    private HashMap<String, ParkingTicket> parkedVehicles = new HashMap<>();
    private int capacity = 100;

    public boolean parkVehicle(Vehicle vehicle){

        if(parkedVehicles.size() >= capacity){
            System.out.println("Parking lot is full");
            return false;
        }
        if(parkedVehicles.containsKey(vehicle.getVehicleNumber())){
            System.out.println("Vehicle already parked");
            return false;
        }

        ParkingTicket ticket = new ParkingTicket(vehicle);
        parkedVehicles.put(vehicle.getVehicleNumber(), ticket);

        System.out.println("Vehicle parked: "+ vehicle.getVehicleNumber());
        return true;
    }

    public double removeVehicle(String vehicleNumber){
        // check if ticket exists or not
        ParkingTicket ticket = parkedVehicles.get(vehicleNumber);

        if(ticket == null){
            System.out.println("Vehicle not found");
            return 0;
        }
        LocalDateTime entryTime = ticket.getEntryTime();
        LocalDateTime exitTime = LocalDateTime.now();

        long hours = Duration.between(entryTime, exitTime).toHours();
        if(hours <= 0) hours =1;

        Vehicle vehicle = ticket.getVehicle();
        double charge = hours * vehicle.getRatePerHour();

        parkedVehicles.remove(vehicleNumber);

        System.out.println("Vehicle removed: "+ vehicleNumber);
        System.out.println("Charges to be paid: "+ charge);
        return charge;
    }


}
