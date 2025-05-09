package Multithreading.Synchronization;

public class Counter{
    private int count = 0;

//    public void increment(){
//        count++;
//    }

    //SYNCHRONIZATION
//    public synchronized void increment(){
//        count++;
//    }
    // or

    public void increment(){
        synchronized (this){//to ensure the synchronization of a particular block
            count++;//CRITICAL SECTION
        }
        //can add rest codes....

    }

    public int getCount(){
        return count;
    }


}
