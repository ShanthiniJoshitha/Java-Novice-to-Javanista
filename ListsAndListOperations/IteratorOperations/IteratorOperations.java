import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorOperations {
    public static void main(String[] args) {
        // Creating a parameterized list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        
        System.out.println("Original List: " + names);
        
        // Using an iterator to traverse the list
        Iterator<String> iterator = names.iterator();
        System.out.print("Iterating through list: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // Using an iterator to remove elements
        iterator = names.iterator(); // Reset iterator
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("A")) {
                iterator.remove();
            }
        }
        System.out.println("After removing names starting with 'A': " + names);
    }
}
