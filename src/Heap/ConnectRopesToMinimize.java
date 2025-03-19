package Heap;



import java.util.PriorityQueue;

public class ConnectRopesToMinimize {
    public static void main(String[] args) {

        int a[] = {4, 3, 2, 6};
        System.out.println(minCost(a));
    }
    public static int minCost(int[] arr) {
        int minCost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int x: arr){
            pq.add(x);
        }
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            minCost += first + second;
            pq.add(first + second);
        }

        return minCost;
    }
}
