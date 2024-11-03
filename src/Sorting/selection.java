package Sorting;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int arr[] = {3, 6, 3, 1, 6, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int a[]){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if(a[j] < a[min]) min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

    }
}
