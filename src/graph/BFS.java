package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= V; i++)
            adj.add(new ArrayList<>());

        adj.get(1).add(2);
        adj.get(1).add(4);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(1);
        adj.get(4).add(3);

        System.out.println(adj);
        bfs(1, adj, 4);

    }
    public static void bfs(int start, ArrayList<ArrayList<Integer>> adj, int nodes){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[nodes + 1];

        visited[start] = true;
        queue.add(start);

        while(!queue.isEmpty()){
            int node = queue.poll();

            System.out.print(node + " ");

            for (int nn: adj.get(node)){
                if(!visited[nn]){
                    visited[nn] = true;
                    queue.add(nn);
                }
            }
        }

    }

}
