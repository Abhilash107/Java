package Stack;

import java.util.Stack;

public class LargestRectangle {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }

    public static int largestRectangleArea(int[] h){
        int n = h.length;
        int nse[] = nextSmallerElement(h);
        int pse[] = pse(h);

        int maxArea = 0;

        for(int i = 0;i < n;i++){
            maxArea = Math.max(maxArea, h[i] * (nse[i] - pse[i] - 1));
        }

        return maxArea;
    }


    public static int[] nextSmallerElement(int []a){

        int n = a.length;
        int ans[] = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i); // Push index, not value
        }

        return ans;

    }


    public static int[] pse(int []a){
        int n = a.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            while(!st.isEmpty() && a[st.peek()] > a[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return res;

    }


}
