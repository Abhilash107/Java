package Questions.tcs;

import java.util.Scanner;

public class SumOfAPSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first term: ");
        int a = scanner.nextInt();
        System.out.println("Enter the common difference: ");
        int d = scanner.nextInt();
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();


        System.out.println("Enter the nth term: " + nthTerm(a, d, n));
        System.out.println("Enter the sum of series: " + sumOFAp(a, d, n));
        System.out.println("Enter the last term");
        int l = scanner.nextInt();
        System.out.println("Enter the sum of series: " + sumOFApII(a, l, n));

    }

    private static int nthTerm(int a, int d, int n){
        return a + (n-1)*d;
    }
    private static int sumOFAp(int a, int d, int n){
        return (n * (2*a + (n-1)*d))/2;
    }

    private static int sumOFApII(int a, int l, int n){
        return (n * (a + l))/2;
    }
}
