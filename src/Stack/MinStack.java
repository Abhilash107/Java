package Stack;

import java.util.Stack;
//time -> O(1), Space -> (2 * N )
//class Pair{
//    int x, y;
//    Pair(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//}
//
//public class MinStack {
//    Stack<Pair> st;//Stack
//
//    public MinStack() {
//        st = new Stack<>();//Create a stack
//    }
//
//    public void push(int val) {
//        if(st.isEmpty()){//if empty add with min value
//            st.push(new Pair(val, val));
//        }else{//else check for min from top
//            st.push(new Pair(val, Math.min(val, st.peek().y)));
//        }
//
//    }
//
//    public int pop() {
//        return st.pop().x;
//    }
//
//    public int top() {
//        if (st.isEmpty()) {
//            throw new RuntimeException("Stack is empty");
//        }
//        return st.peek().x;
//    }
//
//    public int getMin() {
//        return st.peek().y;
//    }
//
//    public static void main(String[] args) {
//
//    }
//}


//Optimized solution
public class MinStack {
    //newVal = 2 * val - prevMin
    Stack<Integer> st;
    int min = Integer.MIN_VALUE;

    public MinStack(){
        st = new Stack<>();
    }

    public void push(int val){
        if(st.isEmpty()){
            min = val;
            st.push(val);
        }
        else{
            if(val > min){
                st.push(val);
            }
            else{
                st.push(2 * val - min);
                min = val;
            }

        }
    }

    public void pop(){
        if(st.isEmpty()) return;

        int x = st.peek();
        st.pop();

        if(x < min){
            min = 2 * min - x;
        }


    }

    public int top(){
        if(st.isEmpty()) return -1;

        int x = st.peek();
        if(min < x)return x;

        return min;
    }

    public int getMin(){
        return min;
    }

}
