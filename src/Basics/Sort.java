package Basics;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2, 5, 8, 8, 9};
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for(int x : a){
            if(min > x) min = x;
            if(max < x) max = x;
        }
        System.out.println(min + " " + max);

        int newArr[] = new int[max + 1];
        for(int i = 0;i < a.length;i++){
            newArr[a[i]] += 1;
        }
        System.out.println(Arrays.toString(newArr));

        int k = 0;
        for(int i = 0;i < newArr.length;i++){
            if(newArr[i] != 0){
                int data = newArr[i];
                while (data-- != 0)a[k++] = i;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
