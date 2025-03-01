package OOP.Interfaces;

public class Test {


    //It achieves: multiple inheritance, abstraction
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        System.out.println(Dog.MAX_AGE);
        System.out.println(Animal.MAX_AGE);//Interface -> static value
        Animal.info();
        dog.run();//run(default method) is defined on Interface
    }



}
