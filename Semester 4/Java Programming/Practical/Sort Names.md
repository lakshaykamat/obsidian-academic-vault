## Sort Strings
```java
import java.util.Arrays;

public class NameSorter {
    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob", "David", "Eve"}; // Sample list of names

        // Sorting the array of names in ascending order
        Arrays.sort(names);

        // Displaying the sorted list of names
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}

```