/*
 * Topic: Examining Fixed-length Characteristics of Arrays
 * This program demonstrates that arrays in Java have fixed lengths.
 */

public class FixedLengthArrays {
    public static void main(String[] args) {
        // Declaring an array with a fixed size
        int[] numbers = new int[5];

        // Assigning values to array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Attempting to change array length (this is NOT possible in Java)
        // numbers = new int[10];  // Uncommenting this will reinitialize the array, losing previous data

        System.out.println("Fixed-length Array Elements:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Checking the length of the array
        System.out.println("Array Length: " + numbers.length);
    }
}
