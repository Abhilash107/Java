package Multithreading.Synchronization;

public class Test {
    public static void main(String[] args) {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);//same obj is shared with both threads
        MyThread t2 = new MyThread(counter);//both are getting executed simultaneously
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(counter.getCount());//random answers
        System.out.println(counter.getCount());//2000





    }
}
