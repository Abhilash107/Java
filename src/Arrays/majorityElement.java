package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,1,2,2,2,3,2,2,2};
        System.out.println(betterApproach(a));
    }

    public static ArrayList<Integer> getNumbers(int arr[]){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(count >= Math.floor(arr.length/3)) {
                if(!numbers.contains(arr[i]))
                numbers.add(arr[i]);
            }
        }

        return numbers;   
    }


    public static List<Integer> betterApproach(int[] arr){
        List<Integer> ans = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        int threshold = (int)(arr.length/3) + 1;

        for (int i = 0; i < arr.length; i++) {
            int value = map.getOrDefault(arr[i], 0);

            map.put(arr[i], value+1);

            if( map.get(arr[i]) == threshold ){
                ans.add(arr[i]);
            }

            if (ans.size() == 2) break;

        }

        return ans;

    }


}
