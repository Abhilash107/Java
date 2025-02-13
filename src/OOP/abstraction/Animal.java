package OOP.abstraction;

public abstract class Animal {

//    public void sayHello(){
//        System.out.println("...");
//    }

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    //Constructor can be set
    public Animal(){//best practice is to make it protected

    }


    //public void sayHello();//Missing method body, or declare abstract
    //Abstract method in non-abstract class so need to set abstract in class
    public abstract void sayHello();//abstract method

    //can write regular methods inside abstract class
    public void sleep(){//Concrete method
        System.out.println("zzz....");
    }

}
