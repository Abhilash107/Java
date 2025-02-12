package OOP.Inheritance;

import OOP.Inheritance.animals.Cat;
import OOP.Inheritance.animals.Dog;
import OOP.Inheritance.humans.Child;
import OOP.Inheritance.humans.Parent;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(10);
        dog.setName("Bosco");
//        dog.eat();
//        dog.say();

        //Multi-level inheritance

        //Child child = new Child();
//        child.setAge(23);
//        child.setName("Abhilash");
//        System.out.println(child.hasSuperPowers());//fasle
        //Output:
//        GrandParent called...
//        parent called...
//        Child called...
        //i.e. Grandparent -> parent -> Child

        //Parent parent = new Parent();
        //GrandParent called...
        //parent called...
//        parent.setAge(56);
//        parent.setName("Prakash");


        Cat cat = new Cat();//Hierarchical inheritance as Dg and cat both extends Animal
        cat.say();

        //child.childMethod();
        //Parent method...  from super();
        //Child method

        //Child method
        //Parent method...  if super is called after print statement

        //It ia a good practice to write @override while overrriding


    }
}
