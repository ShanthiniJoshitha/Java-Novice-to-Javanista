/*
 * Topic: Accessing Elements in Non-parameterized Collections
 * This program demonstrates how to access elements in a raw (non-parameterized) collection.
 */

import java.util.*;

public class AccessingNonParameterizedCollections {
    public static void main(String[] args) {
        // Creating a raw (non-parameterized) ArrayList
        ArrayList rawList = new ArrayList();
        
        // Adding elements of different types
        rawList.add("Hello");
        rawList.add(100);
        rawList.add(45.67);
        
        // Accessing elements
        System.out.println("Accessing elements in a raw collection:");
        for (int i = 0; i < rawList.size(); i++) {
            Object element = rawList.get(i);
            System.out.println("Element at index " + i + ": " + element + " (Type: " + element.getClass().getSimpleName() + ")");
        }
        
        // Type casting required when accessing specific types
        String firstElement = (String) rawList.get(0);
        System.out.println("First element as String: " + firstElement);
        
        // Uncommenting below will cause a runtime error due to incorrect casting
        // String invalidCast = (String) rawList.get(1);
    }
}