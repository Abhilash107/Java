package Sorting;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int arr[] = {3, 6, 3, 1, 6, 8};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            int j = i;
            while(j > 0 && a[j-1] > a[j]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
    }
}
