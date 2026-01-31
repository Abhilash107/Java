package Basics;

public class Test {

    public static void main(String[] args) {
        int res = fun(111);
        System.out.println(res);
    }
    public static int fun(int num){
            int rev = 0, pow = 1;
            int temp = num;

            while(temp > 0){
                int ld = temp % 10;

                if(ld != 0){
                    rev = (rev * pow) + ld;
                    pow *= 10;
                }
                temp /= 10;
            }

            return Math.abs(num - rev);
    }

}
