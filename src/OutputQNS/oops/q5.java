package OutputQNS.oops;

class Test{
    protected final void getBoosted(){
        System.out.println("Boosted");
    }
}
public class q5 extends Test{
//    protected final void getBoosted(){//'getBoosted()' cannot override 'getBoosted()' in 'OutputQNS. oops. Test'; overridden method is final
//        System.out.println("I am boosted");
//    }

    public static void main(String[] args) {
        q5 q = new q5();
        q.getBoosted();
    }
}
