package OOPS_QNS.studentManagementSystem;

import java.util.HashMap;

public class EnrollmentManager {
    private HashMap<Long, Student> students;
    private HashMap<String, Course> courses;

    public EnrollmentManager(){
        this.students = new HashMap<>();
        this.courses = new HashMap<>();
    }

    //register
    public void addStudent(Student student){
        students.put(student.getRegistrationNumber(), student);
    }

    public void addCourse(Course course){
        courses.put(course.getCourseId(), course);
    }

    public boolean enrollStudent(long studentId, String courseId){
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if(student == null || course == null){
            System.out.println("Student or course not found");
            return false;
        }

        if(course.isFull()){
            System.out.println("Course is full");
            return false;
        }

        if(course.hasStudent(student)){
            System.out.println("Student already enrolled");
            return false;
        }

        student.addCourse(course);
        course.addStudent(student);

        System.out.println("Student enrolled successfully");
        return true;
    }

    public boolean dropStudent(long studentId, String courseId){
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if(student == null || course == null){
            System.out.println("Student or course not found");
            return false;
        }

        if(!course.hasStudent(student)){
            System.out.println("Student  not enrolled in this course");
            return false;
        }

        student.removeCourse(course);
        course.removeStudent(student);

        System.out.println("Student removed from course");
        return true;
    }

    static void main() {
        EnrollmentManager manager = new EnrollmentManager();

        Student s1 = new Student("Abhilash", "a@gmail.com", "CSE");
        Course c1 = new Course( "Java","CS101");

        manager.addStudent(s1);
        manager.addCourse(c1);

        manager.enrollStudent(s1.getRegistrationNumber(), "CS101");
        manager.dropStudent(s1.getRegistrationNumber(), "CS101");

    }
}
