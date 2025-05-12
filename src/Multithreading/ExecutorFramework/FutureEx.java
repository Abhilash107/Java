package Multithreading.ExecutorFramework;

import com.sun.security.jgss.GSSUtil;

import java.util.concurrent.*;

public class FutureEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();

        Future<?> future = ex.submit(() -> 42);//<datatype> or <?>

//      Runnable run = () -> 42;//error
        Callable<Integer> callable = () -> 42;
//      Future<Integer> future = ex.submit(callable);



        if(future.isDone()){
            System.out.println("Task completed.");
        }
        System.out.println(future.get());//Waits if necessary for the computation to complete, and then retrieves its result.
        ex.shutdown();
        //third type of sunmit
        Future<Object> submit = ex.submit(()-> System.out.println("hello"), "success");




    }
}
