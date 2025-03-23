package OOP.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int n = 10;//Primitive datatype(Stack)
        Integer a = 0;// Wrapper class (Heap)
        Integer c = null;// Wrapper class (Heap)
        String s= "Siuuu";//Object

        //List<int> list = new ArrayList<>();//Type argument cannot be of primitive type
        List<Integer> list = new ArrayList<>();

        Integer numToWrapper =  Integer.valueOf(1);//Unnecessary boxing --> Java converts it automatically hence, auto-boxing
        int num = numToWrapper.intValue();//Unnecessary unboxing --> Java converts it automatically hence, auto-Unboxing

        //So
        Integer numToWrapper2 = 2;
        int num2 = numToWrapper2;
        System.out.println(numToWrapper2 + num2);//4

        System.out.println(Integer.max(2, 6));//6


        String str= "123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);






    }
}
