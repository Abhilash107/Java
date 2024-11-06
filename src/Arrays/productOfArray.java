package Arrays;

import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int res [] = product(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] product(int a[]){
        int res = 1;
        int newArr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int j = 0;
            while (j !=i && j <a.length) {
                res *= a[i];j++; 
            }
            newArr[j] = res;
            
        }

        return newArr;
    }
}
