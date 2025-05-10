package Multithreading.UsingLambda;

import Multithreading.ThreadMethods.priorityThread;

public class ThreadWithLambda {
    public static void main(String[] args) {

        //Anonymous class
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t1 = new Thread(runnable1);



        Runnable runnable2 = () -> {
            System.out.println("Hello");
        };
        Thread t2 = new Thread(runnable2);



        Runnable runnable3 = () -> System.out.println("Hello");
        Thread t3= new Thread(runnable3);

        Thread t4 = new Thread(() -> System.out.println("Hello"));//noice way




    }



}
