package Generics.genericCostructor;

import Multithreading.B;

public class Box {


    public <T extends Number> Box(T value){

    }

    public static void main(String[] args) {
        Box box = new Box(2);
    }


}
