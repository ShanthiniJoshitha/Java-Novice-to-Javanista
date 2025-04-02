public class multiplecatch {

        public static void main(String[] args) {
            try {
                // Example code that may throw multiple exceptions
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

                int result = 10 / 0; // ArithmeticException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (Exception e) {
                // Generic exception catch block
                System.out.println("Caught a general exception: " + e.getMessage());
            }

            System.out.println("Program continues after handling exceptions.");
        }
    }


