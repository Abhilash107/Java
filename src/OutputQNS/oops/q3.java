package OutputQNS.oops;

class C{
    private final void fun(){
        System.out.println("FUN");
    }

}
public class q3 extends C {
    public final void fun(){
        System.out.println("FUNNNNN");
    }

    public static void main(String[] args) {
        new q3().fun();//FUNNNNN
    }

}
// fun() is private, which means it's not visible to subclasses.
//
//Even though it's marked final, since it's private, it is not inherited by class q3.
//Therefore, the fun() in class q3 is a completely new method, not an override.
