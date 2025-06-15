package Multithreading.CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        CompletableFuture<String> str = CompletableFuture.supplyAsync(() -> {
            try{
                Thread.sleep(2000);
                System.out.println("Worker Thread");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            }
            return "0k";
        });

        String res = null;
        try{
            res = str.get();

        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        catch (ExecutionException e){
            throw new RuntimeException(e);
        }

        System.out.println(res);
        res = str.getNow("Sorry no results....");
        System.out.println(res);
        System.out.println("Main");



    }
}
