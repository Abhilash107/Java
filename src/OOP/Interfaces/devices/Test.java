package OOP.Interfaces.devices;

public class Test {
    public static void main(String[] args) {
        //Multiple inheritance
        SmartPhone sp = new SmartPhone();
        sp.makeCall(9876543210L);
        sp.endCall();

        sp.takePhoto();
        sp.recordVideo();

        sp.playMusic();
        sp.stopMusic();


    }
}
