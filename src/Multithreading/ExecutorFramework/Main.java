package Multithreading.ExecutorFramework;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        //Implementing multithreading
        long start = System.currentTimeMillis();
//
        Thread[] threads = new Thread[19];//calculating factorial of 10 numbers

        for (int i = 1; i < 20; i++) {
            int finalNum = i;
            threads[i - 1] = new Thread(
                    () -> {
                        BigInteger res = factorial(finalNum);
                        System.out.println(res);
                    }
            );
            threads[i - 1].start();
        }

        //Now join them

        for (Thread t: threads){
            try{
                t.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        //System.out.println("SOUT directly: " + (System.currentTimeMillis() - start));
//        long end = System.currentTimeMillis();
//        System.out.println("After end and start: "+(end - start));
//        long timeTaken = end - start;
//        System.out.println("Stored: "+ timeTaken);


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
