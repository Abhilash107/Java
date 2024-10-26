package Arrays;

import java.util.HashMap;

public class uniqueElements {
    public static void main(String[] args) {
        // works if no of repetition is only 2
        // int[] a = {5,5,4,3,4};
        // int res = 0;
        // for (int i : a) {
        //     res ^= i;
        // }
        // System.out.println(res);
        int[] a = {1,2,3,4,5,6,7,5,4,4,3,3,2,1,3,4,5,6,7,9,6,5,4,5,4,3};
        System.out.println(findUnique(a));

    }

    public static int findUnique(int[] a){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        //count the frequencies
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        
        for (int key : map.keySet()) {
            if(map.get(key) == 1) return key;
        }

        return -1;
    }
}
