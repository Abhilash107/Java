package Multithreading.ThreadMethods;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread is running....");
        for (int i = 1;i <= 5;i++){
            System.out.println(i);//gets printed after 1sec
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        t1.join();//main thread waits for t1 to terminate
        System.out.println("Counting finished");

    }
}
