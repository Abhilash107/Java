package Basics;

public class TestClass {
    public static void main(String[] args) {
        Student std = new Student();//Obj of a Student class with ref variable name std;
        std.marks = 10;

        std.name = "Abhilash";
        // Since String is a class so it can also be defined as:
        String newString = new String("Abhilash");

        System.out.println(std.name.equals(newString));

    }
}
