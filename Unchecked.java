public class Unchecked {

        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                System.out.println(numbers[5]); // Trying to access an invalid index
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an exception: " + e.getMessage());
                System.out.println(e.getCause());
            }
            finally {
                System.out.println("Executing the finally block...");
            }

            System.out.println("Program continues after exception handling.");
        }
    }

