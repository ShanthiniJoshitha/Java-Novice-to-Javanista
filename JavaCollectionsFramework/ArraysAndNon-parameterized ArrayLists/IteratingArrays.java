/*
 * Topic: Iterating Over Arrays
 * This program demonstrates different ways to iterate over arrays in Java.
 */

public class IteratingArrays {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Using an enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Using a while loop
        System.out.println("\nUsing while loop:");
        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }

        // Using a do-while loop
        System.out.println("\nUsing do-while loop:");
        int idx = 0;
        do {
            System.out.print(numbers[idx] + " ");
            idx++;
        } while (idx < numbers.length);
    }
}
