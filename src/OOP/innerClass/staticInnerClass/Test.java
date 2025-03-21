package OOP.innerClass.staticInnerClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "pavilion", "windows");
        computer.getOS().display();
        //Imp it shows how directly string is passed as an arg in os attr


        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
