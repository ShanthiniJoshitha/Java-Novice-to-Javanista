import java.util.*;

// Custom Comparator for sorting in descending order
class DescendingOrderComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a); // Reverse order
    }
}

public class TreeMapWithComparator {
    public static void main(String[] args) {
        // TreeMap with custom comparator (descending order)
        TreeMap<Integer, String> treeMap = new TreeMap<>(new DescendingOrderComparator());
        
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(5, "Date");
        
        System.out.println("TreeMap with custom comparator (descending order): " + treeMap);
        
        // Natural order TreeMap for comparison
        TreeMap<Integer, String> naturalTreeMap = new TreeMap<>();
        naturalTreeMap.putAll(treeMap);
        
        System.out.println("TreeMap with natural ordering: " + naturalTreeMap);
    }
}