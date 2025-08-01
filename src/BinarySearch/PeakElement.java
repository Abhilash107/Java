package BinarySearch;

public class PeakElement {
    public static void main(String[] args) {

    }
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n - 2]) return n-1;

        int l = 1, h = n - 2;

        while(l <= h){
            int mid = l + (h - l)/2;

            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;

            if(nums[mid] > nums[mid - 1])l = mid + 1;
            else h = mid - 1;

        }

        return -1;
    }
}
