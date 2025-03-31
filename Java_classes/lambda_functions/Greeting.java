package lambda_functions;

public interface Greeting {

    String simpleGreetingByName(String name);

    default String simpleGreeting() {
        return "Default greeting!";
    }
}
