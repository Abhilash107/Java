package Sorting;

import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int arr[] = {3, 6, 3, 1, 6, 8};
        bubbleSort(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] a, int n){
        for (int i = n-1; i >= 0; i--) {
            int swappedCount = 0;
            for (int j = 0; j < i; j++) {
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swappedCount = 1;
                }
            }
            if(swappedCount == 0) break;
        }
    }
}
