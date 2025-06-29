package Arrays;

public class NextPermutation {
    public static void main(String[] args) {

    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }

        if (ind == -1) {
            reverse(nums, 0, n - 1);
            return;
        }


        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                swap(nums, i, ind);
                break;
            }
        }


        reverse(nums, ind + 1, n - 1);

    }

    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
            swap(a, l, r);
            l++;
            r--;
        }
    }


    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
