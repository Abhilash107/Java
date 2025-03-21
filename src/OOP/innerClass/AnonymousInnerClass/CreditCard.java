package OOP.innerClass.AnonymousInnerClass;
//ned a child class to implement the interface
public class CreditCard implements Payment{

    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount+ " from cardNo: " + this.cardNumber);
    }
}
