package OOP.Interfaces;

public class Dog implements Animal {
    //Class 'Dog' must either be declared abstract or implement abstract method 'eat()' in 'Animal'


    @Override
    public void sleep() {

        System.out.println("Dog is sleeping");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
