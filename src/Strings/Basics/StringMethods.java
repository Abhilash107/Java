package Strings.Basics;

import java.util.stream.IntStream;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Abhilash";
        String name2 = "abhilash";
        int length = name.length();
        //System.out.println(length);

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

        String str = "   Abhilash   ";
        //Returns a string that is a substring of this string. The substring begins with the character at the specified index and extends to the end of this string.

        System.out.println(str.substring(1));
        //Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.
        System.out.println(str.substring(1,2));


        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());


        System.out.println(str.trim());
        //Above all methods return new Strings since String are immutable


        //Returns a string whose value is the concatenation of this string repeated count times.
        System.out.println(str.repeat(10));

        System.out.println(str.replace("abcf", "lumn"));
        //If the target not found string remains as it is.

        System.out.println(str.contains("a"));//CharSequence

        System.out.println(str.startsWith("A"));
        System.out.println(str.trim().endsWith("h"));


        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false


        //Returns true if the string is empty or contains only white space codepoints, otherwise false.
        System.out.println("".isBlank());//true
        System.out.println(" ".isBlank());//true


        System.out.println("Hello".indent(1));
        System.out.println("Hello".indent(2));
        System.out.println("Hello".indent(3));
        System.out.println("Hello".indent(4));

        System.out.println("Hello".indexOf('a'));//-1
        System.out.println("Hello".indexOf('l'));//2
        System.out.println("Hello".indexOf('l', 3));//3
        System.out.println("Hello".indexOf('l', 2));//2
        System.out.println("Hello".indexOf("He"));//0
        System.out.println("Hello".lastIndexOf('l'));//3
        System.out.println("Hello".lastIndexOf("llo"));//2

        String num = String.valueOf(10);
        System.out.println(num);


        System.out.println("abcabc".subSequence(0, 2));
        System.out.println("abcabc".substring(0, 2));//same continuous







    }
}
