package Recursion;

import java.util.*;

public class Subsets {

    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsBitManipulation(int[] nums) {
        //Bit manipulation

         List<List<Integer>> list = new ArrayList<>();
         int n = nums.length;
         for(int num = 0; num < (1 << n);num++){
             List<Integer> subsets = new ArrayList<>();
             for (int i = 0; i < n; i++) {
                 if((num & ( 1 << i)) != 0){
                     subsets.add(nums[i]);
                 }
             }
             list.add(subsets);

         }
         return list;

    }



    public List<List<Integer>> subsetsRecursion(int[] nums) {

        //Recursive
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        getSubSets(0, nums, n, list, new ArrayList<Integer>());
        return list;


    }


    public void getSubSets(int ind, int a[], int n, List<List<Integer>> ans, List<Integer> temp){
        if(ind >= n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(a[ind]);
        getSubSets(ind + 1, a, n, ans, temp);
        temp.remove(temp.size() - 1);

        getSubSets(ind + 1, a, n, ans, temp);

    }
}
