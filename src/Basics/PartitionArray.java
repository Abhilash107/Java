package Basics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int nums[] = {10,20,30, 15,4,5,6};
        int pivot = 15;
        int n = nums.length;
        int[] left = new int[n];
        for(int i = 0; i < n;i++){
            if(nums[i] < pivot){
                left[i] = nums[i];
            }
        }

        System.out.println(Arrays.toString(left));

        int[] right = new int[n];
        for(int i = 0; i < n;i++){
            if(nums[i] >= pivot){
                right[i] = nums[i];
            }
        }

        System.out.println(Arrays.toString(right));

    }
}
