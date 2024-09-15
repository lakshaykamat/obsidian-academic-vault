In Java, the `Set` interface is part of the Java Collections Framework and represents a collection of unique elements. The main implementations of the `Set` interface are `HashSet`, `LinkedHashSet`, and `TreeSet`. Each implementation has its own characteristics and use cases.

## HashSet
- **Characteristics**:
    
    - Implements the `Set` interface using a hash table.
    - Does not maintain any order of elements.
    - Allows for constant-time performance for basic operations (add, remove, contains) on average, assuming the hash function disperses elements properly.
- **Use Case**:
    
    - When you need a high-performance, unordered collection of unique elements.
- **Example**
```java
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        
        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        
        // Adding duplicate element (will not be added)
        set.add(20);
        
        // Displaying elements
        System.out.println("HashSet elements: " + set);
        
        // Checking if an element exists
        System.out.println("Contains 20: " + set.contains(20));
        
        // Removing an element
        set.remove(20);
        System.out.println("HashSet after removing 20: " + set);
        
        // Size of the set
        System.out.println("Size of HashSet: " + set.size());
    }
}
```
### Output
```java
HashSet elements: [10, 20, 30]
Contains 20: true
HashSet after removing 20: [10, 30]
Size of HashSet: 2
```
## LinkedHashSet
- **Characteristics**:
    
    - Extends `HashSet` and maintains a linked list of the entries.
    - Preserves the insertion order of elements.
    - Slightly slower than `HashSet` due to the overhead of maintaining the linked list.
- **Use Case**:
    
    - When you need to maintain the order of elements as they were inserted, in addition to uniqueness.
- **Example**:
```java
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        
        // Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        
        // Adding duplicate element (will not be added)
        set.add(20);
        
        // Displaying elements
        System.out.println("LinkedHashSet elements: " + set);
        
        // Checking if an element exists
        System.out.println("Contains 20: " + set.contains(20));
        
        // Removing an element
        set.remove(20);
        System.out.println("LinkedHashSet after removing 20: " + set);
        
        // Size of the set
        System.out.println("Size of LinkedHashSet: " + set.size());
    }
}
```
### Output
```java
LinkedHashSet elements: [10, 20, 30]
Contains 20: true
LinkedHashSet after removing 20: [10, 30]
Size of LinkedHashSet: 2
```
## TreeSet
- **Characteristics**:
    
    - Implements the `Set` interface using a Red-Black tree.
    - Stores elements in a sorted order (natural ordering or by a provided comparator).
    - Provides guaranteed log(n) time cost for basic operations (add, remove, contains).
- **Use Case**:
    
    - When you need a sorted collection of unique elements.
- **Example**:
```java
import java.util.TreeSet;
import java.util.Set;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        
        // Adding elements
        set.add(30);
        set.add(10);
        set.add(20);
        
        // Adding duplicate element (will not be added)
        set.add(10);
        
        // Displaying elements
        System.out.println("TreeSet elements: " + set);
        
        // Checking if an element exists
        System.out.println("Contains 20: " + set.contains(20));
        
        // Removing an element
        set.remove(20);
        System.out.println("TreeSet after removing 20: " + set);
        
        // Size of the set
        System.out.println("Size of TreeSet: " + set.size());
    }
}
```
### Output
```java
TreeSet elements: [10, 20, 30]
Contains 20: true
TreeSet after removing 20: [10, 30]
Size of TreeSet: 2
```

## Summary
- **`HashSet`**: Fastest, unordered collection of unique elements. Ideal for when order is not important and performance is key.
- **`LinkedHashSet`**: Maintains insertion order with slightly slower performance due to linked list overhead. Ideal when the order of elements matters.
- **`TreeSet`**: Maintains sorted order with log(n) performance for basic operations. Ideal for when elements need to be sorted.