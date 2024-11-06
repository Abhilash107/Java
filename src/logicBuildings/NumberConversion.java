package logicBuildings;

public class NumberConversion {

    // Method to convert binary to decimal
    public static int binaryToDecimal(int num) {
        int power = 0;
        int decimal = 0;
        int temp = num;
        while (temp > 0) {
            decimal += (Math.pow(2, power) * (temp % 10));
            temp /= 10;
            power++;
        }
        return decimal;
    }

    // Method to convert decimal to binary
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return "0";
        }
        String res = "";
        while (num > 0) {
            res = (num % 2) + res;
            num /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        int num1 = binaryToDecimal(1011);
        String num2 = decimalToBinary(4);

        System.out.println(num1);  // Output: 11
        System.out.println(num2);  // Output: 100
    }
}

