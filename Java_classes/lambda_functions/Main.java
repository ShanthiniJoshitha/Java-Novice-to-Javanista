package lambda_functions;

public class Main {

    public static void main(String[] args) {

        Greeting simpleGreetingAnonymous = new Greeting() {
            @Override
            public String simpleGreetingByName(String name) {
                return "Hello, " + name;
            }
        };

        System.out.println(simpleGreetingAnonymous.simpleGreetingByName("Alice"));

        // Run

        Greeting simpleGreetingLambdaWithTypes = (String name) -> "Good morning, " + name;

        System.out.println(simpleGreetingLambdaWithTypes.simpleGreetingByName("Bob"));

        // Run

        Greeting simpleGreetingLambdaWithoutTypes = (name) -> "Welcome, " + name;

        System.out.println(simpleGreetingLambdaWithoutTypes.simpleGreetingByName("Charlie"));

        // Run

        Greeting simpleGreetingLambdaWithoutParenthesis = name -> "Howdy, " + name;

        System.out.println(simpleGreetingLambdaWithoutParenthesis.simpleGreetingByName("Donna"));

        // Run

        Greeting simpleGreetingLambdaWithBlock = name -> {
            name = name.toUpperCase();
            return "Hi there, " + name;
        };

        System.out.println(simpleGreetingLambdaWithBlock.simpleGreetingByName("Elise"));

        // Run

        System.out.println("\n*****");
        System.out.println(simpleGreetingAnonymous.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithTypes.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithoutTypes.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithoutParenthesis.simpleGreeting());
        System.out.println(simpleGreetingLambdaWithBlock.simpleGreeting());

        // Run
    }
}
