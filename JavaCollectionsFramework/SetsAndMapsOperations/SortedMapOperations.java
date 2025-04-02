import java.util.*;

// Class implementing Comparable to define natural ordering
class Product implements Comparable<Product> {
    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.id, other.id); // Sorting by id in ascending order
    }

    @Override
    public String toString() {
        return "(" + id + ", " + name + ")";
    }
}

public class SortedMapOperations {
    public static void main(String[] args) {
        // TreeMap with Comparable objects
        TreeMap<Product, String> productTreeMap = new TreeMap<>();
        
        productTreeMap.put(new Product(3, "Laptop"), "Electronics");
        productTreeMap.put(new Product(1, "Apple"), "Fruit");
        productTreeMap.put(new Product(2, "Car"), "Vehicle");
        
        System.out.println("TreeMap sorted using Comparable (by Product ID): " + productTreeMap);
        
        // Performing Sorted Map operations
        TreeMap<Integer, String> sortedMap = new TreeMap<>();
        
        sortedMap.put(3, "Laptop");
        sortedMap.put(1, "Apple");
        sortedMap.put(2, "Car");
        
        System.out.println("TreeMap: " + sortedMap);

        System.out.println("First Entry: " + sortedMap.firstEntry());
        System.out.println("Last Entry: " + sortedMap.lastEntry());
        System.out.println("Head Map (ID < 3): " + sortedMap.headMap(3));
        System.out.println("Tail Map (ID >= 2): " + sortedMap.tailMap(2));
        System.out.println("Sub Map (ID 1 to 2): " + sortedMap.subMap(1, 3));
    }
}