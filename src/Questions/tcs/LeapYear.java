package Questions.tcs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a year: ");
//        int year = sc.nextInt();
//
//        boolean res = isLeapYear(year);
//
//        System.out.println(res);

        System.out.println(gcd(12, 10));
        System.out.println(lcm(12, 10));
    }

    private static boolean isLeapYear(int yr){
        return yr % 400 == 0 || (yr %4 == 0 && yr % 100 != 0);
    }
    private static int gcd(int a, int b){
        while (b != 0){
            int t= b;
            b = a % b;
            a = t;
        }
        return  a;
    }

    private static int lcm(int a, int b){

        return  (a * b)/ gcd(a, b) ;
    }
}
