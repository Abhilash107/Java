package OOPS_QNS.parkingLot;

public class Car extends Vehicle {
    public Car(String carNumber){
        super(carNumber);
    }

    @Override
    public double getRatePerHour() {
        return 20;
    }
}
