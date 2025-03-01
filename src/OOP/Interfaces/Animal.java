package OOP.Interfaces;

public interface Animal {
    //no constructor can be created

    //Class is blueprint for Objects
    //Interface is blueprint for Class
    //1. abstract methods
    //2. static constants

    //public static final int MAX_AGE = 100;
    int MAX_AGE = 100;
    //Modifier 'final' is redundant for interface fields
    //Modifier 'static' is redundant for interface fields

    public abstract void eat();
    //Modifier 'public' is redundant for interface members
    //Modifier 'abstract' is redundant for interface methods
    void sleep();

    //STATIC METHODS (Introduced in Java 8)
    //public  void info(){//error -> Interface abstract methods cannot have body

    //This doesn't need to be implemented in child class, but all by default abstract or other method must be implemented by child class
    public static void info(){//error -> Interface abstract methods cannot have body
        System.out.println("This is an ANIMAl interface");
    }

    // Default method (introduced in Java 8)
    public default void run() {
        System.out.println("Animal is running");
    }

    //multiple inheritance

}
