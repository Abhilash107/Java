package Java8.lambdaExpression;

import Multithreading.UsingLambda.Student;

interface MathOperation{
    public int execute(int a, int b);
}

//interface MathOperation{
//    public int execute(int a, int b);
//    public int executeII(int a, int b);
//}
//Lambda works ONLY with Functional Interfaces
//A Functional Interface = exactly ONE abstract method.
//So this is NOT a functional interface, and lambda will NOT compile.

// we can achieve if only one abstract method exists
interface MathOperationII{
    public int execute(int a, int b);

    default int executeII(int a, int b){
        return a & b;
    }
}
public class Test {
    public static void main(String[] args) {
        //OVERVIEW of Lambda function

        // let's implement an interface using lambda function
        // class --> here no extra class
        // obj --> obj and method in the same block
        // call the method

//        MathOperation sumOp = (a, b) ->{
//            return a + b;
//        };

        MathOperation sumOp = (a, b) -> a + b;
        MathOperation subOp = (a, b) -> a - b;
        MathOperation mulOp = (a, b) -> a * b;
        MathOperation divOp = (a, b) -> (b == 0) ? -1 : a / b ;
        System.out.println(sumOp.execute(1,2));
        System.out.println(subOp.execute(1,2));
        System.out.println(mulOp.execute(1,2));
        System.out.println(divOp.execute(10,0));

        MathOperationII sumOp2 = (a, b) -> a + b;
        MathOperationII subOp2 = (a, b) -> a - b;
        MathOperationII mulOp2 = (a, b) -> a * b;
        MathOperationII divOp2 = (a, b) -> (b == 0) ? -1 : a / b ;
        System.out.println(sumOp2.execute(1,2));
        System.out.println(subOp2.execute(1,2));
        System.out.println(mulOp2.execute(1,2));
        System.out.println(divOp2.execute(10,0));

        System.out.println(divOp2.executeII(2, 3));






        //Using anonymous class
        Student student = new Student() {
            @Override
            public String getName(String name) {
                return "Name: " + name;
            }
        };

        String name = student.getName("Messi");
        //System.out.println(name);

        //Using Lambda
        Student lawStudent = n -> {
            return n + " is a law student";
        };

        //OR (without curly braces)
        Student medStudent = n -> n + " is a medical student";



        //if void type declared
        //Student lawStudent = n -> System.out.println(n + " is a law student") ;

        String lawName = lawStudent.getName("n");
    }


}
