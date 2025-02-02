package Strings.Basics;

class Student{
    String name;
    int age;
    Student(String n, int a){
        this.age = a;
        this.name = n;
    }
    Student(){
    }
    void setDetails(String n, int a){
        this.age = a;
        this.name = n;
    }
    void getDetails(){
        System.out.println(this.name + " " + this.age);
    }



}
public class Intro {

    public static void main(String[] args) {
        Student stdOne = new Student();
        stdOne.name = "Abhilash";
        //stdOne.name = new String("Abhilash");
        stdOne.age = 23;
        //stdOne.getDetails();
        stdOne.setDetails("Papun", 25);
        //stdOne.getDetails();

        Student stdTwo = new Student("Leo Messi", 35);
        stdTwo.getDetails();

        stdTwo.name = "La pulga";
        stdTwo.age = 15;
        stdTwo.getDetails();
        stdTwo.setDetails("La Masia", 19);
        stdTwo.getDetails();
    }
}
