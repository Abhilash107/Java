package Strings;

public class multiplyString {
    public static void main(String[] args) {
        System.out.println(multiplySTR("19999999", "2"));
    }

    public static String multiplySTR(String s1, String s2){
        // int num1 = Integer.parseInt(s1);
        // int num2 = Integer.parseInt(s2);
        // String ans = "";
        // ans += (num1* num2);
        // return ans;

        return ""+(Integer.parseInt(s1) * Integer.parseInt(s2));
        
    }
}
