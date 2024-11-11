package Math;

public class CountPrimes {
    public static void main(String[] args) {
        
    }
    public static boolean checkPrime(int n){
        if(n <= 1) return false;
        int sqrt = (int)Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if(n % i == 0) return false;

        }
        return true;
    }
}
