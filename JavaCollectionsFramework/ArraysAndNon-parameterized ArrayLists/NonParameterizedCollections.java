/*
 * Topic: Working with Non-Parameterized Collections
 * This program demonstrates how to create and manipulate non-parameterized collections in Java.
 */

import java.util.*;

public class NonParameterizedCollections {
    public static void main(String[] args) {
        // Creating a raw (non-parameterized) ArrayList
        ArrayList rawList = new ArrayList();
        
        // Adding elements of different types
        rawList.add("Hello");
        rawList.add(100);
        rawList.add(45.67);
        
        // Displaying the raw list
        System.out.println("Contents of the raw collection:");
        for (Object element : rawList) {
            System.out.println("Element: " + element + " (Type: " + element.getClass().getSimpleName() + ")");
        }

        // Accessing elements with explicit casting
        String firstElement = (String) rawList.get(0);
        System.out.println("First element as String: " + firstElement);

        // Attempting to cast an incompatible type will cause a runtime exception
        // Uncommenting the following line will throw a ClassCastException
        // String invalidCast = (String) rawList.get(1);
    }
}
