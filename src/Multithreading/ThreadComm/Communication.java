package Multithreading.ThreadComm;

class ShareResource{
    private int data;
    private boolean hasData;

    public synchronized void produce(int value){
        while(hasData){//if data already in buffer
            try{
                wait();//waits before producing
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        data = value;
        hasData = true;//produced

        System.out.println("Produced : "+ value);
        notify();//if more than one consumer use notifyAll();
    }

    public synchronized int consume(){
        while(!hasData){//no data hence waits
            try{
                wait();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        hasData = false;//consumed
        System.out.println("Consumed: "+ data);
        notify();
        return data;

    }

}

class Producer implements Runnable{

    private ShareResource resource;

    public Producer(ShareResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }

}


class Consumer implements Runnable {
    private ShareResource resource;

    public Consumer(ShareResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}

public class Communication {
    public static void main(String[] args) {
        ShareResource resource = new ShareResource();
        Thread producerThread = new Thread(new Producer(resource));
        Thread consumerThread = new Thread(new Consumer(resource));

        producerThread.start();
        consumerThread.start();
    }
}



