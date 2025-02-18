package Stack;

import java.util.Stack;

public class RemoveKdigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));
    }
    public static String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();

        for (char digit: num.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > digit){
                st.pop();
                k--;

            }
            st.push(digit);
        }

        //IF nums are in sorted
        while(!st.isEmpty() && k > 0){
            st.pop();
            k--;
        }

        //new String
        StringBuffer str = new StringBuffer("");
        while(!st.isEmpty()){
            str.append(st.pop());
        }
        str.reverse();

        while(str.length() > 0 && str.charAt(0) == '0'){
            str.deleteCharAt(0);
        }

        return str.length() > 0 ? str.toString() : "0";

        //If any leading zeros present


    }

}
