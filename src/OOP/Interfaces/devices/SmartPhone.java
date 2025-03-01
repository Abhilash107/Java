package OOP.Interfaces.devices;



public class SmartPhone implements Phone, MusicPlayer, Camera {
    //Class cannot extend multiple classes
    //So we r using interface


    @Override
    public void takePhoto() {
        System.out.println("taking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording video");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone..");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void makeCall(long number) {
        System.out.println("calling: "+ number);
    }

    @Override
    public void endCall(){
        System.out.println("Ending call");
    }


}
