import java.util.List;
import java.util.Optional;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<String> letters = List.of("W","A","S","I","M","H","J");

        //Stream.findAny()
        //findAny() method allows us to find any (random) element from a Stream.
        // returns Optional<T>

        //In a non-parallel operation, it will most likely return the first element in the Stream,
        // but there is no guarantee for this.
        Optional<String> randomLetter = letters.stream().findAny();
        System.out.println("Random Letter -> "+ randomLetter.get());

        //Stream.findFirst()
        //findFirst() method allows us to find the first element from a Stream.
        // returns Optional<T>
        Optional<String> firstElement = letters.stream().findFirst();
        System.out.println("First Element -> "+ firstElement.get());
        System.out.println(firstElement.get().equals("W"));
        
    }
}
