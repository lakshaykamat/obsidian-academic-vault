### Steps to Use Java's Built-in `LinkedList`:

1. **Import the `LinkedList` class** from `java.util` package.
2. Use the various methods provided by the class for common operations such as adding, removing, and iterating over elements.

```java
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Display the LinkedList
        System.out.println("Initial LinkedList: " + list);

        // Add an element at a specific index
        list.add(2, "Grape");
        System.out.println("After adding Grape: " + list);

        // Remove an element by value
        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        // Remove an element by index
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);

        // Access an element using `get()`
        String element = list.get(2);
        System.out.println("Element at index 2: " + element);

        // Check if a certain element is in the LinkedList
        boolean contains = list.contains("Apple");
        System.out.println("Does the list contain Apple? " + contains);

        // Iterate through the LinkedList
        System.out.println("Iterating through the LinkedList:");
        for (String fruit : list) 
            System.out.println(fruit);
        }

        // Get the size of the LinkedList
        int size = list.size();
        System.out.println("Size of the LinkedList: " + size);

        // Clear all elements from the LinkedList
        list.clear();
        System.out.println("After clearing the LinkedList: " + list);
    }
}

```

### Output
```bash
Initial LinkedList: [Apple, Banana, Cherry, Date]
After adding Grape: [Apple, Banana, Grape, Cherry, Date]
After removing Banana: [Apple, Grape, Cherry, Date]
After removing element at index 1: [Apple, Cherry, Date]
Element at index 2: Date
Does the list contain Apple? true
Iterating through the LinkedList:
Apple
Cherry
Date
Size of the LinkedList: 3
After clearing the LinkedList: []
```