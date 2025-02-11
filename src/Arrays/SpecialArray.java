package Arrays;

public class SpecialArray {
    public static void main(String[] args) {
        int nums[] = {4,3,1};
        System.out.println(isArraySpecial(nums));

    }
    public static boolean isArraySpecial(int[] nums) {
        int i = 1;
        while(i < nums.length){
            if((nums[i]%2!= 0  && nums[i-1]%2!= 0) || (nums[i]%2== 0  && nums[i-1]%2== 0)) return false;
            i++;
        }

        return true;
    }
}
