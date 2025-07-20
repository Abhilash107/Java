package BinarySearch;

public class LowerBound {
    public static void main(String[] args) {

    }
    public static int lowerBound(int []a, int target){
        int n = a.length;

        int ans = n;
        int l = 0, h = n-1;

        while(l <= h){
            int mid = l + ( h - l)/2;

            if(a[mid] >= target){
                ans = mid;
                h = mid - 1;
            }
            else l = mid + 1;
        }
        return ans;
    }
}
