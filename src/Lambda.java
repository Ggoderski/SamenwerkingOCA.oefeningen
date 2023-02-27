import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class Lambda {

	Lambda(){
	List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant");
    
    // Define a predicate lambda expression to test if a string starts with "a"
    Predicate<String> startsWithA = s -> s.startsWith("a");
    
    // Use the predicate lambda expression with a forEach() method to print all words starting with "a"
    words.stream()
         .filter(startsWithA)
         .forEach(word -> System.out.println(word));
	}
}
