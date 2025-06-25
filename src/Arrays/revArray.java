package Arrays;
import java.util.Arrays;

public class revArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int[] a) {
        int l = 0;
        int h = a.length - 1;

        while (l <= h) {
            // Swap elements
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;

            l++;
            h--;
        }


    }
}
