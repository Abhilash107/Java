package Heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKreqElements {
    public static void main(String[] args) {

    }

    public int[] topKFrequent(int[] nums, int k) {
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
        int p = 0;
        while (!pq.isEmpty()) {
            ans[p] = pq.poll();
            p++;
        }

        return ans;

    }
}