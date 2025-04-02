/*
 * Topic: Iterating over Arrays Using For Loops
 * This program demonstrates different ways to iterate over arrays in Java.
 */

 public class IteratingArrays {
    public static void main(String[] args) {
        // Array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Using a traditional for loop
        System.out.println("Iterating using traditional for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Using an enhanced for loop (for-each loop)
        System.out.println("Iterating using enhanced for loop:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using a while loop
        System.out.println("Iterating using while loop:");
        int index = 0;
        while (index < numbers.length) {
            System.out.print(numbers[index] + " ");
            index++;
        }
        System.out.println();
    }
}