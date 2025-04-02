# Java Arrays and Collections - Accessing Elements in Non-parameterized Collections

## Overview
This program demonstrates how to access elements in a raw (non-parameterized) collection. It highlights how elements of different types can be stored and accessed in an `ArrayList` without type safety, requiring explicit type casting.

## File Structure
```
JavaArraysAndCollections/
├── 01_CreatingArrays/
├── 02_FixedLengthArrays/
├── 03_IteratingArrays/
├── 04_ArraysAsCollections/
├── 05_MultidimensionalArrays/
├── 06_NonParameterizedCollections/
├── 07_AccessingElements/
│   ├── AccessingNonParameterizedCollections.java
├── README.md
```

## Code Explanation
- **Creating a raw `ArrayList`**: A non-generic `ArrayList` is instantiated to hold elements of different types.
- **Adding elements**: Strings, integers, and floating-point numbers are added to the list.
- **Accessing elements**: Elements are retrieved using indexing and displayed with their types.
- **Type casting**: Since the list is non-generic, explicit type casting is required when accessing elements as specific types.
- **Potential runtime errors**: Improper casting can lead to `ClassCastException`.

## Example Output
```
Accessing elements in a raw collection:
Element at index 0: Hello (Type: String)
Element at index 1: 100 (Type: Integer)
Element at index 2: 45.67 (Type: Double)
First element as String: Hello
```

## Notes
- Using raw collections is **not recommended** in modern Java due to the risk of runtime errors.
- Instead, **use generic collections** (`ArrayList<String>`, `ArrayList<Integer>`) to ensure type safety.

## Next Steps
Proceed to exploring **Parameterized Collections** to improve type safety and avoid casting issues.
