package BinarySearch;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int a[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 15;
        boolean res = searchMatrixOPTIMAL(a, target);
        System.out.println(res);
    }
    //brute force --> O(n * m)
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean searchMatrixOPTIMAL(int[][] a, int target) {
        int n = a.length, m = a[0].length;

        int l = 0, h = (n * m) - 1;

        while (l <= h){
            int mid = l + (h - l)/2;

            int r = mid/m , c = mid%m;

            if (a[r][c] == target) return true;
            else if (a[r][c] > target) h = mid - 1;
            else l = mid + 1;
        }
        return false;
    }


}
