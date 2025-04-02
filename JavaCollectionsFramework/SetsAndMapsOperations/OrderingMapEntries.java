import java.util.*;

public class OrderingMapEntries {
    public static void main(String[] args) {
        // Using LinkedHashMap to maintain insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 28);

        System.out.println("LinkedHashMap (Insertion Order): " + linkedHashMap);
        
        // Using TreeMap to maintain sorted order
        Map<String, Integer> treeMap = new TreeMap<>(linkedHashMap);
        System.out.println("TreeMap (Sorted Order): " + treeMap);
    }
}
