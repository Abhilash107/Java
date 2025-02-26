package OOP.Final;

public class Test extends Vehicle{


    //private final int speedLimit = 200;//or
    private static final int speedLimit;

    static {
        speedLimit = 200;
    }


    public int getSpeedLimit() {
        return speedLimit;
    }

//    public void setSpeedLimit(int speedLimit) {
//        this.speedLimit = speedLimit;//Cannot assign a value to final variable 'speedLimit'
//    }

    @Override
    public void accelerate() {

    }

    @Override
    public void decelerate() {

    }



}
