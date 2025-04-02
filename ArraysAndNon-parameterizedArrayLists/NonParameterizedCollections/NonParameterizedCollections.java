/*
 * Topic: Working with Non-parameterized Collections
 * This program demonstrates the use of raw (non-parameterized) collections in Java.
 */

import java.util.*;

public class NonParameterizedCollections {
    public static void main(String[] args) {
        // Creating a non-parameterized ArrayList
        ArrayList rawList = new ArrayList();
        
        // Adding elements of different types
        rawList.add("Java");
        rawList.add(42);
        rawList.add(3.14);
        
        System.out.println("Contents of raw (non-parameterized) collection:");
        for (Object obj : rawList) {
            System.out.println(obj + " (Type: " + obj.getClass().getSimpleName() + ")");
        }
        
        // Potential issue: Type casting required
        String firstElement = (String) rawList.get(0);
        System.out.println("First element as String: " + firstElement);
        
        // Uncommenting below will cause a runtime error
        // String invalidCast = (String) rawList.get(1); 
    }
}