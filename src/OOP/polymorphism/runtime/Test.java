package OOP.polymorphism.runtime;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();

    //Runtime
        Animal myDog = new Dog();//Upcasting(Implicit Type Casting)
        myDog.makeSound();
        //myDog.eat();//Cannot resolve method 'eat' in 'Animal'


        //Dog myDog = new Animal(); //Error Downcasting (Not Allowed Directly)

        Dog doggy = (Dog) myDog;//Down casting


    }
}
