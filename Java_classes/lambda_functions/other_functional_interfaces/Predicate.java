package lambda_functions.other_functional_interfaces;

// NOTE: A Predicate is a functional interface, which accepts an argument and returns a boolean.
// It is usually used to filter a collection of objects.

@FunctionalInterface
public interface Predicate<T> {

    boolean test(T t);
}
