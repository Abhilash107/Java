package Java8.predicate;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        //predicate -> function interface boolean valued function
        //hold/store a condition to a variable
        Predicate<Integer> isEven = (x) -> x%2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> startsWithA = (w) -> w.startsWith("A");
        System.out.println(startsWithA.test("lK"));//false
        System.out.println(startsWithA.test("aK"));//false
        System.out.println(startsWithA.test("AK"));//true

        Predicate<String> endsWithA = (w) -> w.endsWith("H");

        Predicate<String> and = startsWithA.and(endsWithA);
        System.out.println(and.test("AbhilasH"));


        //we can achieve this by implementing a lambda expression


    }
}
