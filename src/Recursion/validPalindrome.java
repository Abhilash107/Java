package Recursion;

public class validPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("AMAMA"));
    }

    public static boolean isPalindrome(String str){
        return isPalindromeHELPER(str, 0, str.length()-1);
    }

    public static boolean isPalindromeHELPER(String s,int l, int h){
        if(l >= h) return true;

        if(s.charAt(l) != s.charAt(h)) return false;

        return isPalindromeHELPER(s, l+1, h-1);
    }
}
