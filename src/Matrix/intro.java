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
        System.out.println(mat.length);
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
        



    }
}
