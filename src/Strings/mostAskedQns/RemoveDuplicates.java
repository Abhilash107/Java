package Strings.mostAskedQns;

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "banana";
        System.out.println(resultI(s));
        System.out.println(resultII(s));
        System.out.println(resultIII(s));
    }

    public static String resultI(String ip){
        StringBuilder res = new StringBuilder();
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for(char c: ip.toCharArray()){
            set.add(c);
        }

        for(char c: set){
            res.append(c);;
        }

        return res.toString();

    }

    public static String resultII(String ip){
        StringBuilder res = new StringBuilder();
        int freq[] = new int[256];


        for(char c: ip.toCharArray()){

            if(freq[c] == 0){
                res.append(c);
                freq[c] = 1;
            }
        }


        return res.toString();
    }

    public static String resultIII(String ip){
        StringBuilder res = new StringBuilder();
        boolean visited[] = new boolean[256];


        for(char c: ip.toCharArray()){

            if(!visited[c]){
                res.append(c);
                visited[c] = true;
            }
        }


        return res.toString();
    }
}
