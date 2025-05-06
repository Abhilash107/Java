package OutputQNS.oops;

public class q1 extends A {
    int x = 10;

    public static void main(String[] args) {
        new q1().display();// 20
    }

}

class A {
    int x = 20;

    void display(){
        System.out.println(x);
    }


}
