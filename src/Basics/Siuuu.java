package Basics;

import java.util.ArrayList;

public class Siuuu {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < 5;i++){
            list.add(i+1);
        }

        //System.out.println(list);
        for(int i = 0;i < 2;i++){
            int x = list.get(0);
            list.remove(0);
            list.add(x);
        }
        System.out.println(list);

    }
}
