//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
                try {
                    int numerator = 10;
                    int denominator = 0; // This will cause a division by zero error
                    int result = numerator / denominator;
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("An arithmetic exception occurred: " + e.getMessage());
                }
            }
        }

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


