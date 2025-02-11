package Math;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(0));
    }
    public static int trailingZeroes(int n) {
        if( n == 0) return 0;
        int fact = 1;
        for(int i = 2;i <= n;i++){
            fact *= i;
        }

        int count = 0;
        int temp = fact;
        while(temp%10 == 0){
            count++;
            temp /= 10;
        }

        return count;
    }
}
