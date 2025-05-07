package Multithreading;

import com.sun.source.doctree.ThrowsTree;

public class MyThread extends Thread {

    @Override
    public void run() {// cant use throws style here as it is overridden
        System.out.println("Running");
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());//New
        t1.start();
        System.out.println(t1.getState());//Runnable
        //There's no RUNNING state in JAVA
        //System.out.println(Thread.currentThread().getState());//Runnable

        Thread.sleep(100);
        System.out.println(t1.getState());// as 2 sec sleep so it's TIMED_WAITING
        t1.join();// main thread waits for t1 to terminate
        System.out.println(t1.getState());


    }
}
