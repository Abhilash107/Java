package Stack;

public class sumOfSubarrays {
    public static void main(String[] args) {
        int a[] = {3,1,2,4};
        System.out.println(sumSubarrayMins(a));
    }
    public static int sumSubarrayMins(int[] arr) {
        //Not optimal as Time limit exceeded
        long MOD = 1_000_000_007;
        long sum = 0;
        for(int i = 0;i < arr.length;i++){
            long min = Long.MAX_VALUE;
            for (int j = i+1;j < arr.length;j++){
                min = Math.min(Math.min(arr[i], arr[j]), min);
                sum = (sum + min) % MOD;;
            }

        }
        for (int x: arr){
            sum += x;
        }

        return (int)sum;

    }
}
