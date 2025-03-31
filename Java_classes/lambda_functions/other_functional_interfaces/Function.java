package lambda_functions.other_functional_interfaces;

// NOTE: This functional interface takes an argument (object of type T) and returns an object (object of type R).
// The argument and output can be a different type. This is used to transform the data that we're working on

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);
}
