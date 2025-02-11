package leetcodedaily;

import java.util.Stack;

public class ClearDigits {
    public static void main(String[] args) {
        System.out.println(clearDigits("cb35"));

    }
    public static String clearDigits(String s) {

        StringBuffer ans = new StringBuffer();
        Stack<String> stack = new Stack<>();
        for(int i = 0;i < s.length();i++){

            if(Character.isDigit(s.charAt(i))){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }

        for (String s1: stack){
            ans.append(s1);
        }

        return ans.toString();

    }
}
