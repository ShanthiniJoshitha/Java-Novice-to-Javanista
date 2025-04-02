
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

    public class trywithresource {
        public static void main(String[] args) {
            // Try-with-resources block
            try (FileReader fileReader = new FileReader("example.txt");
                 BufferedReader bufferedReader = new BufferedReader(fileReader)) {

                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line); // Print each line from the file
                }

            } catch (IOException e) {
                System.out.println("An exception occurred: " + e.getMessage());
            }

            System.out.println("Program continues after resource handling.");
        }
    }


