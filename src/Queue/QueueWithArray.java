package Queue;

public class QueueWithArray {
    final int size = 10;
    int start = -1, end = -1, currentSize = 0;
    int []arr = new int[size];

    public void push(int value){
        if(currentSize == size){
            System.out.println("Queue is full");
            return;
        }

        if(currentSize == 0){
            start = end = 0;

        }
        else {
            end = (end + 1)%size;
        }
        arr[end] = value;
        currentSize += 1;
    }
    public int pop(){
        if(currentSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }

        int x = arr[start];
        if(currentSize == 1) {
            start = end = -1;
            return x;
        }
        else{
            start = (start + 1)%size;
        }
        currentSize -= 1;
        return x;
    }

    public int getTop(){
        if(currentSize == 0){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[start];
    }

    public int getSize(){
        return currentSize;
    }

    public void display(){
        if(currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int end = start + currentSize - 1;

        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public void displayReverse(){
        if(currentSize == 0) {
            System.out.println("Queue is empty");
            return;
        }
        int end = start + currentSize - 1;

        for (int i = end; i >= start; i--) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueWithArray queue = new QueueWithArray();
        System.out.println(queue.getSize());
        System.out.println(queue.getTop());

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

        System.out.println(queue.getTop());
        System.out.println(queue.getSize());
        queue.pop();

        //System.out.println(queue.getTop());
        //System.out.println(queue.getSize());

        queue.display();
        queue.displayReverse();


    }
}
