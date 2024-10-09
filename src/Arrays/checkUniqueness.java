package Arrays;

import java.util.HashSet;

public class checkUniqueness {
    public static void main(String[] args) {
        int[] arr= {1,2,0,4,4};
        System.out.println(isUniquePresent(arr));


    }

    public static boolean isUniquePresent(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for (int i : arr) {
            if(set.contains(i)) return true;
            set.add(i); 
        }
        return false;
    }
}
