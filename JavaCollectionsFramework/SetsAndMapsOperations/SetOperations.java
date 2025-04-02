import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        // Creating two sets
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        // Adding elements to setA
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        
        // Adding elements to setB
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);
        
        System.out.println("Set A: " + setA);
        System.out.println("Set B: " + setB);
        
        // Performing Union Operation
        Set<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);
        
        // Performing Intersection Operation
        Set<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);
        
        // Performing Difference Operation (setA - setB)
        Set<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference (A - B): " + difference);
        
        // Performing Symmetric Difference
        Set<Integer> symmetricDifference = new HashSet<>(union);
        symmetricDifference.removeAll(intersection);
        System.out.println("Symmetric Difference: " + symmetricDifference);
    }
}
