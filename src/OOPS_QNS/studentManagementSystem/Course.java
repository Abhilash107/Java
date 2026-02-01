package OOPS_QNS.studentManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String courseName, courseId;
    private int maxCapacity = 50;
    private HashMap<Long, Student> enrolledStudents;

    public Course(String _name, String _courseId){
        this.courseName = _name;
        this.courseId = _courseId;
        this.enrolledStudents = new HashMap<>();
    }

    public boolean isFull(){
        return enrolledStudents.size() >= maxCapacity;
    }

    public String getCourseId(){
        return this.courseId;
    }

    public boolean hasStudent(Student student){
        return enrolledStudents.containsKey(student.getRegistrationNumber());
    }

    public void addStudent(Student student){
        enrolledStudents.put(student.getRegistrationNumber(), student);
    }

    public void removeStudent(Student student){
        enrolledStudents.remove(student.getRegistrationNumber());
    }



}
