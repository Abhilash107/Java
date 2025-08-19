package OutputQNS;

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

class Main {
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






    }

    int fun() {
        return 20;
    }

//    static int fun2() {//comp error
//        static int x= 0;//static local variables are not allowed in Java.
//        return ++x;
//    }


}

