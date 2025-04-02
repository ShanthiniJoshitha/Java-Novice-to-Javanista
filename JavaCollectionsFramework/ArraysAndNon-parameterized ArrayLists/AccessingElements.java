/*
 * Topic: Accessing Elements in Arrays
 * This program demonstrates various ways to access elements in an array.
 */

import java.util.Arrays;

public class AccessingElements {
    public static void main(String[] args) {
        // Creating an integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing elements using index
        System.out.println("Accessing elements using index:");
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        // Using a for loop to iterate and access elements
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }

        // Using Arrays.toString() to print array contents
        System.out.println("\nUsing Arrays.toString(): " + Arrays.toString(numbers));
    }
}
