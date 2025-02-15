package Strings;

import java.util.HashMap;

public class MaxDiffBetweenEvenAndOdd {
    public static void main(String[] args) {
        String s = "mmsmsym";
//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i = 0;i < s.length();i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        for (int x: map.values()){
//            System.out.println(x);
//        }

        System.out.println(maxDiff(s));



    }

    public static int maxDiff(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        int maxOdd = Integer.MIN_VALUE, minEven = Integer.MAX_VALUE;
        for(int x: map.values()){
            if(x %2 == 1 && maxOdd < x)maxOdd = x;
            if(x%2 == 0 && minEven > x)minEven = x;
        }

        return maxOdd - minEven;

    }
}
