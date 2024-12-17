package Stack;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String str = "()[{}()]";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String str){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));

            }
            else{
                if(s.isEmpty()) return false;

                char ch = s.peek();
                if(str.charAt(i) == ')' && ch == '(' || str.charAt(i) == '}' && ch == '{' || str.charAt(i) == ']' && ch == '['){
                    s.pop();
                }
                else{
                    return false;
                }

            }
        }
        return s.isEmpty();
    }
}
