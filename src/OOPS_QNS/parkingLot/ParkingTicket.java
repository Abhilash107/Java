package OOPS_QNS.parkingLot;

import java.time.LocalDateTime;

public class ParkingTicket {
    private Vehicle vehicle;
    private final LocalDateTime entryTime;

    public ParkingTicket(Vehicle _vehicle){
        this.vehicle = _vehicle;
        this.entryTime = LocalDateTime.now();
    }

    public Vehicle getVehicle(){
        return this.vehicle;
    }

    public LocalDateTime getEntryTime(){
        return this.entryTime;
    }
}
