package Arrays;

public class maximumProduct {
    public static void main(String[] args) {
        int[] a = {2, -3, 2, 4};
        System.out.println(maxProduct(a));
        
    }

    public static int maxProduct(int[] arr){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                max = Math.max(max, product);
            }
        }

        return max;
    }
}
