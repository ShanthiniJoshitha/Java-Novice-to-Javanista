/*
 * Topic: Creating Arrays of Primitive Types and Objects
 * This program demonstrates how to create arrays of primitive types and objects.
 */

public class CreatingArrays {
    public static void main(String[] args) {
        // Array of Primitive Types
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array of Primitive Types:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Array of Objects
        String[] names = new String[]{"Alice", "Bob", "Charlie"};
        System.out.println("Array of Objects:");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}