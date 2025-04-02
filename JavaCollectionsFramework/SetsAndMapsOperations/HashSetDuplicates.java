import java.util.HashSet;
import java.util.Set;

public class IdentifyDuplicates {
    public static void main(String[] args) {
        // Sample array with duplicates
        Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1};
        
        // Set to store unique elements
        Set<Integer> uniqueNumbers = new HashSet<>();
        
        // Set to store duplicates
        Set<Integer> duplicates = new HashSet<>();
        
        // Identifying duplicates
        for (Integer num : numbers) {
            if (!uniqueNumbers.add(num)) { // If add() returns false, it's a duplicate
                duplicates.add(num);
            }
        }
        
        System.out.println("Original array: ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nUnique elements: " + uniqueNumbers);
        System.out.println("Duplicate elements: " + duplicates);
    }
}