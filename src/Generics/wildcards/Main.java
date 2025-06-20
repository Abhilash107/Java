package Generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public <T> T getFirst(ArrayList<T> list){
        return list.get(0);
    }
    //? -> only for read only

    public <T> void copy(ArrayList<T> src, ArrayList<T> dest){

        for (T item: src){
            dest.add(item);//as it is a write operation hence "?" can't be used here
        }
    }

    //Upper bound
    public double sum(List<? extends Number> numbers){
        double sum = 0;

        for(Number o: numbers){
            sum += o.doubleValue();
        }

        return sum;
    }

    //Lower bound
    public static void printNumbers(List<? super Integer> list){
        for(Object obj: list){
            System.out.println(obj);
        }
    }



    //Type Erasure: topic
    //Generic in Exceptions




}
