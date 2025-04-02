
// ############################ Overall recording notes

// -- same recording notes as before

// demo-07-NamingTypeParameters

// ######################################################################

// By convention, type parameter names are single, uppercase letters. This stands in sharp contrast to the variable naming conventions that you already know about, and with good reason: Without this convention, it would be difficult to tell the difference between a type variable and an ordinary class or interface name.

// The most commonly used type parameter names are:

// E - Element (used extensively by the Java Collections Framework)
// K - Key
// N - Number
// T - Type
// V - Value
// S,U,V etc. - 2nd, 3rd, 4th types
// You'll see these names used throughout the Java SE API and the rest of this lesson.

// The standard practice is to always use T as the name for the type parameter but
// it can be anything

// Generally there are some guidelines we follow

// If the generic type is going to be some kind of numeric value
// then we use the capital letter N to represent the data.

// Consider the Product class (however strange it is)

// -- Product.java (v1)

public class Product<N> {

    private String name;
    private N id;
    private N price;
    private N discount;

    public Product(String name, N id, N price, N discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}


// -- Show Main.java (v1)

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Product<Integer> product = new Product<>("iPhone", 1001, 699, 10);
        System.out.println("\nInteger id, price, and discount: " + product);

        // Run

        Product<BigInteger> tv = new Product<>(
                "Samsung", BigInteger.valueOf(11011),
                BigInteger.valueOf(2000), BigInteger.valueOf(500));
        System.out.println("\nBigInteger id, price, and discount: " + product);

        Product<Float> shoes = new Product<>("Nike", 1111.0f, 200.75f, 5.5f);
        System.out.println("\nFloat id, price, and discount: " + product);

        // Run
    }
}


// ######################################################################

// Can use lowercase letter as well but this can be confusing as it is easy to
// confuse this with variable names

// -- make the change below, run and show the result

// -- Product.java (v2)


public class Product<n> {

    private String name;
    private n id;
    private n price;
    private n discount;

    public Product(String name, n id, n price, n discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}


// -- Show the same Main.java and run and everything works the same way


// ######################################################################


// Can also use longer strings for generic type parameters, however this once again
// gets confusing because it can be mistaken for class names or variable names
// -- in fact Number is an abstract class for numeric types in Java

// -- make the change below, run and show the result

// -- Product.java (v3)


public class Product<Number> {

    private String name;
    private Number id;
    private Number price;
    private Number discount;

    public Product(String name, Number id, Number price, Number discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}

// -- Show the same Main.java and run and everything works the same way

// -- The generic type name can be any valid variable name

public class Product<CaNBeAnYThinG> {

    private String name;
    private CaNBeAnYThinG id;
    private CaNBeAnYThinG price;
    private CaNBeAnYThinG discount;

    public Product(String name, CaNBeAnYThinG id, CaNBeAnYThinG price, CaNBeAnYThinG discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}


// -- Show the same Main.java and run and everything works the same way


// ######################################################################

// the generic type name cannot start with a number

public class Product<123Number> {

    private String name;
    private 123Number id;
    private 123Number price;
    private 123Number discount;

    public Product(String name, 123Number id, 123Number price, 123Number discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}

// -- Cannot contain certain special characters

public class Product<Num@#ber> {

    private String name;
    private Num@#ber id;
    private Num@#ber price;
    private Num@#ber discount;

    public Product(String name, Num@#ber id, Num@#ber price, Num@#ber discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}


// -- Can contain underscores, digits, and the dollar sign
// -- Product.java (v4)

public class Product<__Number__1$> {

    private String name;
    private __Number__1$ id;
    private __Number__1$ price;
    private __Number__1$ discount;

    public Product(String name, __Number__1$ id, __Number__1$ price, __Number__1$ discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return String.format("{name=%s, id=%s, price=%s, discount=%s}", name, id, price, discount);
    }
}


// ######################################################################

// -- Show Pair.java (v1)


public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return this.key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("{%s=%s}", key, value);
    }
}

// -- Show Car.java (v1)

public class Car {

    public String make;
    public String model;
    public int price;

    public Car(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }
}

// -- Show and run Main.java (v3)

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(2112, "The Game of Thrones");
        System.out.println("\nInteger-String pair: " + pair1);

        Pair<Integer, Car> pair2 = new Pair<>(21, new Car("Tesla", "Model S", 79000));
        System.out.println("\nInteger-Car pair: " + pair2);

        Pair<Car, Date> pair3 = new Pair<>(new Car("Honda", "Civic", 23000), new Date());
        System.out.println("\nCar-Date pair: " + pair3);
    }
}


// ######################################################################

// -- Show Triplet.java (v1)

// Generic class declarations can have more than 2 type parameters
// Common practice is to name them T, S, U


public class Triplet<T, S, U> {

    private T first;
    private S second;
    private U third;

    public Triplet(T first, S second, U third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public U getThird() {
        return third;
    }

    public void setThird(U third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return String.format("First: %s, Second: %s, Third: %s", first, second, third);
    }
}

// -- Show and run Main.java (v4)

public class Main {

    public static void main(String[] args) {

        Triplet<Integer, String, Double> triplet1 = new Triplet<>(
                2112, "The Game of Thrones", 6.99);
        System.out.println("\nInteger-String-Double triplet: " + triplet1);

        Triplet<String, Integer, Car> triplet2 = new Triplet<>(
                "John", 21, new Car("Tesla", "Model S", 79000));
        System.out.println("\nString-Integer-Car triplet: " + triplet2);
    }
}



