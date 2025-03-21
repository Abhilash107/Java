package Exceptions;

public class BankAccount {
    double balance;
    public BankAccount(double amount){
        this.balance = amount;
    }
    public void withdraw(double amount) throws CustomException{
        if(amount > balance) throw new CustomException(amount);

    }
}
