package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class migratoryBirds {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        System.out.println(highestFrequency(numbers));
    }

    public static int highestFrequency(List<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (Integer number : list) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            Integer value = entry.getValue();
            Integer key = entry.getKey();

            if (max < value) {
                max = value; 
                ans = key; 
            }
        }

        return ans;
    }
}
