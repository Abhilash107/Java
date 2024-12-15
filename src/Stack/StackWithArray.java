package Stack;



public class StackWithArray {
    final int size = 10;
    int top = -1;
    int []arr = new int[size];

    public void push(int value){
        if(top >= size - 1){
            System.out.println("Exceeded the size");
            return;
        }
        top += 1;
        arr[top] = value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack Underflow: No elements in the stack");
            return -1;
        }
        int x = arr[top];
        top -= 1;
        return x;
    }

    public int top(){
        if(top == -1){
            System.out.println("Stack Underflow: No elements in the stack");
            return -1;
        }

        return arr[top];
    }

    public void display(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = top; i >= 0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public void displayReverse(){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = 0; i <= top;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        //Stack<Integer> stack = new Stack<>();
        StackWithArray stack = new StackWithArray();
        int num = 5;
        for (int i = 1; i <= 5; i++) {
            stack.push(num * i);
        }



        stack.display();//25 20 15 10 5
        stack.displayReverse();//5 10 15 20 25
        int popped = stack.pop();
        int top = stack.top();
        stack.display();
        System.out.println(popped+" "+top);


        //System.out.println(stack.top());

    }
}
