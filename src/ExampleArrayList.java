import java.util.ArrayList;


public class ExampleArrayList {
    ExampleArrayList(){
	// Declare an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        
        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Access elements of the ArrayList
        int firstNumber = numbers.get(0);
        int secondNumber = numbers.get(1);
        
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
        
        // Remove an element from the ArrayList
        numbers.remove(1);
        System.out.println("ArrayList after removing the second element: " + numbers);
    }
}
