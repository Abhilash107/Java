package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class difference {
    public static void main(String[] args) {
        int[] a = {2, 9, 4 ,3, 8};
        int[] b = {7, 4, 2 ,6, 1};

        System.out.println(findDiff(a, b));


    }
    public static  List<Integer> findDiff(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int val: b) {
            set.add(val);
        }

        for (int val : a) {
            if(!set.contains(val)) ans.add(val);
        }

        return ans;

    }
}
