package OOP.innerClass.staticInnerClass;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer("HP", "pavilion", "windows");
        computer.getOS().display();


        Computer.USB usb = new Computer.USB("TYPE-C");

    }
}
