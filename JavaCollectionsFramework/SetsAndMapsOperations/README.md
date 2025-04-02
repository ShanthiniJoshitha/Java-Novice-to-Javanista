# Sets & Maps Operations

## Overview
This repository contains Java implementations of various Set and Map operations, demonstrating different ways to work with collections, including handling duplicates, ordering elements, and using comparators.

## Folder Structure
```
Sets & Maps Operations/
│── src/
│   ├── SetOperations.java
│   ├── HashSetDuplicates.java
│   ├── SetOrdering.java
│   ├── TreeSetComparators.java
│   ├── TreeSetComparableComparator.java
│   ├── MapOperations.java
│   ├── CollectionViewsOnMap.java
│   ├── CustomObjectKeysValues.java
│   ├── MapOrdering.java
│   ├── LRUCacheLinkedHashMap.java
│   ├── TreeMapComparators.java
│   ├── TreeMapComparables.java
│   ├── SortedMapOperations.java
│── README.md
```

## Implemented Topics

### Sets
1. **Set Operations** - Demonstrates fundamental set operations like union, intersection, and difference.
2. **HashSetDuplicates** - Identifies and handles duplicate elements in a `HashSet`.
3. **SetOrdering** - Explores how elements are ordered in different set implementations.
4. **TreeSetComparators** - Uses comparators to define custom ordering for elements in a `TreeSet`.
5. **TreeSetComparableComparator** - Implements both `Comparable` and `Comparator` for ordering elements in a `TreeSet`.

### Maps
6. **MapOperations** - Covers basic operations such as adding, updating, and retrieving elements in a `Map`.
7. **CollectionViewsOnMap** - Demonstrates how to work with key sets, value collections, and entry sets.
8. **CustomObjectKeysValues** - Uses custom objects as keys and values in a `Map`.
9. **MapOrdering** - Explores ordering behavior in different `Map` implementations.
10. **LRUCacheLinkedHashMap** - Implements an LRU cache using `LinkedHashMap`.
11. **TreeMapComparators** - Uses comparators to order entries in a `TreeMap`.
12. **TreeMapComparables** - Implements `Comparable` to sort elements in a `TreeMap`.
13. **SortedMapOperations** - Performs various operations on `SortedMap`, such as `headMap`, `tailMap`, and `subMap`.

## How to Run the Code
1. Clone the repository:
   ```sh
   git clone https://github.com/ShanthiniJoshitha/SetsAndMapsOperations.git
   ```
2. Navigate to the project folder:
   ```sh
   cd SetsAndMapsOperations/src
   ```
3. Compile the Java files:
   ```sh
   javac *.java
   ```
4. Run the desired class:
   ```sh
   java ClassName
   ```
   Replace `ClassName` with the actual class name, e.g., `java SetOperations`.

## Contributing
Feel free to fork the repository, create new branches, and submit pull requests if you want to improve the code or add more functionalities.

## License
This project is licensed under the MIT License.
