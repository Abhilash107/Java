package Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q;
    public StackUsingQueue(){
        q = new LinkedList<>();
    }

    public void push(int x){
        int size = q.size();
        q.add(x);

        for (int i = 1; i < size; i++) {
            q.add( q.remove());

        }

    }

    public int pop(){
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop.");
        }
        return q.remove();
    }

    public int getTop(){
        if (q.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot get top element.");
        }
        return q.peek();
    }
}
