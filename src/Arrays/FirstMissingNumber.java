
package Arrays;
import java.util.*;
public class FirstMissingNumber {
    public static void main(String[] args) {

    }

    public static int firstMissing(int[] arr, int n) {
        //TC -> O(n *log n)
        //SC -> O(1)
        Arrays.sort(arr);

        int num = 1;
        for(int i = 0;i < n;i++){

            if(arr[i] < num)continue;// ignores negatives, duplicates

            if(num == arr[i]){
                num++;
            }
            else if(num != arr[i])return num;

        }
        return num;

    }

    public static int firstMissingII(int[] arr, int n) {
        //TC -> O(n)
        //SC -> O(n)
        boolean isPresent[] = new boolean[n+2];

        for(int i = 0;i < n;i++){
            if(arr[i] >= 0 && arr[i] <= n){
                isPresent[arr[i]] = true;
            }
        }

        for(int i =1;i < n+2;i++){
            if(isPresent[i] == false)return i;
        }
        return -1;

    }
}
