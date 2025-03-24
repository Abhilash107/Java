package Multithreading;

public class Test {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println(Thread.currentThread().getName());// main thread
        // to create new thread

        World world = new World();
        Thread t1 = new Thread(world);// need to create a new thread when implementing Runnable Interface
        t1.start();
        for(;;){//Infinite loop
            System.out.println("Hello ");
        }

//        for(;;){//Infinite loop (Unreachable statement)
//            System.out.println(Thread.currentThread().getName());
//        }




    }
}
