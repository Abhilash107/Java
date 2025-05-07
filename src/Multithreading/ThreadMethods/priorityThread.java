package Multithreading.ThreadMethods;

public class priorityThread extends Thread {

    public priorityThread(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + "  - Priority: "+ Thread.currentThread().getPriority());
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        priorityThread t1 = new priorityThread("Low priority");
        priorityThread t2 = new priorityThread("Mid priority");
        priorityThread t3 = new priorityThread("High priority");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        //Naming thread using constructor
        // start run sleep join setPriority interrupt




    }
}
