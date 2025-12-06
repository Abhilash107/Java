package Matrix;

public class Practice {

    public static void main(String[] args) {
        int arr[][] = new int[3][3];
        int k = 1;

        for(int i = 0;i< 3;i++){
            for(int j = 0;j<3;j++) {
                arr[i][j] = k++;
            }
        }

        for(int i = 0;i< 3;i++){
            for(int j = 0;j<3;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        //transpose(arr);s
        System.out.println(diagonalSum(arr));






    }

    public static int summation(int a[][], int n, int m){
        int sum = 0;
        for(int i = 0;i< n;i++){
            for(int j = 0;j<m;j++){
                sum += a[i][j];
            }
        }

        return sum;
    }

    public static void transpose(int a[][]){
        //int sum = 0;
        int n = a.length;
        int m = a[0].length;
        for(int i = 0;i< m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(a[j][i]+ " ");
            }
            System.out.println();
        }
    }


    public static int diagonalSum(int a[][]){
        int n = a.length;

        int sum = 0;

        for(int i = 0;i< n;i++){
            sum += a[i][i] + a[i][n - i - 1];
            //sum +=
        }
        if(n %2 == 1)sum -= a[n/2][n/2];// imp

        return sum;
    }



}
