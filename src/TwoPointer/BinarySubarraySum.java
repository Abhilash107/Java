package TwoPointer;

public class BinarySubarraySum {
    public static void main(String[] args) {

    }
    public static int numSubarraysWithSum(int[] a, int goal) {
        int l = 0, r = 0, sum = 0, cnt = 0;
        while(r < a.length){
            sum += a[r];
            while(sum > goal){
                sum -= a[l];
                l++;
            }
            cnt += r-l+1;
        }
        return cnt;

    }
}
