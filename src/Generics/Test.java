package Generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        //Not type safe as any data type can be added to this


        list.add("Hello");
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);

        //1.
        System.out.println(list);
        Object str = list.get(0);
        String s = (String) list.get(0);
        System.out.println(str+"  "+s);

        //2.
        Integer integer = (Integer)list.get(1);
        String string = (String)list.get(1);// error
        //Exception in thread "main" java.lang.ClassCastException:
        //class java.lang.Integer cannot be cast to class java.lang.String
        // (java.lang.Integer and java.lang.String are in module
        // java.base of loader 'bootstrap' at Generics.Test.main(Test.java:21)

        System.out.println(integer+"  "+string);

        // To overcome this issue we use generics
        ArrayList<Integer> intList = new ArrayList<>();// <> diamond operator

        intList.add(1);
        intList.add(2);
        intList.add(2);
        intList.add(3);
        //intList.add("Hello");//error





    }
}
