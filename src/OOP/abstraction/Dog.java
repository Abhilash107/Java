package OOP.abstraction;

//Class 'Dog' must either be declared abstract or implement abstract method 'sayHello()' in 'Animal'
public class Dog extends Animal{

    @Override
    public void sayHello() {
        System.out.println("woof...");
    }
}
