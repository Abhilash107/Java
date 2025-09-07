package Heap;

import java.util.*;

public class TopKreqElements {
    public static void main(String[] args) {
        int a[] = { 1,1,1,2,2,3,4};
        int res[] = topKFrequent(a, 2);
        System.out.println(Arrays.toString(res));

    }

    public static int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for (int key : map.keySet()) {
            pq.add(key);

            if (pq.size() > k) pq.poll();

        }
        //int p = 0;
        while (!pq.isEmpty()) {
            ans[--k] = pq.poll();

        }

        return ans;

    }
}