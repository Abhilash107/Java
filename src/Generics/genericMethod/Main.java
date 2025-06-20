package Generics.genericMethod;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        Integer[] a = {1,2,3,4,5,6,7,8,9};

        main.print(a);
    }

    public <T> void print(T[] arr){
        for(T element : arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }//or we can use static to avoid object creation of Main class
}
