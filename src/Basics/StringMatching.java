package Basics;


public class StringMatching {
    public static void main(String[] args) {

        String s = "CaR", t = "ACRt";
        System.out.println(checkIfCopied(s, t));
    }

    public static int checkIfCopied(String s, String t){
        if(s.length() != t.length())return 0;

        return 0;
    }
}
