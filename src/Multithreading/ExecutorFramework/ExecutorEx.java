package Multithreading.ExecutorFramework;

import java.math.BigInteger;
import java.util.concurrent.Executor;//interface like Lock
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorEx {
    public static void main(String[] args) {
        //Implementing multithreading
        long start = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);
        //Executor executor2 = Executors.newFixedThreadPool(3); less features than above

        for (int i = 1; i < 10; i++) {
            int finalNum = i;
           //executor2.execute(() -> {//can;t use shutdown method
            executor.submit(() -> {
                BigInteger res = factorial(finalNum);
                System.out.println(res);
            });

        }

        executor.shutdown();
        //executor.shutdownNow();
        //Attempts to stop all actively executing tasks, halts the processing of waiting tasks, and returns a list of the tasks that were awaiting execution.


        System.out.println(executor.isTerminated());
        //Returns true if all tasks have completed following shut down. Note that isTerminated is never true unless either shutdown or shutdownNow was called first.

        try{
            executor.awaitTermination(1, TimeUnit.SECONDS);
            //while(!executor.awaitTermination(1, TimeUnit.SECONDS)); Unlimited waiting
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        //Blocks until all tasks have completed execution after a shutdown request, or the timeout occurs, or the current thread is interrupted, whichever happens first.



        long timeTaken = System.currentTimeMillis() - start;
        System.out.println("Time taken: "+timeTaken);

    }

    public static BigInteger factorial(int num){
        BigInteger res = BigInteger.ONE;

        for (int i = 2; i <= num; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }

        return res;

    }
}
