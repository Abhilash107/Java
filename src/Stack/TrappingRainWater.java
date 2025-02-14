package Stack;

public class TrappingRainWater {
    public static void main(String[] args) {

    }

    public static int trap(int[] height) {
        int total = 0;
        int n = height.length;
        int prefix[] = new int[n];
        prefix[0] = height[0];
        for(int i = 1;i < n;i++){
            prefix[i] = Math.max(prefix[i-1], height[i]);
        }

        int suffix[] = new int[n];
        suffix[n-1] = height[n-1];
        for(int i = n-2;i >= 0;i--){
            suffix[i] = Math.max(suffix[i+1], height[i]);
        }

        for(int i = 0;i < n;i++){
            int lf = prefix[i], rm = suffix[i];
            total += Math.min(lf, rm) - height[i];
        }

        return total;
    }
}
