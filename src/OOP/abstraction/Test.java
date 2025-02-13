package OOP.abstraction;

public class Test {
    public static void main(String[] args) {
        //Animal animal = new Animal();//Animal' is abstract; cannot be instantiated

        Animal dog = new Dog();
        dog.sayHello();
    }
}
