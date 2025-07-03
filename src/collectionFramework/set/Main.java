package collectionFramework.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        //no duplicates
        //faster operations
        // Map--> Hashmap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
        //unordered
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        for(int i : set)
            System.out.println(i);

        //to main order use LinkedHashSet
        Set<Integer> set1 =new LinkedHashSet<>();

    }
}
