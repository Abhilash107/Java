package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MainEx {
    public static void main(String[] args) {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Worker Thread");
            }
            return "0k";
        });

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Worker Thread");
            }
            return "0k";
        });

        CompletableFuture<Void> future = CompletableFuture.allOf(f1, f2);
        future.join();//No need to check exception
        //Returns the result value when complete, or throws an (unchecked) exception if completed exceptionally. To better conform with the use of common functional forms, if a computation involved in the completion of this CompletableFuture threw an exception, this method throws an (unchecked)
        //future.get();//Need to check for exception
        System.out.println("Main");


        try {
            String f3 = CompletableFuture.supplyAsync(() -> {
                try{
                    Thread.sleep(2000);
                    System.out.println("Worker Thread");
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();

                }
                return "0k";
            }).get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");


//        try {
//            String f3 = CompletableFuture.supplyAsync(() -> {
//                try{
//                    Thread.sleep(2000);
//                    System.out.println("Worker Thread");
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//
//                }
//                return "0k";
//            }).thenApply(x -> x + x);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Main");


        //Executors with CompleteFuture

    }
}
