package Basics;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //a, b is stored in Stack whereas the elements are stored in heap
        //Address: in hexadecimal format


        int []a = {1,2,3,4,5};
        int []b = new int[10];

        b[2] = 10;

//        for(int x: b){
//            System.out.println(x);
//        }

        for(int i =0;i < a.length;i++){
            System.out.println(a[i]);
        }


        System.out.println(a);//Address [I@4dd8dc3
        //[ -> Array
        // I -> Integer type
        // @ -> hash code

//        int[][] mat = new int[3][3];
//
//        for (int i = 0;i < mat.length; i++){
//            for(int j = 0;j < mat[i].length;j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0;i < mat.length; i++){
//            for(int j = 0;j < mat[i].length;j++){
//                System.out.print(mat[i][j]+ " ");
//            }
//            System.out.println();
//        }
//        System.out.println();


        int[][] mat = {
                {1,2,3},
                {4,5,6}

        };

//        for (int i= 0; i < mat.length;i++){
//            for (int j= 0; j < mat.length;j++){
//                //System.out.println(mat[i][j]);// 1 2 4 5
//            }
//        }

        //best practice
//        for (int i= 0; i < mat.length;i++){
//            for (int j= 0; j < mat[i].length;j++){
//                System.out.println(mat[i][j]);//1 2 3 4 5 6
//            }
//        }

        //IMP: Matrix with diff column size

        int[][] newMat = new int[4][];
        newMat[0] = new int[1];
        newMat[1] = new int[2];
        newMat[2] = new int[3];
        newMat[3] = new int[4];


        for (int i = 0; i < newMat.length; i++) {
            for(int j = 0;j < newMat[i].length;j++){
                System.out.print("*");
            }
            System.out.println();
        }










    }
}
