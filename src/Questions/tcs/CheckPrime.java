package Questions.tcs;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(4));
//        System.out.println(isPrime(8));
//        System.out.println(isPrime(19));
//        System.out.println(isPrime(23));
//        System.out.println(isPrime(66));
//        System.out.println(isPrime(91));

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the lower bound: ");
//        int lower = sc.nextInt();
//        System.out.println("Enter the upper bound: ");
//        int upper = sc.nextInt();


//        for(int i = 1; i <= 300;i++){
//            if(isPrime(i)) System.out.print(i + " ");
//        }
//        System.out.println();



//        for(int i = 1; i <= 300;i++){
//            if(isPrimeOptimal(i)) System.out.print(i + " ");
//        }
//        System.out.println();


        long s1 = System.nanoTime();
        for(int i = 1; i <= 300;i++){
            isPrime(i);
        }
        long e1 = System.nanoTime();

        long s2 = System.nanoTime();
        for(int i = 1; i <= 300;i++){
            isPrimeOptimal(i);
        }
        long e2 = System.nanoTime();

        System.out.println("First one: " + (e1 - s1) / 1_000_000.0);
        System.out.println("Second one: " + (e2 - s2) / 1_000_000.0);


    }
    private static boolean isPrime(int n){
        if(n <= 1)return false;
        if(n <= 3) return true;
        if(n % 2 == 0 || n % 3 == 0)return false;

        for(int i = 5;i * i <= n;i++){
            if(n % i == 0)return false;
        }

        return true;
    }

    //(6k ± 1 optimization)
    private static boolean isPrimeOptimal(int n) {

        if (n <= 1) return false;
        if (n <= 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;// 5 and 7
        }

        return true;
    }

}
