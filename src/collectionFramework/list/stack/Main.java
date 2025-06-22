package collectionFramework.list.stack;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();//subclass of vector hence thread-safety

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack);
        System.out.println(stack.peek());//6
        System.out.println(stack.capacity());
        System.out.println(stack.size());//6

        int element = stack.pop();
        System.out.println(element);
        System.out.println(stack.size());//5

        System.out.println(stack.search(3));//from top
        //Returns the 1-based position where an object is on this stack


        //linkedList as a stack
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.addLast(10);//push
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.getLast();//peek


        linkedList.removeLast();//pop
    }
}
