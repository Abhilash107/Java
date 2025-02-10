package Recursion;

public class intro {
    public static void main(String[] args) {
        //printAscending(10);
        //System.out.println();
        printDescending(10);
    }

    public static void printAscending(int N){
        
        if (N == 0) return;  // Base case
        
        // Recursive call first to print in ascending order
        printAscending(N - 1);
        
        // Print after the recursive call to get numbers in ascending order
        System.out.print(N+" ");
    }

    public static void printDescending(int N){
        
        if (N == 0) return;  // Base case
        // Print before the recursive call to get numbers in descending order
        System.out.print(N+" ");
        // Recursive call to print in descending order
        printDescending(N - 1);
        
       
        
    }
}

