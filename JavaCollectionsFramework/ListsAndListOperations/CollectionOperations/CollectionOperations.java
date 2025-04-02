import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {
        // Creating a parameterized list
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 2, 9, 1, 7);
        
        System.out.println("Original List: " + numbers);
        
        // Sorting the list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
        
        // Shuffling the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
        
        // Reversing the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
        
        // Finding min and max
        int min = Collections.min(numbers);
        int max = Collections.max(numbers);
        System.out.println("Minimum: " + min + ", Maximum: " + max);
        
        // Searching an element (binarySearch requires sorted list)
        Collections.sort(numbers);
        int index = Collections.binarySearch(numbers, 7);
        System.out.println("Index of 7: " + index);
        
        // Filling list with a specific value
        Collections.fill(numbers, 0);
        System.out.println("List after fill operation: " + numbers);
    }
}
