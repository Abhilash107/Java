package logicBuildings;

import java.util.ArrayList;
import java.util.List;

public class factors {
    public static void main(String[] args) {
        factors(120);
    }

    public static void factors(int num){
        List<Integer> list = new ArrayList<>();
        int i = 2;
        int temp = num;
        while(temp > 1){
            if(temp % i == 0){
                temp = temp/i;
                list.add(i);
            }else{
                i++;
            }
        }
        System.out.println(list);
    }
}
