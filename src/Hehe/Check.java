package Hehe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        int max = 0;
        int k = 5;
        int arr[] = {2,3,4,7, 11};
        for(int x: arr){
            max = (max < x) ?  x : max;
        }
        //System.out.println(max);

        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();
        for (int x: arr)set.add(x);

        boolean isFound = false;

        for(int i = 1;i <= 2000;i++){
            if(ans.size() == k) break;

            if(!set.contains(i))ans.add(i);

        }

        System.out.println(ans.get(ans.size() - 1));





    }

}
