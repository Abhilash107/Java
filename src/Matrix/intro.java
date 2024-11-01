package Matrix;

import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter the no. of column: ");
        int col = sc.nextInt();

        int mat[][] = new int[row][col];
        //System.out.println(mat.length);

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0;j < mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for(int j = 0;j < mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
        }
        
        boolean res = isIdentity(mat);
        System.out.println("\n"+res);
        //check for sparse

    }
    public static boolean checkSparse(int mat[][]){
        int c = 0;
        int e =0;
        for(int i = 0;i < mat.length;i++){
            for (int j = 0; j < mat[i].length; j++) {
                e++;
                if(mat[i][j] == 0) c++;
            }
        }

        return c > (e/2);
    }

    public static boolean isIdentity(int mat[][]){
        // For in case if 0s and 1s
        // for(int i = 0;i<mat.length;i++){
        //     if(mat[i][i] != 0) return false;
        // }

        for(int i = 0;i<mat.length;i++){
            for(int j = 0; j < mat[i].length; j++) {
                if(i != j && mat[i][j] != 0) return false;
                else if(mat[i][j] != 1 && i == j) return false;
            }
        }

        return true;
    }
}
