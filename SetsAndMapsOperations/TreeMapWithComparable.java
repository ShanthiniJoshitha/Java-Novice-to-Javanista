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

public class TreeMapWithComparable {
    public static void main(String[] args) {
        // TreeMap with Comparable objects
        TreeMap<Product, String> productTreeMap = new TreeMap<>();
        
        productTreeMap.put(new Product(3, "Laptop"), "Electronics");
        productTreeMap.put(new Product(1, "Apple"), "Fruit");
        productTreeMap.put(new Product(2, "Car"), "Vehicle");
        
        System.out.println("TreeMap sorted using Comparable (by Product ID): " + productTreeMap);
    }
}
