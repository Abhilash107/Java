package OutputQNS;

import java.util.*;

class Point {
    protected int x, y;

//    public Point(int _x, int _y)
//    {
//        x = _x;
//        y = _y;
//    }
}

class Test {
    protected int x, y;
}

class Test1 {

    // Constructor of this class
    Test1(int x)
    {

        // Print statement whenever this constructor is
        // called
        System.out.println("Constructor called " + x);
    }
}

class Base {
    protected void foo() {}
}
class Derived extends Base {
    //void foo() {}// default is more restricted than protected, hence either keep it protected or make it public
    //public void foo(){}
    protected void foo(){}
}

class Alpha {
    public String type = "a ";
    public Alpha() {
        System.out.print("alpha ");
    }
}

class Beta extends Alpha {
    public Beta()  {
        System.out.print("beta ");
    }

    void go() {
        type = "b ";
        System.out.print(this.type + super.type);
    }

}
class First {
    int i = 10;

    public First(int j) {
        System.out.println(i);      // (1)
        this.i = j * 10;            // (2)
    }
}

class Second extends First {
    public Second(int j) {
        super(j);                   // (3) call First(j)
        System.out.println(i);      // (4)
        this.i = j * 20;            // (5)
    }
}

class Writer {
    public  static void write()
    {
        System.out.println("Writing...");
    }
}
class Author extends Writer {
    public  static void write()
    {
        System.out.println("Writing book");
    }
}

class Programmer extends Author {
    public  static void write()
    {
        System.out.println("Writing code");
    }


}
class Main {

    Test1 t1 = new Test1(10);
    Main(int i) { t1 = new Test1(i); }

    public static void main(String args[]) {
//        Test t = new Test();
//        System.out.println(t.x + " " + t.y);// 0 0

//        for(int i = 0; 1; i++) {// comp error
//            System.out.println("Hello");
//            break;
//        }

//        C++ considers all non-zero values as true and 0 as false. Unlike C++, an integer value expression cannot be placed where a boolean is expected in Java. Following is the corrected program.
        for(int i = 0; true; i++) {
            System.out.println("Hello");// Hello 1 time
            break;
        }

        //System.out.println(fun());//Non-static method 'fun()' cannot be referenced from a static context
        //need to create an obj for non-static

        //Point p1 = new Point();//Expected 2 arguments but found 0
        //sol:
        //1. Remove the parameterized constructor.
        //2. Add a constructor without any parameter.



        //Main obj = new Main(5);
        //Constructor called 10
        //Constructor called 5

       // gfg(null);//String
        //In case of method overloading, the most specific method is chosen at compile time. As 'java.lang.String' is a more specific type than 'java.lang.Object'.



        //gfg(null);//with 3 overloaded methods
        //Ambiguous method call.
        //As 'java.lang.String' and 'java.lang.Integer' is a more specific type than 'java.lang.Object',but between 'java.lang.String' and 'java.lang.Integer' none is more specific.


//        String s1 = "abc";
//        String s2 = s1;
//        s1 += "d";
//        System.out.println(s1 + " " + s2 + " " + (s1 == s2));
//        //String s2 and s1 both pointing to the same string abc. And, after making the changes the string s1 points to abcd and s2 points to abc, hence false.

//        StringBuffer sb1 = new StringBuffer("abc");
//        StringBuffer sb2 = sb1;
//        sb1.append("d");
//        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
//        //String buffer, both sb1 and sb2 both point to the same object. Since string buffer are mutable, making changes in one string also make changes to the other string. So both string still pointing to the same object after making the changes to the object (here sb2).

//        short s = 0;
//        int x = 07;
//        //int y = 08;//Any number beginning with zero is treated as an octal number (which is 0-7).
//        int z = 112345;
//
//        s += z;
//        System.out.println("" + x + y + s);

//        Second n = new Second(20);  //10 200 400
//        System.out.println(n.i);


//        Object i = new ArrayList().iterator();
//        System.out.print((i instanceof List) + ", ");
//        System.out.print((i instanceof Iterator) + ", ");
//        System.out.print(i instanceof ListIterator);

        //new Beta().go();//alpha beta b b (same b as it inherits from parent)


        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        s1.append(s2);
        s1.substring(4);// returns a string and no string var so destroyede
        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);//4

        Author a = new Programmer();
        a.write();

//        Author a = new Programmer();
//        Reference type: Author
//        Actual object: Programmer
//
//        But since write() is static, the reference type matters, not the object type.
//         a.write();
//
//        Calls Author.write()
//        Prints: "Writing book"

    }

    int fun() {
        return 20;
    }

    ////static local variables are not allowed in Java.
    //static int fun2() {//comp error
//        static int x= 0;
//        return ++x;
    //}

    public static void gfg(String s) {
        System.out.println("String");
    }
    public static void gfg(Object o) {
        System.out.println("Object");
    }
    public static void gfg(Integer i)
    {
        System.out.println("Integer");
    }

}

