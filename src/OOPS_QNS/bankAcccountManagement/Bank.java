package OOPS_QNS.bankAcccountManagement;

import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> accountList = new HashMap<>();

    public BankAccount createAccount(String name, String accNo, double balance) {
        BankAccount account = new BankAccount(name, accNo, balance);
        accountList.put(accNo, account);
        return account;
    }

    //Not necessary
    public void addAccount(BankAccount account){
        accountList.put(account.getAccountNumber(), account);
    }

    public boolean accountExists(String accNumber){
        return accountList.containsKey(accNumber);
    }


    public static void main(String[] args) {
        Bank bank = new Bank();

        BankAccount myAcc = bank.createAccount("Abhilash", "ACC0908977Z897", 12345);

        if(bank.accountExists(myAcc.getAccountNumber())){
            System.out.println("Account exists");

            System.out.println("Balance: "+ myAcc.checkBalance());

            myAcc.deposit(100);
            System.out.println("Balance: "+ myAcc.checkBalance());

            myAcc.withdraw(12345);
            System.out.println("Balance: "+ myAcc.checkBalance());

        }
        else{
            System.out.println("Nope");
        }
    }

}
