package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4, 3};

        System.out.println(Arrays.toString(nextGreaterElements(a)));
    }
    public static int[] nextGreaterElements(int[] nums) {
        // int res[] = new int[2 * nums.length];
        // int ans[] = new int[nums.length];
        // int n = nums.length;
        // int i = 0;

        // for(i = 0;i < n;i++){
        //     res[i] = nums[i];
        // }
        // for(int j = 0;j < n;j++){
        //     res[i++] = nums[j];
        // }
        // for(int k = 0;k < n;k++){
        //     for(int j = k;j < res.length;j++){
        //         if(nums[k] < res[j]){
        //             ans[k] = res[j];break;
        //         }
        //         else{
        //             ans[k] = -1;
        //         }
        //     }
        // }

        // return ans;


        // if(nums.length == 1)return new int[]{-1};

        // int ans[] = new int[nums.length];
        // int n = nums.length;

        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < i + n; j++) {
        //         if (nums[j % n] > nums[i]) {
        //             ans[i] = nums[j % n];
        //             break;
        //         }
        //         else{
        //             ans[i] = -1;
        //         }
        //     }
        // }

        // return ans;
        int n = nums.length;
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[n];

        for (int i = 2*n -1; i >= 0;i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i%n]){
                stack.pop();
            }

            if(i < n){
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[i%n]);
        }

        return ans;//same as before but here a hypothetical double sized array is taken as consideration
    }
}
