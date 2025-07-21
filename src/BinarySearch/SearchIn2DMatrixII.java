package BinarySearch;

public class SearchIn2DMatrixII {
    public static void main(String[] args) {

        int a[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 15;

        boolean res = searchMatrix(a, target);
        System.out.println(res);
    }

    public static boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;

        int r = 0, c = m-1;

        while(r < n && c >= 0){
            if(target == mat[r][c]) return true;

            if(target > mat[r][c]) r++;

            else c--;

        }

        return false;
    }
}
