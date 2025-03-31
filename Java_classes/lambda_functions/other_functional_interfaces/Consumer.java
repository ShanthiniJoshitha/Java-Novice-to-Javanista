package lambda_functions.other_functional_interfaces;

// NOTE: The Consumer functional interface accepts one input argument but does not
// have any return value

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);
}
