package OOP.innerClass.staticInnerClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "pavilion", "windows");
        computer.getOS().display();
        //Imp it shows how directly string is passed as an arg in os attr

        // no need to create an instance of outer class
        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
