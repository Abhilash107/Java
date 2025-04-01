package Recursion;

import java.util.ArrayList;

public class PowerSet {
    public static void main(String[] args) {
        String s = "abc";
        int n = s.length();

        ArrayList<String> list = new ArrayList<>();

        for(int num = 0; num < (1 << n);num++){
            String sub = "";
            for (int i = 0; i < n; i++) {
                if((num & ( 1 << i)) != 0){
                     sub += s.charAt(i);
                }
            }
            list.add(sub);

        }


        System.out.println(list);
    }


}
