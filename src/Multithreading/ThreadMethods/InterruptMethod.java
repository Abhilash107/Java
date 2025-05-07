package Multithreading.ThreadMethods;

public class InterruptMethod extends Thread{

    @Override
    public void run() {
//        System.out.println("Thread is running....");
//        try{
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }

        for (int i = 0;i < 5;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
//            A hint to the scheduler that the current thread is willing to yield its current use of a processor. The scheduler is free to ignore this hint.
        }
    }

    public static void main(String[] args) {
//        InterruptMethod t1 = new InterruptMethod();
//        t1.start();
//        t1.interrupt();//java.lang.InterruptedException: sleep interrupted

        InterruptMethod t1 = new InterruptMethod();
        InterruptMethod t2 = new InterruptMethod();

        t1.start();
        t2.start();

    }
}

        // without yield()
//Thread-1 is running
//Thread-1 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-1 is running

        // with yield() adds randomness i.e. gives chances to other threads
//Thread-0 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-0 is running
//Thread-1 is running
//Thread-1 is running
