package OOPS_QNS.parkingLot;

public class Test {
    static void main(String[] args) throws InterruptedException {
        ParkingLot parkingLot = new ParkingLot();

        Vehicle car = new Car("10");
        Vehicle bike = new Car("20");
        Vehicle truck = new Car("30");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        Thread.sleep(3000);

        parkingLot.removeVehicle("10");
        parkingLot.removeVehicle("20");
        parkingLot.removeVehicle("30");
        parkingLot.removeVehicle("40");


    }
}
