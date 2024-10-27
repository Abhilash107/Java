package Arrays;

import java.util.Arrays;

public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1,4,5,7};
        int b[] = {2,3,5,6,6,6,6,6,8};
        int res[] = mergedArray(a, b);
        System.out.println(Arrays.toString(res));

    }
    //Optimal solution
    public static int[] mergedArray(int a[], int b[]){
        int ans[] = new int[a.length + b.length];

        int i =0, j=0, k =0;
        while (i< a.length && j<b.length) {
            if(a[i] > b[j]){
                ans[k] = b[j];
                k++;j++;
            }
            else if(a[i] < b[j]){
                ans[k] = a[i];
                k++;i++;
            }else{
                ans[k] = a[i];
                i++;k++;
                ans[k] = b[j];
                j++;k++;
            }
        }

        while(i < a.length){
            ans[k] = a[i];
            k++; i++;
        }

        while(j < b.length){
            ans[k] = b[j];
            k++; j++;
        }
        return ans;
    }
}
