In Java, the `Map` interface is part of the Java Collections Framework and represents a collection of key-value pairs. Java provides several implementations of the `Map` interface, each with different characteristics and use cases:

1. **HashMap**: Implements the `Map` interface using a hash table. It allows null values and keys and provides average constant-time performance for basic operations (get, put). It does not maintain any order of its entries.

2. **LinkedHashMap**: Extends `HashMap` and maintains a doubly-linked list of entries to preserve insertion order. It allows null values and keys and provides predictable iteration order.

3. **TreeMap**: Implements the `Map` interface using a Red-Black tree. It sorts the entries by keys, which must be comparable or provided with a `Comparator`. It does not allow null keys but allows null values.

Here are examples of using these `Map` implementations:

### 1. `HashMap`

```java
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);

        System.out.println("HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Value for 'Bob': " + hashMap.get("Bob"));
        hashMap.remove("Charlie");
        System.out.println("Value for 'Charlie': " + hashMap.get("Charlie"));
    }
}
```

### 2. `LinkedHashMap`

```java
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 25);
        linkedHashMap.put("Charlie", 35);

        System.out.println("LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Value for 'Bob': " + linkedHashMap.get("Bob"));
        linkedHashMap.remove("Charlie");
        System.out.println("Value for 'Charlie': " + linkedHashMap.get("Charlie"));
    }
}
```

### 3. `TreeMap`

```java
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Alice", 30);
        treeMap.put("Bob", 25);
        treeMap.put("Charlie", 35);

        System.out.println("TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Value for 'Bob': " + treeMap.get("Bob"));
        treeMap.remove("Charlie");
        System.out.println("Value for 'Charlie': " + treeMap.get("Charlie"));
    }
}
```

### Summary

- **`HashMap`**: Provides average constant-time performance and does not maintain order.
- **`LinkedHashMap`**: Maintains insertion order and provides predictable iteration order.
- **`TreeMap`**: Provides a sorted order based on keys and requires keys to be comparable or provided with a `Comparator`.

Each implementation of the `Map` interface has its own characteristics suited for different use cases. Choose the implementation that best fits your requirements in terms of performance and ordering.