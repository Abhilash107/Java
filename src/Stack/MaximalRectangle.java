package Stack;
import java.util.Stack;
public class MaximalRectangle {
    public static void main(String[] args) {

    }

        public int maximalRectangle(char[][] mat) {
            if (mat.length == 0) return 0;

            int maxArea = 0;
            int row = mat.length;
            int col = mat[0].length;
            int preSum[][] = new int[row][col];

            // Compute histogram heights (prefix sum of '1's column-wise)
            for (int j = 0; j < col; j++) {
                for (int i = 0; i < row; i++) {
                    if (mat[i][j] == '1') {
                        preSum[i][j] = (i == 0) ? 1 : preSum[i - 1][j] + 1;
                    } else {
                        preSum[i][j] = 0;
                    }
                }
            }

            // Find the maximum rectangular area in each histogram row
            for (int i = 0; i < row; i++) {
                maxArea = Math.max(maxArea, largestRectangleArea(preSum[i]));
            }
            return maxArea;
        }

        // Function to calculate the maximum rectangle area in a histogram
        public int largestRectangleArea(int[] h) {
            int n = h.length;
            int nse[] = nextSmallerElement(h);
            int pse[] = previousSmallerElement(h);
            int maxArea = 0;

            for (int i = 0; i < n; i++) {
                maxArea = Math.max(maxArea, h[i] * (nse[i] - pse[i] - 1));
            }

            return maxArea;
        }

        // Next Smaller Element (NSE)
        public int[] nextSmallerElement(int[] a) {
            int n = a.length;
            int ans[] = new int[n];
            Stack<Integer> stack = new Stack<>();

            for (int i = n - 1; i >= 0; i--) {
                while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                    stack.pop();
                }
                ans[i] = stack.isEmpty() ? n : stack.peek();
                stack.push(i);
            }

            return ans;
        }

        // Previous Smaller Element (PSE)
        public int[] previousSmallerElement(int[] a) {
            int n = a.length;
            int res[] = new int[n];
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < n; i++) {
                while (!st.isEmpty() && a[st.peek()] >= a[i]) { // Fix: Use `>=` instead of `>`
                    st.pop();
                }
                res[i] = st.isEmpty() ? -1 : st.peek();
                st.push(i);
            }

            return res;
        }


}
