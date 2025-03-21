package Exceptions;

public class Testing {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10);
        try{
            account.withdraw(100);
        } catch (CustomException e) {
            System.out.println(e);
        }
    }
}
