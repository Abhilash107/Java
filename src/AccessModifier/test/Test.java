package AccessModifier.test;

import AccessModifier.school.School;
import AccessModifier.school.Student;
import AccessModifier.zoo.Dog;

public class Test {
    public static void main(String[] args) {
        //Student std = new Student();//Error due to private constructor
        //std.age = 18;
//        std.name = "kl";
//
//        std.sayHello();

//        School.getInstance();
//        School.getInstance();//this  won't be executed as now school != null so it will return school directly
        Dog dog = new Dog("Bob");
        dog.makeSound();
        //dog.changeSound();//'changeSound(java. lang. String)' has protected access in 'AccessModifier. zoo. Animal'
        // so it can't be accessed directly, but it can be accessed via a public method like setSound which call the "changeSound()" defined in the subclass that is Dog
        dog.setSound("woof");
    }
}
