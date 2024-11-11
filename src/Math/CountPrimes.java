package Math;

public class CountPrimes {
    public static void main(String[] args) {
        System.out.println(count(4));
    }
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }

    public static int count(int n){
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(checkPrime(i) == true) c++;
        }
        return c;
    }
}
