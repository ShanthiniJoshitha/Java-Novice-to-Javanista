import java.util.*;

public class MapOperations {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Printing the map
        System.out.println("Original Map: " + map);

        // Accessing values
        System.out.println("Value for key 2: " + map.get(2));

        // Checking for a key
        System.out.println("Contains key 3? " + map.containsKey(3));
        
        // Checking for a value
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana"));
        
        // Removing an entry
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // Iterating over keys
        System.out.print("Keys: ");
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        // Iterating over values
        System.out.print("Values: ");
        for (String value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Iterating over key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}