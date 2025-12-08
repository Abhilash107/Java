package Java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        //Stream
        //process collections of data in a functional and declarative manner
        // functional programming

        //stc -> intermediate operation -> terminal operation
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        // cnt even numbers:
        int cnt = 0;
        for(int x: numbers){
            if(x%2 == 0)cnt++;
        }

        //using streams
        long count = numbers.stream().filter(x -> x % 2 == 0).count();
        //source -> numbers
        //intermediate -> filter condition
        //terminal -> count

        //Creating streams
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = numbers1.stream();

        String arr[] = {"aa", "ff"};
        Stream<String> stream1 = Arrays.stream(arr);
    }
}
