package collectionFramework.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s, String t) {
        //ascending =>  s - t
        //descending => t - s

        return t.length() - s.length();
    }
}

class MyComparator implements Comparator<Integer>{


    @Override
    public int compare(Integer o1, Integer o2) {
        // 0 => same
        // +ve => o1 > o2
        // -ve => o1 < o2

        return o2- o1;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(3);

        //list.sort(null);
        System.out.println(list);

        // for descending order using Comparator
        //list.sort(new MyComparator());


        // for descending order using lambda
        list.sort((a, b) -> a - b);//ascending
        list.sort((a, b) -> b - a);//descending
        System.out.println(list);



        // Example 2
        List<String> words = Arrays.asList("banana", "apple", "date");
        System.out.println(words);

        //using comparator
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //using lambda

        //ascending
        words.sort((a, b) -> a.length() - b.length());
        System.out.println(words);

        //descending
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);





    }
}
