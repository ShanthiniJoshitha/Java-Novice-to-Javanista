package lambda_functions;

public interface Filter<T> {

    boolean test(T element);
}
