import java.util.*;

public class OrderSetElements {
    public static void main(String[] args) {
        // HashSet - No guaranteed order
        Set<String> hashSet = new HashSet<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));
        System.out.println("HashSet (Unordered): " + hashSet);
        
        // LinkedHashSet - Maintains insertion order
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);
        
        // TreeSet - Natural sorting order
        Set<String> treeSet = new TreeSet<>(Arrays.asList("Banana", "Apple", "Cherry", "Mango"));
        System.out.println("TreeSet (Sorted Order): " + treeSet);
    }
}
