package Strings.Basics;

import java.util.stream.IntStream;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Abhilash";
        String name2 = "abhilash";
        int length = name.length();
        System.out.println(length);

        //char c = name.charAt(length);//error
        //System.out.println(c);

//        System.out.println(name.equals(name2));
//        System.out.println(name.equalsIgnoreCase(name2));
        // returns the difference of the two character values at position k in the two string -- that is, the value:
        // ==> this.charAt(k)-anotherString. charAt(k)
        int res = name.compareTo(name2);//-32
        int res2 = name2.compareTo(name2);//0
        int res3 = "Abhi".compareToIgnoreCase("abhi");//0
//        System.out.println(res);
//        System.out.println(res2);
//        System.out.println(res3);
//        System.out.println((int)'r');//114
//        System.out.println(0 + 'r');//114
//        System.out.println('r' + 0);//114








    }
}
