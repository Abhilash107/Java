package Basics;

import java.util.ArrayList;

public class Siuuu {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        for(int i = 0;i < 5;i++){
//            list.add(i+1);
//        }
//
//        //System.out.println(list);
//        for(int i = 0;i < 2;i++){
//            int x = list.get(0);
//            list.remove(0);
//            list.add(x);
//        }
//        System.out.println(list);
//        int a, b;
//        a = b = 10;

        //1.
//        try {
//            System.out.println("Inside");
//            throw new RuntimeException("Error");
//        }
//        finally {
//            System.out.println("Inside finally");
//        }
        //o/p:
//        Inside
//        Inside finally

        //2.
//        try{
//            System.exit(0);
//        }
//        finally {
//            System.out.println("Finally executed");//no output
//        }

        Integer i =  10;
        Integer j =  20;

        swap(i, j);

        System.out.println(i + " " + j);// no change 10 20






    }
    public static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
