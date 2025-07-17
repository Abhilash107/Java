package BinarySearch;


public class NthRoot {
    public static void main(String[] args) {

        int res = Nth(3, 27);
        System.out.println(res);
    }

    public static int check(int mid, int n, int m){
        long ans = 1;

        for(int i = 1; i <= n;i++){
            ans = ans * mid;
            if(ans > m)return 0;//eliminate right half
        }

        if (ans == m) return 1;
        return 2;
    }

    public static int Nth(int n, int m){

        if(m == 0 || m == 1|| n == 1)return m;
        int l = 1;
        int h = (m > n) ? m / n : m;


        while(l <= h){
            int mid = l + (h - l)/2;

            int newMid = check(mid, n, m);
            if(newMid == 0)h = mid - 1;
            else if (newMid == 2) l = mid + 1;
            else return mid;
        }

        return -1;
    }
}
