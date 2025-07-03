package collectionFramework.map.linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap= new LinkedHashMap<>(11,  0.3f, true);
        //ordered
        //subclass of hashMap
        //a doubly linked list
        //slower due to overhead than hashMap

        linkedHashMap.put("A", 10);
        linkedHashMap.put("B", 20);
        linkedHashMap.put("C", 30);

        //after using accessOrder == true, if we try to get some value
        //then a mechanism is followed known as LRU which return the
        // least recently used values


        for(Map.Entry<String,Integer> entry: linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }


        HashMap<String , Integer> hashMap = new HashMap<>();

        LinkedHashMap<String , Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap);


    }
}
