package OOP.Encapsulation;

public class Student {
    //properties/fields/instance vars & behaviour

    //Good Practice
    private String name;
    private int id;
    private char grade;
    // To get and set private fields


    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println(this.name + " " + this.id + " "+ this.grade );
    }



}
