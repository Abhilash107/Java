package Strings.mostAskedQns;

import java.util.LinkedHashMap;
import java.util.Map;


public class RemoveAndPrintFreq {

    public static void main(String[] args) {
        String str = "aaabbc";
        System.out.println(removeDuplicateAndPrint(str));

        String s = "ttvvddss";
        System.out.println(removeDuplicateAndPrintAlphabetically(s));




    }

    public static String removeDuplicateAndPrint(String ip){
        StringBuilder res = new StringBuilder();
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char c: ip.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for(Map.Entry<Character, Integer> e : map.entrySet()){
            String s= e.getKey()+""+e.getValue();
            res.append(s);
        }

        return res.toString();
    }

    public static String removeDuplicateAndPrintAlphabetically(String ip){
        StringBuilder res = new StringBuilder();
        int freq[] = new int[256];

        for(char c: ip.toCharArray()){
            freq[c]++;
        }

        for(int i = 0; i < 256;i++){
            if(freq[i] > 0){
                res.append((char)i).append(freq[i]);
            }

        }

        return res.toString();
    }
}
