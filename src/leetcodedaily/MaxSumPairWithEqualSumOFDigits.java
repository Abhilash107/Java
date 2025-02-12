package leetcodedaily;

public class MaxSumPairWithEqualSumOFDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(909));
        System.out.println(maximumSum(new int[]{10, 23, 5}));
    }


        public static int sumOfDigits(int n){
            int sum = 0;
            while( n!= 0){
                sum += n%10;
                n /= 10;
            }

            return sum;
        }
        public static int maximumSum(int[] nums) {
        //Time O(N^3)
//            int max = -1;
//            for(int i = 0;i< nums.length;i++){
//                for(int j = i+1; j < nums.length;j++){
//
//                    if(sumOfDigits(nums[i]) == sumOfDigits(nums[j])){
//                        int sum = nums[i] + nums[j];
//                        if(max < sum) max = sum;
//                    }
//                }
//            }
//            return max;

            int max = -1;
            int sums[] = new int[nums.length];
            for(int i = 0;i < nums.length;i++){
                sums[i] = sumOfDigits(nums[i]);
            }

            for(int i = 0;i< sums.length;i++){
                for(int j = i+1; j < sums.length;j++){
                    if(sums[i] == sums[j]) {
                        int sum = nums[i] + nums[j];
                        if (max < sum) max = sum;
                    }
                }
            }

            return max;

        }



}
