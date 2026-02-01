package OOPS_QNS.parkingLot;

public class Truck extends Vehicle{
    public Truck(String truckNumber){
        super(truckNumber);
    }

    @Override
    public double getRatePerHour() {
        return 30;
    }
}
