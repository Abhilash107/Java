package Arrays;

public class SingleNumber {
    public static void main(String[] args) {
        //one number appears once others twice
        int a[] = {1,3,2,3,2,3, 2};
        int res = singleNumber(a);

        System.out.println(res);
    }

    public static int singleNumber(int[] nums) {
        int res = 0;// could be 0 or 1
        for(int x: nums)res ^= x;

        return res;
    }
}
