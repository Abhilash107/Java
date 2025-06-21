package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);

        list.sort(null);

        System.out.println(list);


        //Comparator



    }
}
