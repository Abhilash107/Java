package Arrays;

public class Limit {
    public static void main(String[] args) {
        int a[] = {2, 4, 7, 12};
        System.out.println(requiredLimits(a, 3));
    }
    public static int requiredLimits(int []a, int limits){
        int n = a.length;

        int res = 0;

        int i = 1, j = a[0];

        while(i < n){
            int diff = a[i] - j;

            if(diff > limits){
                res += (int)Math.ceil((double) diff/limits) - 1;
            }

            j = a[i];
            i++;
        }
        return res;
    }
}
