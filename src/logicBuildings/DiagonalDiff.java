package logicBuildings;

import java.util.List;

public class DiagonalDiff {
    public static void main(String[] args) {
        
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
        int size = arr.size();
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += arr.get(i).get(i);
            //optimized onr no need of 2nd loop
            // sum2 += arr.get(i).get(size - 1 - i);
        }
        int i = 0, j = size - 1;
        while(i < size){
            sum2 += arr.get(i).get(j);
            i++;j--;
        }
        
        return Math.abs(sum1 - sum2);
        
    }
}
