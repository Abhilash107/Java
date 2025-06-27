package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 17;

        int[] res = twoSum(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum(int a[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = a.length;
        //1.
//        for (int i = 0; i < n; i++) {
//            //map.put(i, a[i]);
//            map.put(a[i], i);
//        }
//
//        for(int i = 0; i < n; i++){
//            int rem = target - a[i];
//
//            if(map.containsKey(rem))
//                return new int[]{i, map.get(rem)};
//
//        }

        int rem;
        for( int i =0;i < n;i++){
            rem = target - a[i];
            if(!map.containsKey(rem))map.put(a[i], i);

            else {
                return new int[]{i, map.get(rem)};
            }
        }
//
//       if(res != 0)return new int[]{a[i], res};
//
       return new int[]{-1,-1};

    }
}
