package OOP.Constructor;

public class MyClass {
    int age;
    public MyClass(){//No return type and with class name
        this.age = 10;
    }
    public MyClass(int a){//No return type and with class name
        this.age = a;
    }
    public static void main(String[] args) {
        MyClass myClass = new MyClass();//Default
        System.out.println(myClass.age);

        MyClass myNewClass = new MyClass(100);//parameterized
        System.out.println(myNewClass.age);
    }
}
