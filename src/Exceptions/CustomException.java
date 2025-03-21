package Exceptions;

public class CustomException extends Exception{
    private double amount;
    public double getAmount() {
        return amount;
    }


    public CustomException(double amount){
        super("Custom Error");
    }

}
