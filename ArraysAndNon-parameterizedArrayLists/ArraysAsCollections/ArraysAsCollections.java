/*
 * Topic: Working with Arrays as Collection Containers
 * This program demonstrates converting arrays into collections using Arrays.asList().
 */

import java.util.*;

public class ArraysAsCollections {
    public static void main(String[] args) {
        // Array of Strings
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};
        
        // Convert array to a List
        List<String> fruitList = Arrays.asList(fruits);
        
        // Displaying the list
        System.out.println("List representation of the array:");
        System.out.println(fruitList);
        
        // Sorting the list
        Collections.sort(fruitList);
        System.out.println("Sorted list:");
        System.out.println(fruitList);
        
        // Checking if an element exists
        System.out.println("Does the list contain 'Banana'? " + fruitList.contains("Banana"));
        
        // Iterating over the list using forEach
        System.out.println("Iterating over the list:");
        fruitList.forEach(System.out::println);
    }
}
