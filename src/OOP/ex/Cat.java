package OOP.ex;

public class Cat extends Animal{
    String breed;

    @Override
    public void makeSound() {
        System.out.println("Meowww");
    }
}
