package OutputQNS.oops;

public class q8 {
    public static void main(String[] args) {
        try {
            System.out.println("Hello"+ 1 / 0);
        }catch (ArithmeticException e){
            System.out.println("world");
        }

//        if(true)
//            break;//Break outside switch or loop (Error)
    }
}
