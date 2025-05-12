package Multithreading.ExecutorFramework;

public class RunnableTask implements Runnable{
    @Override
    public void run() {
        //Thread.sleep(1000);//can't add throws exception as it was not present on parent
        //Hence we use try catch
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
}
