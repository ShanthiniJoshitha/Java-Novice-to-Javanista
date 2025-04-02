import java.util.*;
import java.util.Objects;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class CustomObjectsAsKeys {
    public static void main(String[] args) {
        // Using custom objects as keys
        Map<Person, String> personMap = new HashMap<>();
        personMap.put(new Person("Alice", 25), "Doctor");
        personMap.put(new Person("Bob", 30), "Engineer");
        personMap.put(new Person("Charlie", 28), "Artist");

        // Displaying the map
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
