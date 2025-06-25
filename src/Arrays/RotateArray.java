package Arrays;


import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int a[], int k){

        int n = a.length;

        k = k % n;
        reverseArr(a, 0 , n-1);
        reverseArr(a, 0, k - 1);
        reverseArr(a, k, n - 1);


    }

    public static void reverseArr(int a[], int l, int r){
        while(l < r){
            int temp = a[l];
            a[l] = a[r];
            a[r] = temp;

            l++;
            r--;
        }

    }


}
