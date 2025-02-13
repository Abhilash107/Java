package OOP.ex;

public class Test {
    public static void main(String[] args) {
        //Car c = new Car();
        //c.edition = 2024;//'edition' has private access in 'OOP. Car'
//        c.model = "Sedan";//'model' has private access in 'OOP. Car'
//        c.color = "Black";//'model' has private access in 'OOP. Car'
//        c.brand = "BMW";
//        c.speed = 100;
//        c.accelerate(10);
//        c.deaccelerate(20);
//        c.display();

        //If the above Obj was created in the same class car, there would be no issues since the same class can access private variables.



        Cat cat = new Cat();
        cat.breed = "Orange";
        cat.name = "Munda";
        cat.age = 5;

        Animal dog = new Dog();//Woof Polymorphism
        //obj -> Dog, Reference -> Animal
        dog.makeSound();



    }
}
