
// ############################ Overall recording notes


// -- Please make sure you install and use Java 15 (this is what everyone is using for this Java path). You may need to upgrade your Java to get this

// -- Use intelliJ for writing and running code
// -- Everything in this course will be recorded within intelliJ, you will not be using the command line at all
// -- Set the intelliJ font to 16px
// -- Whenever you are showing files show the structure of the project i.e. open up the project pane on the left-hand side
// -- Once you move on to code close the Project pane and only show the main editor window
// -- Have the console show up at the bottom to show the results
// -- There will comments within the code for additional execution instructions, please make sure you look at them

// -- IMPORTANT: When recording code step-by-step, always set up the outline of the class first and then paste the contents of the class e.g.

// -- Any comment with "NOTE:" can be part of the code that you paste in

public class Main {

    public static void main(String[] args) {

    }
}

// -- and then paste in the contents of the main() method

// -- For other classes show the entire class and make sure you scroll completely as needed
// You DO NOT need to show the creation of the project and the package
// Just start with the code directly
// All of the code in this path will be in the package "com.skillsoft.generics"

// demo-02-GenericTypes

// ######################################################################

// -- Show Repository.java (v1). This is the same code as earlier

public class Repository<T> {

    private T value;

    public Repository(T value) {
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
        return String.format("Repository contains: %s", value);
    }
}


// -- Show a custom object Car.java (v1)

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


// -- Show Main.java (v1)

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Generic class with custom type");

        Car honda = new Car("Honda", "Civic", 21000);

        Repository<Car> carRepository = new Repository<Car>(honda);
        System.out.println(carRepository);
    }
}


// ######################################################################

// The generic type parameter in classes is meant for non-static, member references
// A static variable cannot access the non-static generic type parameter

// -- Hover over the red underline in the code below and show the error
// -- Run the code and show the error


public class Repository<T> {

    public static T staticVariable;

    private T value;

    public Repository(T value) {
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
        return String.format("Repository contains: %s", value);
    }
}

// When using generics you cannot initialize a variable when you define it

// -- Hover over the red underline and show the error

public class Repository<T> {

    private T value = 10;

    public Repository(T value) {
        
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s", value);
    }
}


// ######################################################################

// -- You can force initialization by casting to type T
// Repository.java (v2)

public class Repository<T> {

    @SuppressWarnings("unchecked")
    private T value = (T) "Initial value";

    public Repository() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("Repository contains: %s", value);
    }
}


// -- But what if the cast is an error at runtime?

// But this can be very dangerous and lead to issues at runtime

// -- Show and run Main.java (v2)
// -- This should be an error

public class Main {

    public static void main(String[] args) {

        System.out.println("**** Wrong casting leads to runtime errors");

        Repository<Car> carRepository = new Repository<Car>();
        Car car = carRepository.getValue();
    }
}



// ######################################################################

// A raw type is the name of a generic class or interface without any type arguments

// -- Go back to the original repository code

public class Repository<T> {

    private T value;

    public Repository(T value) {
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
        return String.format("Repository contains: %s", value);
    }
}


// -- Hover over the yellow lines and show the warning for Repository to
// be parameterized
// -- Run the code below

// Repository is the raw type of the generic type Repository<T>. Had Repository
// been a non-generic class then its type is not referred to as a raw type.

// Raw types show up in legacy code because lots of API classes (such as the Collections classes) 
// were not generic prior to JDK 5.0. When using raw types, you essentially get pre-generics behavior — 
// a Repository gives you access to Objects. 

// -- Main.java (v3)

public class Main {

    public static void main(String[] args) {

        Repository rawStringRepository = new Repository("Hello Java");
        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        Repository rawFloatRepository = new Repository(12.5f);
        System.out.println(rawFloatRepository);

        Object floatObject = rawFloatRepository.getValue();

        Repository rawBooleanRepository = new Repository(false);
        System.out.println(rawBooleanRepository);

        Object booleanObject = rawBooleanRepository.getValue();

        // Run
    }
}

// ######################################################################

// For backward compatibility, assigning a parameterized type to 
// its raw type is allowed:

// -- Hover over the yellow line in the setValue() code below and show the warning
// -- Run and show the results

// The warning shows that raw types bypass generic type checks, deferring the catch of 
// unsafe code to runtime. Therefore, you should avoid using raw types.

// -- Show and run Main.java (v4)

public class Main {

    public static void main(String[] args) {

        Repository<String> stringRepository = new Repository<>("Welcome To Java");
        Repository rawStringRepository = stringRepository;

        System.out.println(rawStringRepository);

        Object stringObject = rawStringRepository.getValue();

        rawStringRepository.setValue("Hi Java");

        System.out.println(rawStringRepository);

        // Run

        rawStringRepository.setValue(10);

        System.out.println("Contains the wrong type! " + rawStringRepository);

        // Run - there will be no error!
    }
}

































