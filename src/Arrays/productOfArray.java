package Arrays;

import java.util.Arrays;

public class productOfArray {
    public static void main(String[] args) {
        int arr[] = {1,0,3,4};
        int res [] = newProduct(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] product(int a[]){
        
        int newArr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int res = 1;
            for (int j = 0; j <a.length; j++) {
                if(j != i) res *= a[j];
            }
            newArr[i] = res;
            
        }

        return newArr;
    }


    public static int[] newProduct(int[] a){
        int product = 1;
        int zeroCount = 0;
        int res[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0) zeroCount++;
            else product *= a[i]; 
        }

        if (zeroCount == 2){
            for (int i = 0; i < a.length; i++) {
                res[i] = 0;
            }
        }
        else if (zeroCount == 1){
            for (int i = 0; i < a.length; i++) {
                if(a[i] == 0) res[i] = product;
                else res[i] = 0;
            }  
        }
        else{
            for (int i = 0; i < a.length; i++) {
                res[i] = product/a[i];
            }
        }
        return res;
    }
}
