package Multithreading.CountDownLatch;

import java.util.concurrent.*;

public class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfService = 3;
        ExecutorService ex = Executors.newFixedThreadPool(noOfService);
        CountDownLatch latch = new CountDownLatch(noOfService);

        ex.submit(new DependentService(latch));
        ex.submit(new DependentService(latch));
        ex.submit(new DependentService(latch));

        latch.await();
        //latch.await(4, TimeUnit.SECONDS);

        System.out.println("Main");
        ex.shutdown();

        //What it is
        //A synchronization aid that allows one or more threads to wait until a set of operations being performed in other threads completes.



    }
}

class DependentService implements Callable<String>{
    private final CountDownLatch latch;


    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" started");
        try {
            Thread.sleep(1000);
        }
        finally {
            latch.countDown();//decrements latch
        }


        return "OK";
    }
}
