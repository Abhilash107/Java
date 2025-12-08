package Java8;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        //Function -> does some work
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> getSquare = x -> x * x;
        System.out.println(doubleIt.apply(1));

    }
}
