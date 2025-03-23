package OOP.WrapperClass;


class Student {
    public int id;

}
public class Qns {
    public static void main(String[] args) {
        Student x = new Student();//x is a ref to an OBJ
        x.id = 1;
        fun(x);
        System.out.println(x.id);//1
        fun2(x);
        System.out.println(x.id);//10


        //Ex - 3
        Integer a = 10;
        fun3(a);
        System.out.println(a);//10

        Integer b = 3;
        b = b - 2;
        System.out.println(b);

        //Ex - 4
        Integer m = 10;
        Integer n = 20;
        int u = 3;
        int v = 3;

        System.out.println(m == n);//same equality check
        System.out.println(m.equals(n));//same equality check
        System.out.println(u == v);



    }
    public static void fun(Student a){//a is a reference
        Student student = new Student();// new obj
        student.id = 10;
        a = student;// a = student obj i.e a points to a diff obj but x in the main method a points to the same OBJ
    }

    public static void fun2(Student a){//a is a reference
        a.id = 10;//access the "a" changes the obj value
        //Inside fun2(Student a), a is a copy of the reference x, so a also points to the same object.
        //a.id = 10; modifies the same object that x refers to.


    }

    public static void fun3(Integer a){
        a = 20;//ref is changed but the obj remains same
        //the reference "a" is reassigned to a new Integer object (20), but this does not affect the original reference in main().


    }


}

