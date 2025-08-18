package OOP.Interfaces.Types;

class MyClass implements Marker{
    void sayHello(){
        System.out.println("Hello from MyClass!");
    }
}
public class Test {
    public static void main(String[] args) {

        //anonymous class
        //This allows you to use normal as an object with those method implementations.
        Normal normal = new Normal() {
            @Override
            public void eat() {
                System.out.println("Eat");
            }

            @Override
            public void sleep() {
                System.out.println("Sleep");
            }

            @Override
            public void code() {
                System.out.println("Code");
            }

            @Override
            public void repeat() {
                System.out.println("Repeat");
            }
        };

        Functional func = (a, b) -> a + b;

        MyClass myClass = new MyClass();


        normal.code();//Code

        System.out.println(func.function(2, 3));//5

        if(myClass instanceof Marker){
            System.out.println("MyClass is marked with Marker interface");
        }
        else {
            System.out.println("MyClass isn't marked with Marker interface");
        }
        myClass.sayHello();//Hello from MyClass!





    }
}
