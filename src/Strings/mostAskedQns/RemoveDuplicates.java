package Strings.mostAskedQns;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(result(s));
    }

    public static String result(String ip){
        String res = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c: ip.toCharArray()){
            set.add(c);
        }

        for(char c: set){
            res += c;
        }

        return res;

    }

    public static String resultII(String ip){
        String res = "";
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c: ip.toCharArray()){
            set.add(c);
        }

        for(char c: set){
            res += c;
        }

        return res;
    }
}
