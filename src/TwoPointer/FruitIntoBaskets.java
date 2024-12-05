package TwoPointer;
import java.util.HashMap;
import java.util.HashSet;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int []a = {2,1,2};
        System.out.println(maxLengthOpt(a));

    }
    public static int maxLength1(int []a){
        int maxLength = 0;
        for (int i = 0; i < a.length; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < a.length; j++) {
                set.add(a[j]);
                if(set.size() <= 2){
                    maxLength = Math.max(maxLength, (j-i+1));
                }
                else break;
            }
        }
        return maxLength;
    }

    public static int maxLengthOpt(int []a){
        int maxLength = 0;
        int l = 0, r = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(r < a.length){
            map.put(a[r], map.getOrDefault(a[r],0) + 1);
            if(map.size() > 2){
                map.put(a[l], map.getOrDefault(a[l],0) - 1);
                if(map.get(a[l]) == 0) map.remove(a[l]);
                l++;
            }
            if(map.size() <= 2)maxLength = Math.max(maxLength, (r - l +1));
            r++;

        }
        return  maxLength;

    }
}
