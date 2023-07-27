import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// The skip() vs limit() Method


/**
 * @author Hjwasim
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> checkEven = integer -> integer % 2 == 0;

        // The skip(n) Method
        // intermediate operation that discards the first n elements of a stream.
        // n -> positive
        System.out.println("skip(n)");
        integers.stream().filter(checkEven).skip(1).forEach(results -> {
            // System.out.println(results);
        });

        // The limit(n) Method
        // intermediate operation that returns a stream not longer than the requested size.
        // n -> positive
        System.out.println("limit(n)");
        integers.stream().filter(checkEven).limit(2).forEach(results -> {
            //   System.out.println(results);
        });

        //used when truncating infinite stream into finite stream
//        Stream.iterate(0, integer -> integer + 1)
//                .filter(checkEven)
//                .limit(10)
//                .forEach(System.out::println);
        getEvenNumbers(2,5);
    }


    // combined usage of skip() and limit()
    private static void getEvenNumbers(int offset, int limit) {
        Stream.iterate(0, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .skip(offset)
                .limit(limit)
                .forEach(System.out::println);
    }
}
