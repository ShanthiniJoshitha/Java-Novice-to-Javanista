import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throws {
    public static void main(String[] args) throws FileNotFoundException {
        // Trying to read a file
        readFile("nonexistent.txt"); // This file doesn't exist

    }

    // Method that declares 'throws'
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file); // May throw FileNotFoundException
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}




