package Multithreading.UsingLambda;

public class Lambda {

    public static void main(String[] args) {
        //OVERVIEW of Lambda function

        // let's implement an interface using lambda function
        // class --> here no extra class
        // obj  --> ob and method in a same block
        // call the method

        //Using anonymous class
        Student student = new Student() {
            @Override
            public String getName(String name) {
                return "Name: " + name;
            }
        };

        String name = student.getName("Messi");
        System.out.println(name);

        //Using Lambda
        Student lawStudent = n -> {
            return n + " is a law student";
        };

        //OR (without curly braces)
        Student medStudent = n -> n + " is a medical student";



        //if void type declared
        //Student lawtudent = n -> System.out.println(n + " is a law student") ;

        String lawName = lawStudent.getName("n");





    }
}
