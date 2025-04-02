public class Throw {

        public static void main(String[] args) {
            int age = 15; // Example: age below 18

            if (age < 18) {
                // Throwing an exception manually
                throw new IllegalArgumentException("Age must be 18 or above to proceed.");
            }

            System.out.println("Welcome! You meet the age requirement.");
        }
    }


