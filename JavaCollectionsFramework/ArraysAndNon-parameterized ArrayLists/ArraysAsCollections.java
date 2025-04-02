/*
 * Topic: Using Arrays as Collections
 * This program demonstrates how to use the Arrays class to work with collections in Java.
 */

import java.util.Arrays;
import java.util.List;

public class ArraysAsCollections {
    public static void main(String[] args) {
        // Creating an array
        String[] fruitsArray = {"Apple", "Banana", "Cherry", "Date"};

        // Converting array to a list
        List<String> fruitList = Arrays.asList(fruitsArray);

        // Displaying the list
        System.out.println("Array converted to List: " + fruitList);

        // Sorting the array
        Arrays.sort(fruitsArray);
        System.out.println("Sorted Array: " + Arrays.toString(fruitsArray));

        // Filling the array with a specific value
        Arrays.fill(fruitsArray, "Mango");
        System.out.println("Array after filling: " + Arrays.toString(fruitsArray));

        // Binary search in sorted array
        String[] numbers = {"One", "Two", "Three", "Four", "Five"};
        Arrays.sort(numbers);
        int index = Arrays.binarySearch(numbers, "Three");
        System.out.println("Index of 'Three' in sorted array: " + index);
    }
}
