package collectionFramework.list.vector;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(5, 3);
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(6, 7);
        //here capacity becomes double that means: 10, in ArrayList it's 1.5 times

        vector.remove(1);
        System.out.println(vector);
        vector.remove(Integer.valueOf(5));

        System.out.println(vector.size());
        vector.set(4, 10);

        System.out.println(vector.contains(10));



        System.out.println(vector);
        vector.clear();
        System.out.println(vector);

        System.out.println(vector.capacity());//Returns the current capacity(default 10)







        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Vector<Integer> vector1 = new Vector<>(list);
        System.out.println(vector1);

    }
}
