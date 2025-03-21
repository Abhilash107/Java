package OOP.innerClass.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(200);
        CreditCard card = new CreditCard("wer45t54");//implements the payment interface
        cart.processPayment(card);//uses the payment interface to

        //Here we can create an anonymous class without creating a separate class for interface implementation
        //e.g. of Anonymous class
        cart.processPayment(new Payment() {// it is not an obj  and observe after new <INTERFACE_NAME> there are curly braces to override the abstract methods;
            @Override
            public void pay(double amount) {
                System.out.println("Paid: " + amount);
            }
        });
    }
}
