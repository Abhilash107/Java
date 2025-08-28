package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int a[] = { 7, 4, 10, 15, 20, 3};
        //int res = findKthSmallest(a, 3);
        int res = findKthSmallestUsingHeap(a, 3);
        System.out.println(res);
    }
    public static int findKthSmallest(int a[], int k){
        Arrays.sort(a);
        return a[k - 1];
    }

    public static int findKthSmallestUsingHeap(int []a, int k){
        if (a == null || a.length == 0 || k <= 0 || k > a.length) {
            return -1;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for(int x: a){

            heap.add(x);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int res = heap.isEmpty() ? -1 : heap.peek();
        return res;
    }
}
