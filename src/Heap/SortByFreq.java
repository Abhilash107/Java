package Heap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class SortByFreq {
    public static void main(String[] args) {

    }
    public int[] frequencySort(int[] nums) {
        int ans[] = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int x: nums){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>(
                (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b)
        );

        for(int key: map.keySet()){
            q.add(key);
        }

        int p = 0;
        while(!q.isEmpty()){
            int key = q.poll();
            int freq = map.get(key);
            for(int i = 0; i < freq;i++){
                ans[p++] = key;
            }

        }

        return ans;

    }
}
