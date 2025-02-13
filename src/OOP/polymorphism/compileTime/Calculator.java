package OOP.polymorphism.compileTime;

public class Calculator {
    public Calculator(){

    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args) {
        //Compiler time polymorphism: Overloading
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(2,3, 4));
        System.out.println(calculator.add(2.0,3.9));
    }

}
