import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Creating a parameterized list
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        System.out.println("Original List: " + names);
        
        // Adding an element at a specific index
        names.add(1, "David");
        System.out.println("After adding David at index 1: " + names);
        
        // Removing an element by index
        names.remove(2);
        System.out.println("After removing index 2: " + names);
        
        // Removing an element by value
        names.remove("Alice");
        System.out.println("After removing Alice: " + names);
        
        // Checking if the list contains an element
        System.out.println("List contains Bob: " + names.contains("Bob"));
        
        // Getting an element by index
        System.out.println("Element at index 1: " + names.get(1));
        
        // Updating an element
        names.set(0, "Eve");
        System.out.println("After updating index 0 to Eve: " + names);
        
        // Finding the size of the list
        System.out.println("List size: " + names.size());
        
        // Clearing the list
        names.clear();
        System.out.println("After clearing the list: " + names);
    }
}