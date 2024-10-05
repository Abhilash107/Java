package Arrays;
import java.util.Arrays;

public class revArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));
    }

    public static int[] reverse(int[] a) {
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

        return a;
    }
}
