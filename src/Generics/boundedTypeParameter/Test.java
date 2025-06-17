package Generics.boundedTypeParameter;


public class Test {
    public static void main(String[] args) {
        //1.
        Box<Integer> box = new Box<>();
        Box<Float> box2 = new Box<>();
        Box<Double> box3 = new Box<>();
        //Box<String> box5 = new Box<>();
        //Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
        box.setValue(10);
        //box.setValue("10");




    }
}
