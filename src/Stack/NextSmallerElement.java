package Stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};
        System.out.println(Arrays.toString(nextSmallerElement(a)));
    }


    public static int[] nextSmallerElement(int []a){
        int n = a.length;
        int []ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i < n;i++){

            while(!stack.isEmpty() && a[i] <= stack.peek() ){
                stack.pop();
            }

            ans[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(a[i]);
        }

        return ans;

    }
}
