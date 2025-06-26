package Arrays;

public class LongestSubArrayWithSum {
    public static void main(String[] args) {
        int a[] = {1,3,4,4,5,6};
        System.out.println(length(a, 8));
    }

    public static int length(int a[], int k){
        int n = a.length;
        int l = 0, r = 0;

        int maxLength = 0, sum=0;
        for (r =0; r < n;r++){

            sum+= a[r];

            while (sum > k){
                sum -= a[l];
                l++;
            }

            if(sum == k)maxLength = Math.max(maxLength, r - l +1);


        }
        return maxLength;
    }
}
