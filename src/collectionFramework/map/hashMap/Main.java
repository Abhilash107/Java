package collectionFramework.map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Unordered
        //not thread safety
        //O(1) -> put, get, remove, containsKey  (Average case)
        // if collision occurs then O(logN) --> worst case

        //containsValue -> O(n) Avg
        // ''  -> O(n) Worst

        //size() -> O(1)
        //isEmpty() -> O(1)


        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        map.put(4, 40);

        map.put(null, 50);
        map.put(null, 60);//replaces 50
        map.remove(null);

        boolean res = map.remove(1, 100);//as it's not in the map nothing happens
        System.out.println("Removed: "+ res);//false

        int getThree = map.get(3);
        System.out.println(getThree);//30


        System.out.println(map);


        System.out.println(map.get(10));// null

        System.out.println(map.containsKey(5));//false
        System.out.println(map.containsValue(50));//false

        //only value
        for (int i : map.keySet()) {
            System.out.print(map.get(i) + " ");
        }
        System.out.println();


        //both key and value
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }






    }
}
