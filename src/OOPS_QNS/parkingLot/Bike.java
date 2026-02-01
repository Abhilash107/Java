package OOPS_QNS.parkingLot;

public class Bike extends Vehicle{
    public Bike(String bikeNum){
        super(bikeNum);
    }

    @Override
    public double getRatePerHour() {
        return 10;
    }
}
