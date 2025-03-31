package lambda_functions;

public class Main_v1 {

    public static void main(String[] args) {

        Calculate add = (a, b) -> (a + b);

        Calculate subtract = (a, b) -> (a - b);

        Calculate multiply = (a, b) -> (a * b);

        Calculate divide = (a, b) -> (a / b);

        System.out.println("a + b: " + add.operation(100, 10));
        System.out.println("a - b: " + subtract.operation(100, 10));
        System.out.println("a * b: " + multiply.operation(100, 10));
        System.out.println("a / b: " + divide.operation(100, 10));
    }
}
