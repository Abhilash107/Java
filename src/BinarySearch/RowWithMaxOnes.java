package BinarySearch;

import static BinarySearch.LowerBound.lowerBound;

public class RowWithMaxOnes {

    public static void main(String[] args) {
        int a[][] = { {1,1,1}, {0,1,1}  };
        System.out.println(RWMOnes(a));
    }

    //N * logM
    public static int RWMOnes(int [][]a){
        int n = a.length;
        int m = a[0].length;

        int cnt_max = 0;
        int ans = -1;

        for(int i = 0;i < n;i++){
            int cnt = m - lowerBound(a[i], 1);
            if(cnt> cnt_max){
                cnt_max = cnt;
                ans = i;
            }
        }

        return ans;
    }

    //most optimal
    public static int rowWithMax1s(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        int i = 0, j = m - 1;
        int index = -1;

        while (i < n && j >= 0) {
            if (a[i][j] == 1) {
                index = i;
                j--;  // Move left
            } else {
                i++;  // Move down
            }
        }

        return index;
    }

}
