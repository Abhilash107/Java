package Multithreading.ThreadMethods;

public class setDaemon extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("Hello world!");
        }
    }

    public static void main(String[] args) {
        setDaemon t1 = new setDaemon();
        t1.setDaemon(true);
//        setDaemon t2 = new setDaemon();
//        t2.start();
        t1.start();
        System.out.println("Main done...");//gets printed first then executes some run() tasks then stops the thread(background threads)
    }
}
