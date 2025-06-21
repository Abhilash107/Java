package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        //resizable
        //dynamic
        //

        ArrayList<Integer> intList = new ArrayList<>();

        //insert
        intList.add(10);
        intList.add(20);
        intList.add(30);
        intList.add(40);

        //get element and size
        System.out.println(intList.get(0));
        System.out.println(intList.size());

        //checking
        System.out.println(intList.contains(1));
        System.out.println(intList.isEmpty());

        //Remove
        intList.remove(2);//index not the element
        // to remove element we need to pass the args as an object
        // like in string's list, a string args is considered as a value not index
        //so in Integer list
        intList.remove(Integer.valueOf(30));

        //print
        for(int i = 0;i < intList.size();i++){
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();


        //for each
        for(Integer a: intList)// a is the element, not the index
            System.out.print(a+" ");

        System.out.println();


        // add at any position
        intList.add(2, 30);


        for(Integer a: intList)// a is the element, not the index
            System.out.print(a+" ");
        System.out.println();


        //set
         intList.set(2, 10);//replace

        //Sort
        Collections.sort(intList);
        intList.sort(null);


        // printing  --> uses toString() method internally
        System.out.println(intList);




        ArrayList<Integer> a = new ArrayList<Integer>(1000);
        //System.out.println(a.size());//0
        //System.out.println(a.get(0));//IndexOutOfBoundsException


        ArrayList<Integer> list = new ArrayList<>(4);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);


        System.out.println(list.size());



        // create new ArrayList

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        //list1.add("Wednesday");//not possible as it's a fixed size
        list1.set(1, "Wednesday");//replace possible


        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        //not insert and replace operation possible


        //comparing both types
        System.out.println(list.getClass().getName());//java.util.ArrayList
        System.out.println(list1.getClass().getName());//java.util.Arrays$ArrayList


        List<Integer> newList = new ArrayList<>();

        newList.addAll(integers);
        System.out.println(newList);
        System.out.println();



        //List to Array
        Object[] arr = intList.toArray();

    }
}
