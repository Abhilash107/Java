package Arrays;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 9, 6, 2, 5, 4, 8, 3, 7};
        System.err.println(area(arr));
        System.err.println(areaOptimal(arr));

    }

    // fails for larger inputs
    public static int area(int[] a){
        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                int min = Math.min(a[i], a[j]);
                maxArea = Math.max(maxArea, (min * (j - i)));
            }
        }

        return maxArea;
    }



    public static int areaOptimal(int[] a){
        int i = 0;
        int j = a.length - 1;
        int maxArea = Integer.MIN_VALUE;

        while(i < j){
            int min = Math.min(a[i], a[j]);
            maxArea = Math.max(maxArea, (min * (j-i)));

            if(a[i] < a[j]) i++;
            else j--;
        }
        return maxArea;

        
    }
}
