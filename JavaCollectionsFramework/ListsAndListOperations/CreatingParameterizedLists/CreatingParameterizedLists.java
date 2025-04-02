import java.util.ArrayList;

public class CreatingParameterizedLists {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings (Parameterized List)
        ArrayList<String> names = new ArrayList<>();
        
        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        // Printing the list
        System.out.println("Names List: " + names);
        
        // Accessing elements
        System.out.println("First name: " + names.get(0));
        
        // Modifying an element
        names.set(1, "Bobby");
        System.out.println("Updated Names List: " + names);
        
        // Removing an element
        names.remove("Charlie");
        System.out.println("List after removal: " + names);
        
        // Checking if list contains an element
        System.out.println("Contains Alice? " + names.contains("Alice"));
        
        // Iterating over the list
        System.out.println("Iterating through list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
