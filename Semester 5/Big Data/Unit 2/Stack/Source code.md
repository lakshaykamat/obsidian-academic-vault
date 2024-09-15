There are two main ways to implement a stack in Java:

1. **Without using the Collection Framework (manually with an array or linked list)**.
2. **Using the Collection Framework (specifically, `Stack` class from `java.util`)**.
## Using an Array
In this approach, we'll use an array to store the stack elements and a variable (`top`) to keep track of the index of the top element.
```java
class StackArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructor to initialize stack
    public StackArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;  // Stack is initially empty
    }

    // Push method to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto stack.");
        }
    }

    // Pop method to remove the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        } else {
            System.out.println("Popped " + stackArray[top] + " from stack.");
            return stackArray[top--];
        }
    }

    // Peek method to see the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Top element is: " + stack.peek());
    }
}
```
### Output
```bash
Pushed 10 onto stack.
Pushed 20 onto stack.
Pushed 30 onto stack.
Popped 30 from stack.
Top element is: 20
```
## Using a Linked List
In this implementation, each element (node) will contain the data and a reference to the next node.
```java
class StackLinkedList {
    // Node class for linked list
    private class Node {
        int data;
        Node next;
    }

    private Node top;  // Points to the top node of the stack

    // Constructor to initialize stack
    public StackLinkedList() {
        top = null;
    }

    // Push method to add an element to the top of the stack
    public void push(int value) {
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;  // Link the new node with the previous top
        top = newNode;  // Update the top to the new node
        System.out.println("Pushed " + value + " onto stack.");
    }

    // Pop method to remove the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;
        } else {
            int poppedValue = top.data;
            top = top.next;  // Update the top to the next node
            System.out.println("Popped " + poppedValue + " from stack.");
            return poppedValue;
        }
    }

    // Peek method to see the top element of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        } else {
            return top.data;
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == null);
    }

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        System.out.println("Top element is: " + stack.peek());
    }
}
```
### Output
```bash
Pushed 10 onto stack.
Pushed 20 onto stack.
Pushed 30 onto stack.
Popped 30 from stack.
Top element is: 20
```