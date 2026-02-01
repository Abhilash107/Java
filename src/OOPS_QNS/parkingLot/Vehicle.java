package OOPS_QNS.parkingLot;

public abstract class Vehicle {
    private String vehicleNumber;

    public Vehicle(String _vehicleNumber){
        this.vehicleNumber = _vehicleNumber;
    }

    public  String getVehicleNumber(){
        return this.vehicleNumber;
    }

    public abstract double getRatePerHour();
}
