package BinarySearch;

public class SquareRoot {
    public static void main(String[] args) {
        int num = 25;
        int res = sqrt(num);

        System.out.println(res);
    }

    public static int sqrt(int n){
        if(n == 0 || n == 1)return n;

        int ans = 0;
        int l = 1, h = n/2;

        while(l <= h){
            int mid = l + (h - l)/2;

            if((long)mid * mid <= n){
                ans = mid;
                l = mid + 1;
            }
            else h = mid -1;
        }

        return ans;
    }
}
