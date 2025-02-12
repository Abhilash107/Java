package OOP.Inheritance.humans;

public class Child extends Parent{
    public Child(int age, String name){
        super(age, name);
        System.out.println("Child called...");
        //super(age, name);//Call to 'super()' must be first statement in constructor body
    }

    public void childMethod(){
        System.out.println("Child method");
        super.parentMethod();


    }

}
