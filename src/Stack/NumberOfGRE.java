package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NumberOfGRE {
    public static void main(String[] args) {

        //int[] arr = {3, 4, 2, 7, 5, 8, 10, 6}; // Array with duplicates
        int[] arr = {1,2,3,4,1}; // Array with duplicates

        System.out.println(Arrays.toString(ans(arr, new int[]{0, 3})));
    }

    public static int[] ans(int[] a, int ind[]){
//        int arr[] =new int[a.length];
//        for (int i = 0;i < a.length;i++){
//            arr[i] = a[i];
//        }
//        //Arrays.sort(arr);
//        int n = a.length;
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = n - 1;i >= 0;i--){
//            if(!stack.isEmpty() && stack.peek() == arr[i])continue;
//            stack.push(arr[i]);
//
//        }
//        int k = 0;
//        int res[] = new int[ind.length];
//
//        while (!stack.isEmpty() && k < ind.length){
//            if (stack.peek() != a[ind[k]]) {
//                stack.pop();
//            } else {
//                res[k] = stack.size() - 1;
//            }
//            k++;
//        }
//
//        return res;

        //Not optimal
        int n = a.length;
        int res[] = new int[ind.length];
        int search[] = new int[ind.length];
        for(int i =0;i<search.length;i++){
            search[i] = a[ind[i]];
        }
        Arrays.sort(a);
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i < n;i++){
            if(map.containsKey(a[i]) && !map.isEmpty())continue;
            map.put(a[i], i);
        }

        int k = 0;
        while(k < ind.length ){
            if(map.containsKey(search[k])){
                res[k] = map.size() -1 - map.get(search[k]) ;
            }
            k++;
        }


        return res;


    }
}
