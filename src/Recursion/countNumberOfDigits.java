package Recursion;

public class countNumberOfDigits {
    public static void main(String[] args) {
        System.out.println(count(100));
    }

    public static int count(int num){
        if(num == 0) return 0;
        int c = count(num/10);
        ++c;

        return c;
    }
}
