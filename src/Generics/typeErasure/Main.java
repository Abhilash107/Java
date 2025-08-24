package Generics.typeErasure;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //    What is Type Erasure?
//    Type Erasure is the process by which Java removes generic type information at compile time.
//    Generics were added in Java 5 for type safety and code reusability, but to maintain backward compatibility with older (non-generic) code, the JVM does not know about generics at runtime.
//
//    After compilation, all generic type information is erased and replaced with either:

//    The raw type (e.g., List<T> → List)
//    Or the first bound (e.g., <T extends Number> → Number).

        List<String> list = new ArrayList<>();
        list.add("Hello");

        // At runtime, after type erasure
//    List list = new ArrayList();
//    list.add("Hello"); // type safety is gone

        //The JVM only sees a List, not a List<String>.

    }
}
class Test<T extends Number> {
    T value;
    public void setValue(T value) {
        this.value = value;
    }
}
// After compilation (type erasure):
//public class Test {
//    Number value;
//    public void setValue(Number value) {
//        this.value = value;
//    }
//}

// * Type erasure can cause compile-time errors because two methods may look the same after erasure:

//public class Demo {
//    public void print(List<String> list) {}
//    public void print(List<Integer> list) {}
//}


