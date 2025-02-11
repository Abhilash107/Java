package OOP.Encapsulation;

public class Test {

    public static void main(String[] args) {
        Student std = new Student();
        //Here we can set and access the fields directly any from any class
//        std.name = "Abhilash";//'name' has private access in 'OOP. Encapsulation. Student'
//        std.id = 12345;
//        std.grade = 'B';
        //To incorporate encapsulation we need access modifiers

        //now to get those

        std.setName("Abhilash");
        std.setId(1234);
        std.setGrade('A');
        std.display();
    }
}
