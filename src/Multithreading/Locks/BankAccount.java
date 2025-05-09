package Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance = 100;

    //here a thread might take a more than required time so we need to add lock system to it.
//    public synchronized void withdraw(double amount){
//        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);
//
//        if(balance >= amount){
//            System.out.println(Thread.currentThread().getName() + " proceeding to withdrawal ");
//            try{
//                Thread.sleep(10000);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//            balance -= amount;
//            System.out.println("Remaining balance: "+ balance);
//        }
//        else{
//            System.out.println(Thread.currentThread().getName()+ " insufficient balance");
//
//        }
//    }

    //Adding LOCK system--->


    private final Lock lock = new ReentrantLock();

    public  void withdraw(double amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw "+ amount);

        try{

            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){//2.
                if(balance >= amount){
                    try{
                        System.out.println(Thread.currentThread().getName() + " proceeding to withdrawal ");
                        Thread.sleep(10000);

                        balance -= amount;
                        System.out.println("Remaining balance: "+ balance);
                    }
                    catch (Exception e){
                        //System.out.println(e);
                        Thread.currentThread().interrupt();//best practice
                    }
                    finally {
                        lock.unlock();// need to unlock the obj after execution // 3.
                    }

                }else {
                    System.out.println(Thread.currentThread().getName()+ " insufficient balance");
                }
            }

            else {
                System.out.println(Thread.currentThread().getName()+ " couldn't acquire the lock, will try later.");
            }

        }catch (Exception e){
            //System.out.println(e);
            Thread.currentThread().interrupt();
        }
    }

    //lock.tryLock() //1
    //Acquires the lock only if it is free at the time of invocation.
//    Acquires the lock if it is available and returns immediately with the value true. If the lock is not available then this method will return immediately with the value false.

    //lock.tryLock(time, TIMEUnit.____)

//    Acquires the lock if it is free within the given waiting time and the current thread has not been interrupted.
//    If the lock is available this method returns immediately with the value true.


    //interrupt() : ->
//    interrupt() is a method used to signal a thread that it should stop what it's doing or check if it should stop.
//    It doesn't forcibly stop the thread — it sets an "interrupted flag", and it's up to the thread to check that flag and respond appropriately.


}
