package Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test {
    public static void main(String[] args) {
        //Syntax errors
        //int a = 10  missing semicolon

       // int a = 1/0;
        //System.out.println(a);/// by zero at Exceptions.Test.main(Test.java:8)

        int arr[] = {1,2,3};
        try{
            for(int i = 0;i < 4;i++){//Index 3 out of bounds for length 3
                arr[i] += 1;
            }
        }catch (Exception e) {
            System.out.println("Index out of bound");
        }

        //levelTwo();//2 exception
        //levelThree();//3 exception
        //levelOne();//1 exception

        try{
            levelThree();
        }catch (Exception e){
            System.out.println("hehe");
        }

        System.out.println(finallyExm(2,90));

        System.out.println(testMethod());//30 if no error as


    }

    public static int divide(int a, int b){
        try{
            return a/b;
        }
        catch (Exception e){
            return -1;
        }
//      catch (ArithmeticException | RuntimeException e){//Types in multi-catch must be disjoint: 'java. lang. ArithmeticException' is a subclass of 'java. lang. RuntimeException'
//           return -1;
//      }
        //The Throwable class is the superclass of all errors and exceptions in the Java language.
        //The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.

        // or we can use multiple catches
    }

    public static void levelOne(){
        int a[] = new int[5];
        a[5] = 10;
    }
    public static void levelTwo(){
        levelOne();
    }
    public static void levelThree(){
        levelTwo();
    }

    //checked Exceptions:
    public  static  void method1() throws FileNotFoundException {
        FileReader fileReader = new FileReader("a.txt");
    }

//    public  static  void method2(){
//        method1();Unhandled exception: java. io. FileNotFoundException
//    }

    public  static  void method2() throws FileNotFoundException{
        method1();// Handled exception: java. io. FileNotFoundException
    }

    //method1() can also be handled by try-cath
    public  static  void method3() throws FileNotFoundException {
        try{
            FileReader fileReader = new FileReader("a.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);//creating an obj of Runtime
            //throw new RuntimeException("Error");//creating an obj of Runtime ith custom message
        }

    }


    //finally:
    public static int finallyExm(int a, int b){
        try{
            return a/b;
        }
        catch (Exception e){
            return -1;
        }
        finally {
            System.out.println("Siuuuuuuuu");//if error it gets executed first
        }
    }


        public static int testMethod() {
            try {
                return 10;  // ✅ This return is overridden
            } catch (Exception e) {
                return 20;  // ❌ This return is also overridden
            } finally {
                return 30;  // 🔥 This return overrides all previous returns
            }
//If finally has a return, it overrides try and catch returns.
//✅ If finally does not return anything, the return from try or catch is used.
//✅ Using return inside finally is not recommended because it makes debugging harder.
        }





}
