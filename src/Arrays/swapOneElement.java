package Arrays;

import java.util.Arrays;

public class swapOneElement {
    public static void main(String[] args) {
        int []arr = {1, 2, 3, 8, 5, 6, 7, 4, 9};

        int i = 1, j = arr.length - 2;
        int indOne = -1, indTwo = -1;
        //boolean startFlag = true, endFlag = true;

        while(i <= j){
            if(indOne == -1 && arr[i] < arr[i-1]){
                indOne = i - 1;
                //startFlag = !startFlag;
            }
            i++;

            if(indTwo == -1 && arr[j] > arr[j+1]){
                indTwo = j + 1;
                //endFlag = !endFlag;
            }
            j--;

            if (indOne != -1 && indTwo != -1) {
                break;
            }
        }
        System.out.println(indOne+ "  "+ indTwo);

        if(indOne != -1 && indTwo != -1){
            int temp = arr[indOne];
            arr[indOne] = arr[indTwo];
            arr[indTwo] = temp;
        }


        System.out.println(Arrays.toString(arr));

    }
}
