package Basics;

public class Loops {
    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.print("Hello ");
//        }
        //System.out.println();

//        int i = 0;
//        while(i != 10){
//            System.out.println(i);
//            i += 2;
//        }
//        System.out.println(countDigits(102));
//        System.out.println(sumDigits(103));
//        System.out.println(revNumber(103));
//        System.out.println(checkReverse(101));
        //System.out.println(factorial(5));

        for(int i = 0;i < 5;i++){
            for (int j =0; j < 5 - i;j++){
                System.out.print("*");
            }
            System.out.println();
        }









    }

    public static int countDigits(int num){
        int count = 0;
        int temp = num;

        while(temp != 0){
            temp /= 10;
            count++;
        }

        return count;
    }

    public static int sumDigits(int num){
        int sum = 0;
        int temp = num;

        while(temp != 0){
            sum += (temp%10);
            temp /= 10;
        }

        return sum;
    }

    public static int revNumber(int num){
        int newNum = 0;
        int temp = num;

        while(temp != 0){
            newNum = temp % 10+ newNum * 10 ;
            temp /= 10;
        }

        return newNum;
    }
    public static boolean checkReverse(int num){
        int newNum = 0;
        int temp = num;

        while(temp != 0){
            newNum = temp % 10+ newNum * 10 ;
            temp /= 10;
        }
        return (num == newNum);
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i = n;i > 0;i--){
            fact *= i;
        }
        return fact;
    }


    public static class CountPrimes {
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
}
