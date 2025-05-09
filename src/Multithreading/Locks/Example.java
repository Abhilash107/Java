package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example {

    private final Lock lock = new ReentrantLock();

    public void outer(){
        lock.lock();// 1
        try{
            System.out.println("Outer Method");
            inner();
        }
        finally {
            lock.unlock();// 1 -> 0
        }
    }

    public void inner(){
        lock.lock();// 1--> 2
        try{
            System.out.println("Inner Method");
        }
        finally {
            lock.unlock();// 2 --> 1
           // lock.unlock();// 1 --> 0
        }
    }


    public static void main(String[] args) {
        Example ex = new Example();
        ex.outer();
    }
}
