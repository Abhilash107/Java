package Questions.tcs;

import java.util.Scanner;

public class SumOfGPSeries {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first term: ");
        int a = scanner.nextInt();
        System.out.println("Enter the common ratio: ");
        int r = scanner.nextInt();
        System.out.println("Enter the number of terms");
        int n = scanner.nextInt();


        System.out.println("Enter the sum of series: " + sumOfGP(a, r, n));
    }
    private static double sumOfGP(int a, int r, int n){
        if(r == 1)
            return a * n;
        return a * (Math.pow(r, n) - 1)/(r -1);
    }
}
