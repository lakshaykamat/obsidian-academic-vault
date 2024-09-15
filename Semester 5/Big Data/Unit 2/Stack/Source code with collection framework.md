Java provides a built-in `Stack` class in the `java.util` package, which you can use to implement a stack easily without manually managing the underlying data structure.
## Using the `Stack` Class:
```java
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack using the built-in Stack class
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // Pop the top element from the stack
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        // Peek the top element without removing it
        int topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);
    }
}
```
### Output
```java
Stack after pushes: [10, 20, 30]
Stack after pop: [10, 20]
Top element: 20
Is stack empty? false
```

## Key Methods in Java's `Stack` Class:

- **`push(E item)`**: Adds an item to the top of the stack.
- **`pop()`**: Removes and returns the item at the top of the stack.
- **`peek()`**: Returns the item at the top of the stack without removing it.
- **`isEmpty()`**: Returns `true` if the stack is empty, otherwise `false`.
- **`search(Object o)`**: Returns the position of an item from the top of the stack (1-based index) or `-1` if the item is not found.

## Summary:

- **Without the Collection Framework**: You can implement a stack using an array (fixed size) or a linked list (dynamic size). This requires manual management of the elements and pointer handling.
- **With the Collection Framework**: Java provides a built-in `Stack` class that offers an easy and efficient way to implement stack operations with automatic memory management.