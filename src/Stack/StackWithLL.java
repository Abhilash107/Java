package Stack;
class Node{
    Node next = null;
    int data;
    //next pointer is automatically set to null (default value).
    public Node(int data){
        this.next = null;
        this.data = data;
    }
}

public class StackWithLL {
    Node top;
    int size = 0;

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size += 1;

    }

    public int pop(){
        if(size == 0){
            System.out.println("Stack underflow! The stack is empty.");
            return -1;
        }
        int element = top.data;
        top = top.next;
        size -= 1;
        return element;
    }

    public int getTop(){
        return top.data;
    }
    public int getSize(){
        return this.size;
    }

    public static void main(String[] args) {

    }
}
