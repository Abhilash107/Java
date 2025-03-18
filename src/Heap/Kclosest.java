package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{
    int diff, element;
    Pair(int d, int n){
        this.diff = d;
        this.element = n;

    }


    public int compareTo(Pair other) {
        // Sort by absolute difference in descending order
        if (this.diff != other.diff) {
            return other.diff - this.diff; // Max-heap behavior
        }
        return other.element - this.element; // If same diff, sort larger number first
    }
}

public class Kclosest {
    public static void main(String[] args) {
        int a[] = { 5,6,7,8,9};
        //List<Integer> ans = findClosestElements(a, 3, 7);
        List<Integer> ans = findClosestElementsII(a, 3, 7);
        System.out.println(ans);


    }


    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> q = new PriorityQueue<>();

        for(int num: arr){
            q.add(new Pair(Math.abs(num - x), num));

            if(q.size() > k) q.poll();

        }

        List<Integer> list = new ArrayList<>();
        //int size = 0;
        while(!q.isEmpty()){
            Pair pair = q.poll();
            list.add(pair.element);
        }

        Collections.sort(list);
        return list;

    }

    //Using Binary Search
    public static List<Integer> findClosestElementsII(int[] arr, int k, int x) {
        int l = 0, r = arr.length - 1;
        while(r - l >= k){
            if(Math.abs(arr[l] - x) > Math.abs(arr[r] - x)) l++;
            else r--;
        }

        List<Integer> list = new ArrayList<>();
        for(int i = l; i <= r; i++){
            list.add(arr[i]);
        }

        return list;
    }







}
