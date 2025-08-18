package OOP.innerClass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("Sedan");
        Car.Engine engine = car.new Engine();//obj is created with the help of instance of outer class
        engine.start();
        engine.start();
        engine.stop();

        //OR

        Car.Engine eng = new Car("Sedan").new Engine();
        eng.start();
        eng.start();
        eng.stop();

    }
}
