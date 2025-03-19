package Heap;

import java.util.PriorityQueue;

public class KClosestToOrigin {
    public static void main(String[] args) {

    }
    public int[][] kClosest(int[][] points, int k) {
        int ans[][] = new int[k][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
                Integer.compare((b[0] * b[0] + b[1] * b[1]), (a[0] * a[0] + a[1] * a[1])));
        for(int point[]: points){
            pq.add(point);
            if(pq.size() > k)pq.remove();
        }

        for (int i = 0;i < k;i++){
            ans[i] = pq.poll();
        }

        return ans;
    }
}
