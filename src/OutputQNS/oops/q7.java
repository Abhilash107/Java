package OutputQNS.oops;
class Base{
    public void getDetails(){
        System.out.println("Parent");
    }
}
public class q7 extends Base{
//    protected void getDetails(){
////        'getDetails()' in 'OutputQNS. oops. q7' clashes with 'getDetails()' in 'OutputQNS. oops. Base'; attempting to assign weaker access privileges ('protected'); was 'public'
//        //Java Method Overriding Rule (Access Modifiers):
////        When you override a method in a subclass, you cannot make it less accessible than it was in the superclass.
//        System.out.println("Child");
//    }
// So, compile-time error

    public static void main(String[] args) {
        q7 q = new q7();
        q.getDetails();
    }
}
