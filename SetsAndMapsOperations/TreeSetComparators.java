import java.util.*;

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s2.compareTo(s1); // Reverse order sorting
    }
}

public class TreeSetComparators {
    public static void main(String[] args) {
        // TreeSet with custom comparator for reverse order sorting
        Set<String> treeSet = new TreeSet<>(new CustomComparator());
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");
        treeSet.add("Mango");
        
        System.out.println("TreeSet with Custom Comparator (Reverse Order): " + treeSet);
    }
}
