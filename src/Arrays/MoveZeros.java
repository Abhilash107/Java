package Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int arr[] = {1, 0, 2, 0, 3, 0};

        move(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void move(int a[]){
        int n = a.length;

        int prev = 0;
        for(int i =0;i < n;i++){
            if(a[i] != 0){
                int temp = a[i];
                a[i] = a[prev];
                a[prev] = temp;
                prev++;
            }
        }
    }
}
