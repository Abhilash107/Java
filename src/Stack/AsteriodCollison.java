package Stack;

import java.util.Stack;

public class AsteriodCollison {
    public static void main(String[] args) {

        int a[] = {-1,2,-3,4,5,6};

        Stack<Integer> st = new Stack<>();

        for(int x: a){
            if(st.isEmpty())st.push(x);
            else{

                if(x > 0){
                    while(!st.isEmpty() && st.peek() > 0){
                        st.push(x);

                    }
                    if(st.peek() < 0){

                    }
                }
                else{

                }




            }

        }
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }

    }

//    public static int afterCollison(int []a){
//
//    }

}
