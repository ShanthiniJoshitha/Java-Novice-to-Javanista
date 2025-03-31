package lambda_functions.other_functional_interfaces;

// Supplier is functional interface which does not take any argument and produces result of type T.
// This is used to generate the object on which you perform operations

@FunctionalInterface
public interface Supplier<T> {

    T get();
}
