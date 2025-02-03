package Basics;

public class Conditionals {
    public static void main(String[] args) {
        int a = 2;
        switch (a){
            case 1:
                System.out.println("hello");
                break;
            //Imp curly braces can also be used here
            case 2:{
                System.out.println("Hello");
                break;
            }
        }
    }
}
