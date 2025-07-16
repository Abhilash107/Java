package BinarySearch;

public class MinimumElementInRotatedArray {
    public static void main(String[] args) {

    }
    public static int findMin(int[] a) {
        int n = a.length;

        int l = 0, h = n - 1;
        int ans = Integer.MAX_VALUE;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(a[l] <= a[mid]){
                ans = Math.min(ans, a[l]);

                l = mid + 1;
            }
            else{
                ans = Math.min(ans, a[mid]);
                h = mid - 1;
            }

        }

        return ans;
    }
}
