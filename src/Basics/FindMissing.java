package Basics;

import java.util.HashMap;
import java.util.HashSet;

public class FindMissing {

    public static void main(String[] args) {
        System.out.printf(String.valueOf((char)missingChar("abcdefghij","abcdfghji")));
    }

    public static char missingChar(String a, String b){
        int len1 = a.length();
//        for(int i = 0;i < len1;i++){
//            if(!b.contains(a.charAt(i)+""))return a.charAt(i);
//
//        }

        HashSet<Character> set = new HashSet<>();
        for(char c: b.toCharArray()){
            set.add(c);
        }

        for(char c: a.toCharArray()){
            if(!set.contains(c))return c;
        }
        return ' ';
    }
}


