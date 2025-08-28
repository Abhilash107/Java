package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class SortKthSortedArr {
    public static void main(String[] args) {
        int a[] = {6,3,2,8,10,9};

        int ans[] = sortedArr(a, 3);
        System.out.println(Arrays.toString(ans));


    }

    public static int []sortedArr(int a[], int k){
        if(a == null || k <= 0) return new int[] {-1,-1};

        int n = a.length;
        int ind = 0;
        int res[] = new int[n];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int x: a){
            minHeap.add(x);

            if(minHeap.size() > k){
                res[ind++] = minHeap.poll();
            }
        }

        while (!minHeap.isEmpty())res[ind++] = minHeap.poll();
        return res;
    }
}
