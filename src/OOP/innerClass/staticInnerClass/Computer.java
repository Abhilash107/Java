package OOP.innerClass.staticInnerClass;


public class Computer {
    private String brand;
    private String model;

    private OperatingSystem os;

    public OperatingSystem getOS() {
        return os;
    }

    public Computer(String brand, String model, String os){
        this.brand = brand;
        this.model = model;
        //this.os = os;//Required type OperatingSystem
        this.os = new OperatingSystem(os);

    }

    //static inner class
    static class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }

        public void display(){
            System.out.println("USB Type: "+ type);
        }
    }

    //member inner class
     class OperatingSystem{
        private String osName;

        public OperatingSystem(String osName){
            this.osName = osName;
        }

        public void display() {
            System.out.println(brand + "  "+ model + "   " + osName);
        }
    }

}
