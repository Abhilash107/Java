package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;  

public class commonElementsInAnArray {
    public static void main(String[] args) {
        int[] a = {2, 9, 4 ,3, 8};
        //int[] b = {7, 4, 2 ,6, 1};
        int[] b = {7, 4, 2 ,3, 1};
        System.out.println(commonElements(a, b));


    }
    
    //public static List<Integer> commonElements(int[]a, int[] b){
    //     List<Integer> ans = new ArrayList<Integer>();
    //     for (int i = 0; i < a.length; i++) {
    //         for (int j = 0; j < b.length; j++) {
    //             if(a[i] == b[j]){
    //                 ans.add(a[i]);
    //                 break;
    //             }
    //         }
    //     }
    //     return ans;
    // }

    public static List<Integer> commonElements(int[]a, int[] b){
        List<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for (int val : a) {
            set.add(val);
        }
        for (int val : b) {
            if(set.contains(val)) {
                ans.add(val);
                set.remove(val);
            }
            
        }
        return ans;

    }
}
