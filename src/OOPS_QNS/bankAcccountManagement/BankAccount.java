package OOPS_QNS.bankAcccountManagement;

import java.util.HashMap;

public class BankAccount {

    private String name, accountNumber;
    private double balance;

    public BankAccount(String _name, String _accountNumber, double _balance){
        this.name = _name;
        this.accountNumber = _accountNumber;
        this.balance = _balance;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double checkBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount <= 0)return;

        this.balance += amount;
    }

    public void withdraw(double amount){
        if(amount <= 0 || this.balance < amount){
            return;
        }

        this.balance -= amount;
    }






}
