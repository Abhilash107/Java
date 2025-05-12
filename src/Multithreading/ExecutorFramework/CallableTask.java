package Multithreading.ExecutorFramework;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public Object call() throws Exception {
        Thread.sleep(2000);
        return 0;
    }
}
