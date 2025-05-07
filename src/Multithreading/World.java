package Multithreading;


//public class World extends Thread{
//
//    @Override
//    public void run() {
//
//        for(; ;){
//            System.out.println("World!");
//        }
//    }
//}

public class World implements Runnable{

    @Override
    public void run() {

        for(; ;){ // 3. running
            System.out.println("World!");
        }
    }
}
