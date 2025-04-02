import java.util.*;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age); // Sorting by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class TreeSetComparable {
    public static void main(String[] args) {
        Set<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("Alice", 30));
        treeSet.add(new Person("Bob", 25));
        treeSet.add(new Person("Charlie", 35));
        
        System.out.println("TreeSet sorted by age: " + treeSet);
        
        // Using a custom comparator for sorting by name
        Set<Person> nameSortedSet = new TreeSet<>(Comparator.comparing(p -> p.name));
        nameSortedSet.addAll(treeSet);
        
        System.out.println("TreeSet sorted by name: " + nameSortedSet);
    }
}
