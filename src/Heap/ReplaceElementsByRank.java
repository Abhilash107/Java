package Heap;

import java.util.*;

class rankPair {
    int value;
    int index;

    public rankPair(int value, int index) {
        this.value = value;
        this.index = index;
    }
}
public class ReplaceElementsByRank {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int a[] = replaceWithRank(new int[]{20,15, 26, 2, 98, 6}, 6);
        System.out.println(Arrays.toString(a));
    }
    public static int[] replaceWithRank(int arr[], int N) {
        // code here
        int ans[] = new int[N];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->  a - b);

        HashSet<Integer> set = new HashSet<>();
        //Avoided duplicate ranking

        //Used HashSet<Integer> to store only unique elements before adding them to PriorityQueue.
        //This ensures each number gets a single unique rank.

        for(int i = 0;i < N;i++){
            if(!set.contains(arr[i])){
                pq.add(arr[i]);
                set.add(arr[i]);
            }

        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int ptr = 1;
        while(!pq.isEmpty()){
            //rankPair r = pq.poll();
            map.put(pq.poll(), ptr++);
        }

        for(int i = 0;i < N;i++){
            ans[i] = map.get(arr[i]);
        }

        return ans;

    }

    public int[] replaceWithRankII(int arr[], int N){
        int[] ans = new int[N];

        // Use TreeSet to store unique elements in sorted order
        TreeSet<Integer> sortedSet = new TreeSet<>();
        for (int num : arr) {
            sortedSet.add(num);
        }

        // Assign ranks using a HashMap
        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedSet) {
            rankMap.put(num, rank++);
        }

        // Assign ranks back to original array
        for (int i = 0; i < N; i++) {
            ans[i] = rankMap.get(arr[i]);
        }

        return ans;
    }
}
