package Questions.tcs;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
class Student{
    String name;
    int marks;

    Student(String _n, int _m){
        this.name = _n;
        this.marks = _m;
    }
}

public class problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int k = sc.nextInt();
        PriorityQueue<Student> q = new PriorityQueue<>((a,b) -> b.marks - a.marks);

        for(int i = 0;i < N;i++){
            String name = sc.next();
            int mark = sc.nextInt();

            q.add(new Student(name, mark));

        }

        while(!q.isEmpty() && k > 0){
            Student s = q.poll();
            System.out.println(s.name +" "+ s.marks);
            k--;
        }

    }


}
