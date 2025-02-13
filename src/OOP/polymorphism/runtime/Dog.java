package OOP.polymorphism.runtime;



public class Dog extends Animal {
    //String breed;

    @Override
    public void makeSound() {
        System.out.println("Bhauuu");
    }

    public void eat(){
        System.out.println("pedigree");
    }
}
