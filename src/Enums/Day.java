package Enums;

public enum Day {
    MONDAY("MONDAY"),
    TUESDAY("TUESDAY"),
    WEDNESDAY("WEDNESDAY"),
    THURSDAY("THURSDAY"),
    FRIDAY("FRIDAY"),
    SATURDAY("SATURDAY"),
    SUNDAY("SUNDAY");
    //all these are final instance of Day class

    private Day(String lower){
        System.out.println("Constructor called....");
        this.lower = lower;
    }

    public String getLower() {
        return lower;
    }

    private String lower;



    public void display(){
        System.out.println("Today is: " + this.name());
    }
}
