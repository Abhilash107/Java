package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int a[] = {0, 1, 0,1,1,0,0,1};
        int res = findMaxConsecutiveOnes(a);

        System.out.println(res);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for(int x: nums){
            if(x == 1)sum+=1;
            else sum = 0;

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
