package inner_classes;

import java.util.Iterator;

public class Main_v3 {

    public static void main(String[] args) {

        StringContainer names = new StringContainer("Alice", "Bob", "Charles", "Darwin");

        Iterator<String> namesIterator = names.iterator();

        System.out.println("\nFirst element");
        System.out.println("Has next: " + namesIterator.hasNext());
        System.out.println(namesIterator.next());

        System.out.println("\nSecond element");
        System.out.println("Has next: " + namesIterator.hasNext());
        System.out.println(namesIterator.next());

        System.out.println("\nThird element");
        System.out.println("Has next: " + namesIterator.hasNext());
        System.out.println(namesIterator.next());

        System.out.println("\nFourth element");
        System.out.println("Has next: " + namesIterator.hasNext());
        System.out.println(namesIterator.next());

        // Run

        System.out.println("\nOut of elements");
        System.out.println("Has next: " + namesIterator.hasNext());
        System.out.println(namesIterator.next());

        // Run
    }
}
