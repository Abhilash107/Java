package OutputQNS.oops;
class Parent{
    public void getDetails(String s){
        System.out.println("Parent: "+ s);
    }
}
public class q6 extends Parent{
//    public int getDetails(String s){
//        //'getDetails(String)' in 'OutputQNS. oops. q6' clashes with 'getDetails(String)' in 'OutputQNS. oops. Parent'; attempting to use incompatible return type
//        System.out.println("Child: " + s);
//        return 0;
//    }

    public static void main(String[] args) {
        q6 q = new q6();
        q.getDetails("Hello");
    }
}
