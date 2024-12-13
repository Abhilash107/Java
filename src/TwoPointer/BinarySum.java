package TwoPointer;

import java.util.HashMap;

public class BinarySum {
    public static void main(String[] args) {
        int []a = {1, 0, 1, 0, 1};
        System.out.println(helper(a, 2));


    }
    public static int numSubarraysWithSum(int[] nums, int goal) {
        //Prefix sum algorithm
        int preSum = 0, cnt = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < n; i++) {
            preSum += nums[i];
            int rem = preSum - goal;
            cnt += map.getOrDefault(rem, 0);
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }

    public static int numSubArraysWithSumOptimalVersion(int[] nums, int goal) {
        //Two pinter and sliding window approach
        if(goal < 0) return 0;
        int l = 0, r = 0, sum = 0, cnt = 0;
        int n = nums.length;
        while(r < n){
            sum += nums[r];
            while(sum > goal){
                sum = sum - nums[l];
                l += 1;
            }
            cnt += (r - l + 1);
            r += 1;
        }
        return cnt;
    }
    public static int helper(int []nums, int goal){
        return numSubArraysWithSumOptimalVersion(nums, goal) - numSubArraysWithSumOptimalVersion(nums, goal -1);
    }

}
