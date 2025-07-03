package collectionFramework.COMPARABLE;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int marks;

    public Student(String n, int m){
        this.name = n;
        this.marks = m;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();

        list.add(new Student("A", 67));
        list.add(new Student("B", 49));
        list.add(new Student("C", 98));
        list.add(new Student("D", 85));
        list.add(new Student("A", 73));

        list.sort(null);
        System.out.println(list.toString());

    }
}
