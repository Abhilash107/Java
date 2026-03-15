package Questions.tcs;

public class problem4 {
    public static void main(String[] args) {
        System.out.println(specialSumofDigits(19));
    }
    private static int specialSumofDigits(int num){
        int sum = 0;


        while(num > 0){
            sum += num%10;
            num /= 10;
        }

        if(sum > 9) return specialSumofDigits(sum);
        return sum;
    }

    private static int specialSumofDigitsII(int num) {

        while(num > 9) {          // repeat until single digit
            int sum = 0;

            while(num > 0) {
                sum += num % 10;
                num /= 10;
            }

            num = sum;            // continue with new sum
        }

        return num;
    }
}
