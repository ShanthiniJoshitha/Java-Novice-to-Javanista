
// ############################ Overall recording notes

// -- recording notes as the same as other demos

// demo-05-Wildcards

// ######################################################################

// https://docs.oracle.com/javase/tutorial/java/generics/wildcards.html

// In generic code, the question mark (?), called the wildcard, represents an unknown type. 

// Wildcards can be of 3 types:
// - upper bounded
// - unbounded
// - lower bounded


// We'll first explore upper bounded wildcards because they are very close to the bounded type
// parameters that we've studied earlier. Upper bounded wildcards e.g. <? extends Number> are
// similar in many ways to bounded type parameters <T extends Number> but wildcards are
// different in that they represent an unknown type at runtime. Whereas when we use T
// the runtime actually knows the type of T

// Let's first see how upper bounded wildcards work.


// -- Here is a utility class that operates on Numbers

// -- StudentsUtil.java (v1)


import java.util.Map;

public class StudentsUtil {

    public static double computeAverageScore(Map<String, Number> studentsMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, Number> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }
}


// -- Show and run Main.java (v1)
// -- Instantiate a Map<String, Number> (exactly what is expected by computeAverageScore)

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Number> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45);
        studentsMap.put("Ophelia", 67);
        studentsMap.put("Matthew", 73);
        studentsMap.put("Carl", 87);

        System.out.println("Average score of students: " +
                StudentsUtil.computeAverageScore(studentsMap));
    }
}


// ######################################################################

// But let's say you were to change the parameterized map to be of
// type Map<String, Integer> then we cannot call computeAverageScore() since 
// Map<String, Integer> does not derive from Map<String, Number>

// -- Main.java (v2)
// -- Show the red underline here and 
// -- Run this code and show the error


public class Main {

    public static void main(String[] args) {

        Map<String, Integer> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45);
        studentsMap.put("Ophelia", 67);
        studentsMap.put("Matthew", 73);
        studentsMap.put("Carl", 87);

        System.out.println("Average score of students: " +
                StudentsUtil.computeAverageScore(studentsMap));
    }
}


// You cannot use other numeric types as the value for the map as well
// Observe that the value type below is Float
// -- Hover over the red underline and show the error

public class Main {

    public static void main(String[] args) {

        Map<String, Float> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4f);
        studentsMap.put("Ophelia", 67.2f);
        studentsMap.put("Matthew", 73.8f);
        studentsMap.put("Carl", 87.0f);

        System.out.println("Average score of students: " +
                StudentsUtil.computeAverageScore(studentsMap));
    }
}



// The way to fix this is by using an upper bounded wildcard. An upper bounded
// wildcard relaxes the restrictions on any variable

// Changing the code as shown below will allow us to perform
// the computeAverageScore operation on any kind of map where the type parameter
// is a subclass of Number

// Here the keyword extends is used for base classes as well as interfaces (exactly as in
// the case of bounded types)

//-- StudentsUtil.java (v2)

public class StudentsUtil {

    public static double computeAverageScore(Map<String, ? extends Number> studentsMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, ? extends Number> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }
}

// -- Show the same Main.java and see that the red underline has disappeared
// -- Run Main and show that everything works

// ######################################################################

// -- Update Main.java (v3) as shown below and show that this runs as well

// -- Show that in addition to float this works with doubles and integers as well

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

        // Run
    }
}

// ######################################################################

// -- StudentsUtil.java (v3)

// -- This same result can be accomplished using bounded type parameters (in this example)

public class StudentsUtil {

    public static <T extends Number> double computeAverageScore(Map<String, T> studentsMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }
}

// -- Show and run the same Main.java as earlier and show that the results are the same

// ######################################################################

// Now let's understand the difference between using bounded types and wildcards

// We'll see an example of code that works with bounded types but will NOT work
// with upper-bounded wildcards


// With bounded types you can actually access the object of the data type and perform
// actions with the object of type T. The type T is known at runtime with bounded types
// With upperbounded wildcards the actual type is not known

// See the slightly contrived example below. 


// -- StudentsUtil.java (v4)

// -- Observe how we access T the score for each student and we are also
// able to instantiate a new generic list of type T

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static <T extends Number> List<T> getScoresAsList(Map<String, T> studentsMap) {

        List<T> list = new ArrayList<>();

        for (Map.Entry<String, T> entry : studentsMap.entrySet()) {
            T score = entry.getValue();

            list.add(score);
        }

        return list;
    }
}


// -- Show and run Main.java (v4)


public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Scores list (doubles): " + StudentsUtil.getScoresAsList(studentsMap));

        Map<String, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        System.out.println("Scores list (integers): " + StudentsUtil.getScoresAsList(anotherStudentsMap));

        // Run
    }
}

// ######################################################################

// But if you try and do this use upper bounded wildcards it won't work

// When you use wildcards the actual data type is not known, with bounded
// types we have access to the type T

// So when you want access to the type T we should use bounded types, when
// you don't require access to the actual data type then use upper bounded
// wildcards

// -- run this code and show the error - the error is hard to understand
// talks about capture which we will cover in just a bit

public class StudentsUtil {

    public static List<? extends Number> getScoresAsList(Map<String, ? extends Number> studentsMap) {

        List<? extends Number> list = new ArrayList<>();

        for (Map.Entry<String, ? extends Number> entry : studentsMap.entrySet()) {
            // NOTE: The data type of the element is unknown, we can only access
            // it using the Object data type
            Object score = entry.getValue();

            // NOTE: This method requires the actual data type of the element
            // being added, that is not available when we use upper bounded wildcards
            list.add(score);
        }

        return list;
    }
}


// ######################################################################

// Now we'll move on to unbounded wildcards

// https://docs.oracle.com/javase/tutorial/java/generics/unboundedWildcards.html

// The unbounded wildcard type is specified using the wildcard character (?), for example, List<?>. 
// This is called a list of unknown type. There are two scenarios where an unbounded wildcard is a 
// useful approach:

// If you are writing a method that can be implemented using functionality provided in the Object class.
// When the code is using methods in the generic class that don't depend on the type parameter. For example, 
// List.size or List.clear. In fact, Class<?> is so often used because most of the methods in Class<T> 
// do not depend on T.

// Here is an example of a function where the data type of the list really
// does not matter, so we leave it as an Object

// We accept input also as a Map<String, Object> which is not very useful

// -- StudentsUtil.java (v5)

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<Object> getScoresAsList(Map<String, Object> studentsMap) {

        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, Object> entry : studentsMap.entrySet()) {
            Object score = entry.getValue();

            list.add(score);
        }

        return list;
    }
}

// -- Show and run Main.java (v5) - everything runs fine


public class Main {

    public static void main(String[] args) {

        Map<String, Object> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        List<Object> scoresList = StudentsUtil.getScoresAsList(studentsMap);
        System.out.println("Scores list (objects): " + scoresList);

        Map<String, Object> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put("Della", 87);
        anotherStudentsMap.put("Perry", 78);
        anotherStudentsMap.put("Paul", 67);

        List<Object> anotherScoresList = StudentsUtil.getScoresAsList(anotherStudentsMap);
        System.out.println("Another scores list (objects): " + anotherScoresList);

        // Run
    }
}


// ######################################################################

// -- Show Main.java (v6)
// -- But we really want to be able to use more specific types for our values
// -- Hover over the red lines and show the error
// -- The problem here is one we have encountered before Map<String, Integer> is not
// -- a derived class of Map<String, Object>
// -- run the code and show the error

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    	// Rest of the code is the same

        Map<String, Double> studentsMap = new HashMap<>();


        Map<String, Integer> anotherStudentsMap = new HashMap<>();


        // Run
    }
}


// -- Let's fix this by using unbounded types

// The best way to specify this method is to use the unbounded wildcard
// We don't care about the data type and we only want to access methods
// which are part of the Object interface

// -- StudentsUtil.java (v6)



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentsUtil {

    public static List<Object> getScoresAsList(Map<String, ?> studentsMap) {

        List<Object> list = new ArrayList<>();

        for (Map.Entry<String, ?> entry : studentsMap.entrySet()) {
            // NOTE: The data type of the element is unknown, we can only access
            // it using the Object data type
            Object score = entry.getValue();

            // NOTE: This list only needs scores as objects
            list.add(score);
        }

        return list;
    }
}


// -- Go back to Main.java and show that the red lines have disappeared
// -- run the code and show everything works


// ######################################################################

// -- Here is another example of unbounded wildcards where we don't care about
// the type of the key or the value

// -- StudentsUtil.java (v7)

import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<?, ?> map) {

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.format("Key: %s, Value: %s\n", entry.getKey(), entry.getValue());
        }
    }
}


// -- This method can now be used with any kind of map
// -- Show and run Main.java (v7)

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        StudentsUtil.printMapEntries(studentsMap);

        System.out.println("\n****************");

        Map<Integer, String> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put(1001, "Della");
        anotherStudentsMap.put(1002, "Perry");
        anotherStudentsMap.put(1003, "Paul");

        StudentsUtil.printMapEntries(anotherStudentsMap);

        // Run
    }
}


// ######################################################################

// -- StudentsUtil.java (v8)

// -- You can rewrite the computeAverageScore() using unbounded + upper bounded
// wildcards. The code below makes it clear that we do NOT care about the 
// the data type of the key, this is more flexible than forcing the key data type
// to be of type String

public class StudentsUtil {

    public static void printMapEntries(Map<?, ?> map) {

        for (Map.Entry<?, ?> entry : map.entrySet()) {
            System.out.format("Key: %s, Value: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public static double computeAverageScore(Map<?, ? extends Number> scoreMap) {

        double totalScore = 0;
        int count = 0;

        for (Map.Entry<?, ? extends Number> entry : scoreMap.entrySet()) {
            totalScore += entry.getValue().doubleValue();
            count++;
        }

        return totalScore / count;
    }

}


// -- Run Main.java (v8)
// -- Note that the types of the keya are different for both maps

public class Main {

    public static void main(String[] args) {

        Map<String, Double> studentsMap = new HashMap<>();

        studentsMap.put("Dorian", 45.4);
        studentsMap.put("Ophelia", 67.2);
        studentsMap.put("Matthew", 73.8);
        studentsMap.put("Carl", 87.0);

        System.out.println("Average score of students (double scores): " +
                StudentsUtil.computeAverageScore(studentsMap));

        Map<Integer, Integer> anotherStudentsMap = new HashMap<>();

        anotherStudentsMap.put(1001, 87);
        anotherStudentsMap.put(1002, 78);
        anotherStudentsMap.put(1003, 67);

        System.out.println("Average score of students (integer scores): " +
                StudentsUtil.computeAverageScore(anotherStudentsMap));

        // Run
    }
}


// ######################################################################

// The ? wild card is typically used when we want to invoke methods on
// the class object for any Java class. This is because the methods that we
// tend to invoke are all part of the Class<?> definition

// -- Show and run Main.java (v9)
// Notice how in the example below we have the type specification for 
// each Class object. None of the methods that we call on the class object
// actually needs to know this type

import java.io.Serializable;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Class<String> stringClass = String.class;

        System.out.println("\nName (string): " + stringClass.getName());
        System.out.println("Package (string): " + stringClass.getPackageName());
        System.out.println("Superclass (string): " + stringClass.getSuperclass());
        System.out.println("isInterface (string): " + stringClass.isInterface());

        // Run

        Class<Date> dateClass = Date.class;

        System.out.println("\nName (date): " + dateClass.getName());
        System.out.println("Package (date): " + dateClass.getPackageName());
        System.out.println("Superclass (date): " + dateClass.getSuperclass());
        System.out.println("isInterface (date): " + dateClass.isInterface());

        Class<Serializable> serializableClass = Serializable.class;

        System.out.println("\nName (serializable): " + serializableClass.getName());
        System.out.println("Package (serializable): " + serializableClass.getPackageName());
        System.out.println("Superclass (serializable): " + serializableClass.getSuperclass());
        System.out.println("isInterface (serializable): " + serializableClass.isInterface());
    }
}

// ######################################################################

// -- Show and run Main.java (v10)

// Change all the class types to ? we don't care about the actual types

public class Main {

    public static void main(String[] args) {

    	// Rest of the code remains the same

        Class<?> stringClass = String.class;


        // Run

        Class<?> dateClass = Date.class;


        Class<?> serializableClass = Serializable.class;

    }
}


// ######################################################################

// We'll now see how lower bounded wildcards work

// A lower bounded wildcard restricts the unknown type to be a specific type or 
// a super type of that type.

// -- Show and run Main.java (v11)

// -- Here is the interface inheritance hierarchy for an array list

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<>();

        System.out.println("ArrayList instanceof List: " + (courses instanceof List));
        System.out.println("ArrayList instanceof Collection: " + (courses instanceof Collection));
        System.out.println("ArrayList instanceof Iterable: " + (courses instanceof Iterable));
    }
}


// ######################################################################

// -- Show StudentsUtil.java (v9)

// -- The Map value can be an arraylist or any superclass of arraylist

import java.util.ArrayList;
import java.util.Map;

public class StudentsUtil {

    public static void printMapEntries(Map<String, ? super ArrayList<String>> map) {

        for (Map.Entry<String, ? super ArrayList<String>> entry : map.entrySet()) {
            System.out.println("----------------------");

            // NOTE: We only access the toString() method of the key and the value
            // which is a part of the Object base class
            System.out.println(entry);
            System.out.println("----------------------");
        }
    }

}


// -- Show Main.java (v11)
// -- Map values of type ArrayList are valid input arguments to this method

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> juliesCourses = new ArrayList<>();
        juliesCourses.add("Math");
        juliesCourses.add("Art");
        juliesCourses.add("Java");

        ArrayList<String> andrewsCourses = new ArrayList<>();
        andrewsCourses.add("Chemistry");
        andrewsCourses.add("English");

        Map<String, ArrayList<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printCourses(coursesMap);
    }
}



// A different type of list will NOT be accepted
// -- Hover over the red underline and show the error
// -- This is because the data type of the Map value is LinkedList

public class Main {

    public static void main(String[] args) {

        LinkedList<String> juliesCourses = new LinkedList<>();
        juliesCourses.add("Math");
        juliesCourses.add("Art");
        juliesCourses.add("Java");

        LinkedList<String> andrewsCourses = new LinkedList<>();
        andrewsCourses.add("Chemistry");
        andrewsCourses.add("English");

        Map<String, LinkedList<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}


// ######################################################################

// -- Main.java (v12)

// -- A small tweak in the previous example will fix this code
// -- Note that the Map value type is now List<String> which is a superclass
// of ArrayList
// -- Show that the red underline has disappeared
// -- Run this code and show that it works


public class Main {

    public static void main(String[] args) {

    	// Rest of the code is the same	

        Map<String, List<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}

// -- Change to Collection<String>, run and show it works

public class Main {

    public static void main(String[] args) {

    	// Rest of the code is the same	

        Map<String, Collection<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}

// -- Change to Iterable<String>, run and show it works

public class Main {

    public static void main(String[] args) {

    	// Rest of the code is the same	

        Map<String, Iterable<String>> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}

// -- Change to Object, run and show it works

public class Main {

    public static void main(String[] args) {

    	// Rest of the code is the same	

        Map<String, Object> coursesMap = new HashMap<>();
        coursesMap.put("Julie", juliesCourses);
        coursesMap.put("Andrew", andrewsCourses);

        StudentsUtil.printMapEntries(coursesMap);
    }
}


















































