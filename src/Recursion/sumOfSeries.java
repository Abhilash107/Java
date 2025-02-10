package Recursion;

public class sumOfSeries {

    public static void main(String[] args) {
        long res = sumOfSeries(5);
        System.out.println(res);
        System.out.println(sumOFSeriesAlternative(5));
    }

    public static long sumOfSeries(long n) {
        if(n == 0) return 0;
        //calculates the sum for the previous numbers.
        long sum = sumOfSeries(n-1);
        //After the recursive call, you add n^3 to the current sum.
        sum += (long)Math.pow(n, 3);

        return sum;
    }

    public static long sumOFSeriesAlternative(long n){
        if(n == 1)return 1;
        return n + sumOFSeriesAlternative(n-1);
    }

}


