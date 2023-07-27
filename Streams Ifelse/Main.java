import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Use if/else Logic in Java 8 Streams

/**
 * @author Hjwasim
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //Conventional if/else Logic Within forEach()
         integers.stream().forEach(integer -> {
             if(integer % 2 == 0){
                 System.out.println("Even ->"+integer);
             }else {
                 System.out.println("Odd ->"+integer);
             }
         });

         // if/else Logic With filter()
        Stream<Integer> evenIntegers = integers.stream().filter(integer -> integer.intValue() % 2 == 0);
        Stream<Integer> oddIntegers = integers.stream().filter(integer -> integer.intValue() % 2 != 0);
    }
}
