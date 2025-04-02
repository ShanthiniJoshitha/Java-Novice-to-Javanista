
// ############################ Overall recording notes

// -- same recording notes as previous demos

// demo-04-BoundedTypeParameter

// ######################################################################

// -- Show MathUtil.java (v1)

// Note the cast to the abstract class Number
// We expect the inputs which are passed in to be of type Number

public class MathUtil {

    public static <T> boolean isEven(T element) {

        Number number = (Number) element;

        return number.doubleValue() % 2 == 0;
    }

    public static <T> boolean isPrime(T element) {

        Number number = (Number) element;

        int num = number.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}


// -- Show and run Main.java (v1)

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println("*************** Invoke the isEven() method");

        System.out.println("Is 50 even: " + MathUtil.isEven(50));

        System.out.println("Is 103 even: " + MathUtil.isEven(103));

        System.out.println("Is 50.2 even: " + MathUtil.isEven(50.2));

        System.out.println("Is 5000000 even: " + MathUtil.isEven(BigInteger.valueOf(5000000)));

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is 50 prime: " + MathUtil.isPrime(50));

        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));

        System.out.println("Is 5000000 prime: " + MathUtil.isPrime(BigInteger.valueOf(5000000)));

        // Run

    }
}


// ######################################################################

// -- Show that there is no compile time error here (no red underline)
// -- Because we perform a cast, using the wrong type results in a runtime error
// -- Running this results in a ClassCastException

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.println("*************** Invoke the isEven() method");

        System.out.println("Is fifty even: " + MathUtil.isEven("fifty"));

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is seventeen prime: " + MathUtil.isPrime("seventeen"));

        System.out.println("Is today's date prime: " + MathUtil.isPrime(new Date()));

        // Run

    }
}


// This is because when you specify just the generic type parameter there is an implicit
// assumption that the data type extends the Object base class

// -- Change the code as shown below, run and show that the results are the same
// -- there is a class cast exception

// ######################################################################

// -- MathUtil.java (v2)

// This is because when you specify just the generic type parameter there is an implicit
// assumption that the data type extends the Object base class

// -- Change the code as shown below, run and show that the results are the same
// -- there is a class cast exception

public class MathUtil {

    public static <T extends Object> boolean isEven(T element) {

        Number number = (Number) element;

        return number.doubleValue() % 2 == 0;
    }

    public static <T extends Object> boolean isPrime(T element) {

        Number number = (Number) element;

        int num = number.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}


// ######################################################################

// -- MathUtil.java (v3)

// Clearly we want to restrict the data types that we use with this generic 
// class and this is possible using bounded types

// Update the methods of the calculator class to only accept classes
// which derive from the Number base class

public class MathUtil {

    public static <T extends Number> boolean isEven(T element) {

        Number number = (Number) element;

        return number.doubleValue() % 2 == 0;
    }

    public static <T extends Number> boolean isPrime(T element) {

        Number number = (Number) element;

        int num = number.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (number.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}


// -- Switch over to Main.java and show that we now have red underlines in our code
// -- run the code and show that the code does not compile


// ######################################################################

// -- Show and run Main.java below (this is the same code as earlier)


import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        System.out.println("*************** Invoke the isEven() method");

        System.out.println("Is 50 even: " + MathUtil.isEven(50));

        System.out.println("Is 103 even: " + MathUtil.isEven(103));

        System.out.println("Is 50.2 even: " + MathUtil.isEven(50.2));

        System.out.println("Is 5000000 even: " + MathUtil.isEven(BigInteger.valueOf(5000000)));

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is 50 prime: " + MathUtil.isPrime(50));

        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));

        System.out.println("Is 5000000 prime: " + MathUtil.isPrime(BigInteger.valueOf(5000000)));

        // Run

    }
}


// -- MathUtil.java (v4)

// -- Because we accept only types which derive from number we can simplify
// -- the MathUtil class by removing the cast entirely

public class MathUtil {

    public static <T extends Number> boolean isEven(T element) {
        return element.doubleValue() % 2 == 0;
    }

    public static <T extends Number> boolean isPrime(T element) {

        int num = element.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (element.intValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// -- Run the same Main.java as before and show that everything works


// ######################################################################

// -- Show and run Main.java (v2)

// -- Our isPrime() code is not completely correct

// -- run the code below and see the result - both 17 and 17.2 show up as prime


public class Main {

    public static void main(String[] args) {

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));

        System.out.println("Is 17.2 prime: " + MathUtil.isPrime(17.2));

        // Run

    }
}

// ######################################################################

// -- MathUtil.java (v5)

// -- The bound should be different for isPrime() - in fact prime calculation
// -- is performed only on natural numbers (longs)
// (Note that this is not perfect because longs and BigInteger will not be allowed
// here but that is a limitation, the code is now correct)

public class MathUtil {

    public static <T extends Number> boolean isEven(T element) {
        return element.doubleValue() % 2 == 0;
    }

    public static <T extends Integer> boolean isPrime(T element) {

        int num = element.intValue() / 2;

        for (int i = 2; i <= num; i++) {

            if (element.longValue() % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// -- Switch over to Main.java and show the red underline under the 17.2
// -- Hover and show the error


// -- Show and run this updated Main.java (v3)

public class Main {

    public static void main(String[] args) {

        // Run

        System.out.println("*************** Invoke the isPrime() method");

        System.out.println("Is 17 prime: " + MathUtil.isPrime(17));

        System.out.println("Is 37 prime: " + MathUtil.isPrime(37));

        System.out.println("Is 51 prime: " + MathUtil.isPrime(51));
        
        // Run

    }
}


// ######################################################################

// -- Show a new custom generic class Box.java (v1)

public class Box<T> {

    private  T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }
}


// -- This box can contain any kind of data
// -- Show and run Main.java (v4)

public class Main {

    public static void main(String[] args) {

        Box<Integer> integerBox = new Box<>(22);
        System.out.println(integerBox);

        Box<Float> floatBox = new Box<>(22.2f);
        System.out.println(floatBox);

        Box<BigInteger> bigIntegerBox = new Box<>(BigInteger.valueOf(100000000));
        System.out.println(bigIntegerBox);

        Box<String> stringBox = new Box<>("Zoe");
        System.out.println(stringBox);
    }
}


// ######################################################################

// -- What if we want to compare two Boxes to each other to find the box with
// the larger value?

// -- Hover over the red underline here, we cannot compare the values in the boxes


public class Main {

    private static <T> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue() > box2.getValue()) {
            return box1;
        }

        return box2;
    }

}


// ######################################################################

// -- In order to be able to compare boxes the values in the boxes should be
// comparable

// -- Box.java (v2)

public class Box<T extends Comparable<T>> {

    private  T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }
}


// -- Show and run Main.java (v5)
// -- The box now accepts any type that can be compared

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) > 0) {
            return box1;
        }

        return box2;
    }

    public static void main(String[] args) {

        Box<Integer> integerBox1 = new Box<>(22);
        System.out.println(integerBox1);

        Box<Integer> integerBox2 = new Box<>(99);
        System.out.println(integerBox2);

        System.out.println("Larger box: " + getLarger(integerBox1, integerBox2));
    }
}

// ######################################################################

// -- Show another custom class, this time a regular class
// -- Car.java 

public class Car {

    public String make;
    public String model;
    public Integer price;

    public Car(String make, String model, Integer price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }
}


// -- Show Main.java (v6) and show that we cannot put the Car object in a box
// -- Hover over the red underlines and show the error

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.getValue().compareTo(box2.getValue()) > 0) {
            return box1;
        }

        return box2;
    }

    public static void main(String[] args) {

        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
        System.out.println(carBox1);

        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Camry", 30000));
        System.out.println(carBox2);

        System.out.println("Larger box: " + getLarger(carBox1, carBox2));
    }
}

// -- Update Car to be Comparable
// -- Car.java (v1)

public class Car implements Comparable<Car> {

    public String make;
    public String model;
    public Integer price;

    public Car(String make, String model, Integer price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }

    @Override
    public int compareTo(Car o) {
        return this.price.compareTo(o.price);
    }
}

// -- Now show that the same Main.java has no error
// -- Run Main.java and show the result

// ######################################################################

// -- Another way to implement this is to have the Box itself be Comparable
// -- Box.java (v3)

public class Box<T extends Comparable<T>> implements Comparable<Box<T>>{

    private  T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.value.compareTo(o.value);
    }
}


// -- This will simplify the code that we have in Main.java for Box comparisons
// -- Show and run Main.java (v7)

public class Main {

    private static <T extends Comparable<T>> Box<T> getLarger(Box<T> box1, Box<T> box2) {
        if (box1.compareTo(box2) > 0) {
            return box1;
        }

        return box2;
    }

    public static void main(String[] args) {

        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
        System.out.println(carBox1);

        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Camry", 30000));
        System.out.println(carBox2);

        System.out.println("Larger box: " + getLarger(carBox1, carBox2));
    }
}


// ######################################################################

// Can also bind types to inherit from a certain class and implement multiple interfaces
// Here is an example where we want our type parameters to implement multiple interfaces

// -- Set up a new interface PrettyPrintable.java (v1)

public interface PrettyPrintable {

    void prettyPrint();
}


// -- Have Car.java (v2) be PrettyPrintable

public class Car implements Comparable<Car>, PrettyPrintable {

    public String make;
    public String model;
    public Integer price;

    public Car(String make, String model, Integer price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("{Make: %s, Model: %s, Price: %s}", make, model, price);
    }

    @Override
    public int compareTo(Car o) {
        return this.price.compareTo(o.price);
    }

    @Override
    public void prettyPrint() {
        System.out.println("++++" + this + "++++");
    }
}


// -- Update Box.java to accept only objects which are Comparable and PrettyPrintable
// -- Box itself is Comparable and PrettyPrintable
// -- Box.java (v4)


public class Box<T extends Comparable<T> & PrettyPrintable>
        implements Comparable<Box<T>>, PrettyPrintable {

    private  T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("In a box: {%s}", value);
    }

    @Override
    public int compareTo(Box<T> o) {
        return this.value.compareTo(o.value);
    }

    @Override
    public void prettyPrint() {
        System.out.println("*--**--**--**--**--**--**--*");
        value.prettyPrint();
        System.out.println("*--**--**--**--**--**--**--*");
    }
}


// -- Finally show and run Main.java (v8)

// -- Notice that both methods prettyPrintLarger and prettyPrintSmaller
// -- require T to be Comparable and PrettyPrintable

public class Main {

    private static <T extends Comparable<T> & PrettyPrintable> void prettyPrintLarger(
            Box<T> box1, Box<T> box2) {
        if (box1.compareTo(box2) > 0) {
            box1.prettyPrint();

            return;
        }

        box2.prettyPrint();
    }

    private static <T extends Comparable<T> & PrettyPrintable> void prettyPrintSmaller(
            Box<T> box1, Box<T> box2) {
        if (box1.compareTo(box2) < 0) {
            box1.prettyPrint();

            return;
        }

        box2.prettyPrint();
    }

    public static void main(String[] args) {

        Box<Car> carBox1 = new Box<>(new Car("Tesla", "Model S", 79000));
        System.out.println(carBox1);

        Box<Car> carBox2 = new Box<>(new Car("Toyota", "Camry", 30000));
        System.out.println(carBox2);

        System.out.println("\n----------------Larger");
        prettyPrintLarger(carBox1, carBox2);

        System.out.println("\n----------------Smaller");
        prettyPrintSmaller(carBox1, carBox2);

    }
}















































