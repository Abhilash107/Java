package Queue;
class Node{
    Node next = null;
    int data;
    public Node(int value){
        this.data = value;
        this.next = null;
    }
}

public class QueueUsingLL {
    Node start, end;
    int size = 0;

    public void push(int value){
        Node newNode = new Node(value);

        if(start == null){
            start = end = newNode;
        }
        else{
            end.next = newNode;

        }
        size += 1;

    }

    public int pop(){
        if(start == null){
            System.out.println("Queue underflow!");
            return -1;
        }

        int element = start.data;
        start = start.next;
        size -= 1;
        return element;
    }

    public int getTop(){
        if(start == null){
            System.out.println("Queue underflow!");
            return -1;

        }
        return start.data;
    }

    public int getSize(){
        return size;
    }

}
