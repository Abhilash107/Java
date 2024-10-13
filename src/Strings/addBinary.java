package Strings;

public class addBinary {
    public static void main(String[] args) {
        long num1 = Long.parseLong("10002");
        //long num1 = Long.parseLong(b);
        //System.out.println(num1);
        int[] a = {1, 3, 5, 6};
        System.out.println(searchInsert(a, 5));


    }

   
        public static int searchInsert(int[] nums, int target) {
            int left = 0; 
            int right = nums.length;
        
            while (left < right) {
                int mid = left + (right - left) / 2; 
        
            if (nums[mid] >= target) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
            }
            return left; 
        }
       
}
