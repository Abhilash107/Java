package OOP.Inheritance.humans;

public class Parent extends GrandParent{
    public Parent(int age, String name){
        super(age, name);
        System.out.println("parent called...");
        //super();//Call to 'super()' must be first statement in constructor body
    }

    public void parentMethod(){
        System.out.println("Parent method...");
        //super keyword can't access private fields
    }
}
