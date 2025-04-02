import java.util.*;

public class CollectionViewsOnMap {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Alice", 90);
        scores.put("Bob", 85);
        scores.put("Charlie", 88);
        
        // Viewing the key set
        Set<String> keys = scores.keySet();
        System.out.println("Key Set: " + keys);
        
        // Viewing the values collection
        Collection<Integer> values = scores.values();
        System.out.println("Values: " + values);
        
        // Viewing the entry set
        Set<Map.Entry<String, Integer>> entries = scores.entrySet();
        System.out.println("Entry Set: " + entries);
        
        // Modifying map through entry set
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getKey().equals("Bob")) {
                entry.setValue(95);
            }
        }
        
        System.out.println("Updated Map: " + scores);
    }
}