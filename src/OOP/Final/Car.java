package OOP.Final;

public final class Car extends Vehicle{
    // declaring a class as final makes it unextendable, meaning no other class can inherit from it.
    private final int price;

    public Car(){
        price = 200000;
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }

    public final void airBags(){
        System.out.println("4 air bags");
    }
}
