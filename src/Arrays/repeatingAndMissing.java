package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class repeatingAndMissing {
    public static void main(String[] args) {
        // Only one is missing and one is repeating && repeating < missing
        int arr[] = {1,5,3,2,2};
        System.out.println((Arrays.toString(findElements(arr))));

    }
    public static int[] findElements(int[] a){
        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;
        int sum = 0;
        for (int i = 0;i < a.length;i++) { 
            sum += a[i];
            if(!set.add(a[i])) {
                duplicate = a[i];
            }
        }
        int actualSum = (a.length * (a.length + 1))/2;
        int missing = actualSum - (sum - duplicate);

        return new int[]{duplicate, missing};

        
    }
}
