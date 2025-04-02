
// ############################ Overall recording notes


// -- same recording notes as before

// demo-03-GenericMethods

// ######################################################################

// https://docs.oracle.com/javase/tutorial/java/generics/methods.html

// First a non-generic method

// -- MapHelper.java (v1)
// -- This utility method only works with a map of Integer to Strings

public class MapHelper {

    public void addEntries(Map<Integer, String> map, Integer[] keys, String[] values) {

        int index = 0;
        for (Integer key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

}


// -- Main.java (v1)



import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentNames);

        System.out.println(studentsMap);
    }
}

// ######################################################################

// -- If you change the type of the Map, the same method will not work

// -- Hover over the red lines and show the error

// -- Main.java (v2)

public class Main {

    public static void main(String[] args) {

        Map<Integer, Double> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentScores);

        System.out.println(studentsMap);
    }
}


// -- Show MapHelper.java (v2)
// -- You could add an overloaded method and this does work here

import java.util.Map;

public class MapHelper {

    public void addEntries(Map<Integer, String> map, Integer[] keys, String[] values) {

        int index = 0;
        for (Integer key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public void addEntries(Map<Integer, Double> map, Integer[] keys, Double[] values) {

        int index = 0;
        for (Integer key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }
}

// -- Show Main.java no longer has any red lines and run the code and show the result

// ######################################################################

// -- MapHelper.java (v3)
// -- add a new printEntries() method

public class MapHelper {

	// Rest of the code remains the same

    public void printEntries(Map<Integer, String> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}


// -- Show and run Main.java (v3)

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper mapHelper = new MapHelper();

        mapHelper.addEntries(studentsMap, studentIds, studentNames);

        mapHelper.printEntries(studentsMap);
    }
}


// ######################################################################

// -- What if you wanted a printEntries for other map types as well?
// -- There will be a red underline under both printEntries methods
// -- Hover over the red underline and show the error

// The erasure of both methods is the same
// https://docs.oracle.com/javase/tutorial/java/generics/erasure.html

// Java basically feel both printEntries() methods are the same when you replace
// the generic type with Object (which is what Java does) the signatures
// of both methods are the same

public class MapHelper {

	// Rest of the code remains the same

    public void printEntries(Map<Integer, String> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public void printEntries(Map<Integer, Double> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<Integer, Double> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

// ######################################################################

// One way to fix this problem is to have the method use generics
// The way we've worked so far is to declare the generic type in the 
// class declaration

// We'll do that once again

// -- MapHelper.java (v4)

import java.util.Map;

public class MapHelper<K, V> {

    public void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public void printEntries(Map<K, V> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

// -- Show and run Main.java (v4)
// -- We are now able to use the same code for adding entries to and printing
// maps with different key and value types

// -- But there is one issue which still exists, we have to keep
// instantiating map helpers with different types based on our map


import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper<Integer, String> mapHelper1 = new MapHelper<>();

        mapHelper1.addEntries(studentNamesMap, studentIds, studentNames);

        mapHelper1.printEntries(studentNamesMap);

        // Run

        Map<Integer, Double> studentScoresMap = new HashMap<>();

        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper<Integer, Double> mapHelper2 = new MapHelper<>();

        mapHelper2.addEntries(studentScoresMap, studentIds, studentScores);

        mapHelper2.printEntries(studentScoresMap);

        // Run
    }
}


// ######################################################################

// Now actually it makes more sense for these methods to be a static methods
// rather than an instance methods

// But when you define the type parameter on the class it does not 
// apply to static methods

// -- In the code below hover over the red underline under the K and V for each method
// and show the error

public class MapHelper<K, V> {

    public static void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public static void printEntries(Map<K, V> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}


// The fix here is to add generic type parameters to the method rather than the class

// Notice the <K, V> just before the return type of the method 
// (this is the right place for it)

// -- MapHelper.java (v5)

public class MapHelper {

    public static <K, V> void addEntries(Map<K, V> map, K[] keys, V[] values) {

        int index = 0;
        for (K key : keys) {
            map.put(key, values[index]);
            index++;
        }
    }

    public static <K, V> void printEntries(Map<K, V> map) {
        System.out.println("\n*************Map entries");

        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}


// -- Show and run Main.java (v5)

// -- Note that we're using the raw MapHelper type

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper.addEntries(studentNamesMap, studentIds, studentNames);

        MapHelper.printEntries(studentNamesMap);
    }
}


// ######################################################################

// -- Show and run Main.java (v6)
// -- You can explicitly specify the type arguments as well
// -- Hover over the gray <Integer, String> that we've added and show the pop-up
// "Explicit type arguments can be inferred "

// Invoke each method with a different data type
// -- run this code and show everything works


public class Main {

    public static void main(String[] args) {

        Map<Integer, String> studentNamesMap = new HashMap<>();

        Integer[] studentIds = new Integer[] {22, 33, 44, 55};
        String[] studentNames = new String[] {"Doris", "Donald", "Elise", "Eric"};

        MapHelper.<Integer, String>addEntries(studentNamesMap, studentIds, studentNames);

        MapHelper.<Integer, String>printEntries(studentNamesMap);

        // Run

        Map<Integer, Double> studentScoresMap = new HashMap<>();

        Double[] studentScores = new Double[] {3.2, 2.8, 3.3, 3.8};

        MapHelper.<Integer, Double>addEntries(studentScoresMap, studentIds, studentScores);

        MapHelper.<Integer, Double>printEntries(studentScoresMap);

        // Run
    }
}


// ######################################################################

// The generic type can be specified more than once in a method
// The new method added below prints two elements out to screen

// -- MapHelper.java (v6)

public class MapHelper {

	// Rest of the code remains the same

    public static <T> void displayElements(T element1, T element2) {
        System.out.println("\n*************Some elements");

        System.out.format("Element 1: %s, Element 2: %s\n", element1, element2);
    }
}


// -- Main.java (v7)

// Note the each invocation of the method displayElements has the same
// type for the first as well as second arguments

// Note that Java is able to infer the right type for these arguments

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements("Key", "Value");

        MapHelper.displayElements(new Date(), new Date());

        MapHelper.displayElements(1045.56, 23456.12);

        // Run
    }
}


// But the two input arguments need not be of the same type
// The code below works even when we pass in different data types

// -- Run and show Main.java (v8)

import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements("ID", 10);

        MapHelper.displayElements(10001, new Date());

        MapHelper.displayElements(1045.56, new UUID(123, 567));

        // Run
    }
}

// ######################################################################

// -- MapHelper.java (v7)

// A better way to indicate that the two input arguments can be different 
// data types is to specify multiple type parameters in the method
// as shown below here


public class MapHelper {

	// Rest of the code remains the same

    public static <T, S> void displayElements(T element1, S element2) {
        System.out.println("\n*************Some elements");

        System.out.format("Element 1: %s, Element 2: %s\n", element1, element2);
    }
}

// -- Run and show the same Main.java code, everything should run fine


// ######################################################################

// You can even use the variable arguments with generic types

// -- MapHelper.java (v8)

public class MapHelper {

	// Rest of the code remains the same

    @SafeVarargs
    public static <T> void displayElements(T... elements) {
        System.out.println("\n*************Some elements");

        for (T element : elements) {
            System.out.println(element);
        }
    }
}


// Each element passed in here can be of differen types (or the same type)

// -- Show and run Main.java (v9)

import java.util.Date;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        MapHelper.displayElements(100, 200, 300, 400);

        MapHelper.displayElements("Key", "Value", new Date(), new UUID(543, 98765));

        MapHelper.displayElements(new Date(), "Hello", 123.4);

        // Run
    }
}


// ######################################################################

// -- Add a new helper method to compare whether two maps are equal

// -- MapHelper.java (v9)

public class MapHelper {


	// Rest of the code is the same


    public static <K, V> boolean mapEquals(Map<K, V> map1, Map<K, V> map2) {

        if (map1.entrySet().size() != map2.entrySet().size()) {
            return false;
        }

        for (Map.Entry<K, V> entry : map1.entrySet()) {
            V map2Value = map2.get(entry.getKey());

            if (!entry.getValue().equals(map2Value)) {
                return false;
            }
        }

        return true;
    }

}

// -- Main.java (v10)

// -- Show and run (this returns true)

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Charlie");
        map2.put(2, "Bob");
        map2.put(1, "Alice");

        System.out.println("Are the maps equal? " + MapHelper.mapEquals(map1, map2));

        // Run
    }
}


// -- Change Charlie to Charles, the maps will no longer be equal

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");

        Map<Integer, String> map2 = new HashMap<>();
        map2.put(3, "Charles");
        map2.put(2, "Bob");
        map2.put(1, "Alice");

        System.out.println("Are the maps equal? " + MapHelper.mapEquals(map1, map2));

        // Run
    }
}

// K, V should be of the same types for the two maps being compared
// otherwise we get a runtime error
// -- change the second map to be a mapping from Double to String
// -- run the main code below

public class Main {

    public static void main(String[] args) {

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Alice");
        map1.put(2, "Bob");
        map1.put(3, "Charlie");

        Map<Double, String> map2 = new HashMap<>();
        map2.put(3.1, "Charles");
        map2.put(2.3, "Bob");
        map2.put(1.4, "Alice");

        System.out.println("Are the maps equal? " + MapHelper.mapEquals(map1, map2));

        // Run
    }
}




