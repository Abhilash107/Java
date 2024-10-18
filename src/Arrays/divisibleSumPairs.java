package Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class divisibleSumPairs {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(3);
        System.out.println(divisiblePairs(5, nums));
    }

    public static int divisiblePairs(int k, List<Integer> list){

        int pairs = 0;
        HashMap<Integer, Integer> remainderMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            int rem = (k - list.get(i) % k);
            remainderMap.put(rem, remainderMap.getOrDefault(rem, 0) + 1);
        }

        for (int i = 0; i < list.size(); i++) {

            if (remainderMap.containsKey( (k-list.get(i)) % k)) pairs++; 
        }

        return pairs;

    }
}
