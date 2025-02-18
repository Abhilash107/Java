package Stack;

import java.util.Stack;

public class sumOFSubArrayRanges {
    public static void main(String[] args) {
        System.out.println(findAns(new int[]{1,3,3}));
    }
    public static long findAns(int []a){
        return sumMax(a) - sumMin(a);
    }

    public static long sumMin(int []a){
        int nse[] = nse(a);
        int pse[] = pse(a);
        long total = 0;

        for(int i = 0 ; i < a.length;i++){
            long left = i - pse[i];
            long right = nse[i] - i;
            total = total + (right * left * a[i]);
        }

        return total;

    }


    public static long sumMax(int []a){
        int nge[] = nge(a);
        int pge[] = pge(a);
        long total = 0;

        for(int i = 0 ; i < a.length;i++){
            long left = i - pge[i];
            long right = nge[i] - i;
            total = total + (right * left * a[i]);
        }

        return total;

    }

    public static int[] nse(int []a){
        int n = a.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n - 1;i >= 0;i--){
            while(!st.isEmpty() && a[st.peek()] >= a[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return res;

    }

    public static int[] nge(int []a){
        int n = a.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = n - 1;i >= 0;i--){
            while(!st.isEmpty() && a[st.peek()] <= a[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        return res;

    }

    public static int[] pse(int []a){
        int n = a.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            while(!st.isEmpty() && a[st.peek()] > a[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ?-1 : st.peek();
            st.push(i);
        }

        return res;

    }

    public static int[] pge(int []a){
        int n = a.length;
        int res[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i = 0;i < n;i++){
            while(!st.isEmpty() && a[st.peek()] < a[i]){
                st.pop();
            }
            res[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return res;

    }
}
