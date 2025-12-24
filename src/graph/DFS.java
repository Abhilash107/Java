package graph;

import java.util.ArrayList;

public class DFS {
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
        boolean visted[]= new boolean[V+1];

        ArrayList<Integer> ans = new ArrayList<>();

        dfs(1, visted, adj, ans);
        System.out.println(ans);


    }
    public static void dfs(int node, boolean visited[], ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans){
        visited[node] = true;
        ans.add(node);

        for(int dn: adj.get(node)){
            if(!visited[dn]){
                dfs(dn, visited, adj, ans);
            }
        }

    }
}
