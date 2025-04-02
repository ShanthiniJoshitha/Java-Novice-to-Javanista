/*
 * Topic: Using Multidimensional and Jagged Arrays
 * This program demonstrates the use of multidimensional and jagged arrays in Java.
 */

public class MultidimensionalJaggedArrays {
    public static void main(String[] args) {
        // 2D Array (Multidimensional Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("2D Array (Multidimensional):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array (Irregular row sizes)
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };
        
        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}