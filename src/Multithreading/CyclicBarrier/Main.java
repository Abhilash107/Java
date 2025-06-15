package Multithreading.CyclicBarrier;

import java.util.concurrent.*;

public class Main{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int noOfService = 3;
        ExecutorService ex = Executors.newFixedThreadPool(noOfService);

        CyclicBarrier barrier = new CyclicBarrier(noOfService);

        //A synchronization aid that allows a set of threads to all wait for each other to reach a common barrier point.
        //CyclicBarriers are useful in programs involving a fixed sized party of threads that must occasionally wait for each other.
        // The barrier is called cyclic because it can be re-used after the waiting threads are released.

//        A barrier that allows a set of threads to all wait for each other to reach a common point (the barrier).
//
//        Once all threads have called await(), the barrier is tripped and the threads are released.
//
//        Unlike CountDownLatch, CyclicBarrier can be reused (cyclic) after the barrier is broken.

        ex.submit(new DependentService(barrier));
        ex.submit(new DependentService(barrier));
        ex.submit(new DependentService(barrier));


        System.out.println("Main");
        ex.shutdown();


    }
}

class DependentService implements Callable<String>{
    private final CyclicBarrier barrier;


    public DependentService(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" started");

        Thread.sleep(1000);

        System.out.println(Thread.currentThread().getName()+" is waiting for barrier");
        barrier.await();//Waits until all parties have invoked await on this barrier.
        return "OK";
    }
}
