package Heap;

import java.util.PriorityQueue;

public class SumOfBetweek1thAndk2SmallestElements {
    public static void main(String[] args) {
        long arr[] = {10, 2, 50, 12, 48, 13};
        System.out.println(sumBetweenTwoKth(arr,  arr.length, 2, 6));
    }
    public static long sumBetweenTwoKth(long A[], long N, long K1, long K2) {
        //GIVEN k2 > k1
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b)->Long.compare(b, a));

        for(long a: A){
            pq.add(a);
            if(pq.size() >= K2){
                pq.poll();
            }

        }

        long sum = 0;
        while(pq.size() > K1){
            sum += pq.poll();
        }

        return sum;


    }

}
