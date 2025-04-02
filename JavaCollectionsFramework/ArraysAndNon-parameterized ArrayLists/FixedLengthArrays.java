/*
 * Topic: Fixed-Length Arrays
 * This program demonstrates how fixed-length arrays work in Java.
 */

public class FixedLengthArrays {
    public static void main(String[] args) {
        // Declaring an array of fixed size 5
        int[] fixedArray = new int[5];

        // Assigning values to the array
        for (int i = 0; i < fixedArray.length; i++) {
            fixedArray[i] = (i + 1) * 10;
        }

        // Printing array elements
        System.out.println("Fixed-Length Array:");
        for (int num : fixedArray) {
            System.out.print(num + " ");
        }

        // Trying to change size - Uncommenting below will cause an error
        // fixedArray = new int[10]; // Arrays cannot change size once declared

        System.out.println("\nArray length: " + fixedArray.length);
    }
}
