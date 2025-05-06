package OutputQNS.oops;

public class q2 extends B {
    public q2(String s){
        super(s);
        System.out.println("q2");//Constructor call must be the first statement in a constructor
    }

    public static void main(String[] args) {
        new q2("C");
        System.out.println();// B q2
    }


}

class B {
    public B(String s){
        System.out.println("B");
    }
}
//
//"C" is passed to the constructor of q2.
//
//        Inside q2(String s), if you don't explicitly call super(s), Java will try to call super() (no-arg constructor of B).
//
//But B only has: