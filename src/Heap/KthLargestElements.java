package Heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElements {
    public static void main(String[] args) {
        int a[] = { 7, 4, 10, 15, 20, 3};
        //int res = findKthSmallest(a, 3);
        int res[] = findKthLargestElementsUsingHeap(a, 3);
        System.out.println(Arrays.toString(res));
    }
    public static int []findKthLargestElementsUsingHeap(int []a, int k){
        if(a == null || a.length == 0 || k <= 0 || k > a.length)return new int[]{-1, -1};

        int res[] = new int[k];

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int x: a){
            minHeap.add(x);

            while(minHeap.size() > k) minHeap.poll();

        }

        int x = 0;
        while(!minHeap.isEmpty()){
            res[x++] = minHeap.poll();
            //res[--k] = minHeap.poll();// for descending order
        }
        return res;



    }
}
