package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        matrixRepresentation();
    }

    public static void matrixRepresentation(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes: ");
        int nodes = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int edges = sc.nextInt();

        int mat[][] = new int[nodes+1][nodes+1];

        for(int i = 0; i < edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            mat[u][v] = mat[v][u] = 1;
        }

        for(int i = 1;i <= nodes;i++){

            for(int j = 1 ; j <= nodes;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();


    }
    public static void adjacencyListRepresentation(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes: ");
        int nodes = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int edges = sc.nextInt();

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0;i < nodes;i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges;i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        for(int i = 0;i < nodes;i++){
            System.out.print(i + " -> ");
            for(int j: adj.get(i)){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
