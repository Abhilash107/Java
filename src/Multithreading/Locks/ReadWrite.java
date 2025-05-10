package Multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWrite {
    private int count = 0;
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try{
            count++;
            Thread.sleep(10);
        }
        catch (Exception e){Thread.currentThread().interrupt();}
        finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();//multiple thread can acquire it unlike normal lock
        try{
            return count;
        }
        finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) {
        ReadWrite obj = new ReadWrite() ;


        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    System.out.println(Thread.currentThread().getName()+ " -> " + obj.getCount());
                }
            }
        };

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10 ; i++) {
                    obj.increment();
                    System.out.println(Thread.currentThread().getName()+ " incremented");
                }
            }
        };

        Thread writeThread = new Thread(writeTask);
        Thread readThread1 = new Thread(readTask);
        Thread readThread2 = new Thread(readTask);


        writeThread.start();
        readThread1.start();
        readThread2.start();


        try {
            writeThread.join();
            readThread1.join();
            readThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace(); // or log/handle accordingly
            Thread.currentThread().interrupt(); // good practice
        }
        // writes first then reads



    }
}
