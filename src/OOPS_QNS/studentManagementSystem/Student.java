package OOPS_QNS.studentManagementSystem;

import java.util.ArrayList;

public class Student {
    private String name, email, department;
    private long registrationNumber;
    private static long serialCounter = 0;
    private ArrayList<Course> courses;

    public Student(String _name, String _email, String _dept){
        this.name = _name;
        this.email = _email;
        this.department = _dept;
        this.registrationNumber = ++serialCounter;
        this.courses =new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public long getRegistrationNumber() {
        return registrationNumber;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }

    public ArrayList<Course> getCourses(){
        return this.courses;
    }



}
