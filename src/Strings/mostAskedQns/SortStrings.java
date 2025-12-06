package Strings.mostAskedQns;

import java.util.Arrays;
import java.util.HashMap;

public class SortStrings {
    public static void main(String[] args) {
        String str[] = {"a",
                "hello",
                "xy",
                "computer",

                "java",
                "worldwide",
                "hi",
                "programming",
                "cat"};
        //System.out.println(Arrays.toString(str));


        sortByLengthAsc(str);
        //System.out.println(Arrays.toString(str));

        sortByLengthDsc(str);
        //System.out.println(Arrays.toString(str));

        String arr[] = {"apple", "apple", "apple", "cat", "cat", "dog"};
        sortByFreqAsc(arr);
        System.out.println(Arrays.toString(arr));

        sortByFreqDsc(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void sortByLengthAsc(String s[]){
        Arrays.sort(s, (a,b) -> a.length() - b.length());
    }

    public static void sortByLengthDsc(String s[]){
        Arrays.sort(s, (a,b) -> b.length() - a.length());
    }

    public static void sortByFreqAsc(String str[]){
        HashMap<String, Integer> map = new HashMap<>();

        for(String s: str){
            map.put(s, map.getOrDefault(s, 0) +1);
        }

        Arrays.sort(str, (a,b) -> {
            int f1= map.get(a), f2 = map.get(b);

            if(f1 == f2)return a.compareTo(b);

            return Integer.compare(f1, f2);
        });
    }

    public static void sortByFreqDsc(String str[]){
        HashMap<String, Integer> map = new HashMap<>();

        for(String s: str){
            map.put(s, map.getOrDefault(s, 0) +1);
        }

        Arrays.sort(str, (a,b) -> {
            int f1= map.get(a), f2 = map.get(b);

            if(f1 == f2)return a.compareTo(b);

            return Integer.compare(f2, f1);
        });
    }
}
