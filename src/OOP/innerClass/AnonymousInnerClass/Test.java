package OOP.innerClass.AnonymousInnerClass;

public class Test {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(200);
        CreditCard card = new CreditCard("wer45t54");//implements the payment interface
        cart.processPayment(card);//uses the payment interface to

        //OR

        // Alternatively, use an anonymous inner class to implement Payment on the fly
        // Demonstrates flexibility: no need for a separate class
        // Anonymous class
        cart.processPayment(new Payment() {// it is not an obj  and observe after new <INTERFACE_NAME> there are curly braces to override the abstract methods;
            @Override
            public void pay(double amount) {
                System.out.println("Paid: " + amount);
            }
        });
    }
}
