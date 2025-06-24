package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = {1,1,2, 2, 3 , 8 ,9 ,9 ,9 };
        System.out.println(removeDuplicates(a));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;

        int cnt = 0;
        for(int i = 1;i < n;i++){
            if(nums[i-1] == nums[i])cnt++;
        }

        return n - cnt;

    }
}
