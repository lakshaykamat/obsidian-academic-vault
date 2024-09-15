To implement a `LinkedList` in Java from scratch, we'll need to understand the following key components:

1. **Node**: This is the fundamental building block of a linked list. Each node holds data and a reference to the next node.
2. **LinkedList Class**: This class will handle operations like adding, removing, and traversing nodes.

### Create the `Node` class
Each node will hold a value (`data`) and a reference to the next node (`next`).
```java
class Node {
    int data;  // Value stored in the node
    Node next; // Reference to the next node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
```
### Create the `LinkedList` class
This class will manage the nodes and allow for typical linked list operations such as `insert`, `delete`, and `display`.
```java
class LinkedList {
    Node head; // Head of the list (starting node)

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new node
        if (head == null) {
            head = newNode; // If list is empty, the new node becomes the head
        } else {
            Node current = head;
            // Traverse to the last node
            while (current.next != null) {
                current = current.next;
            }
            // Point the last node to the new node
            current.next = newNode;
        }
    }

    // Method to delete a node by its value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;

        // Traverse the list to find the node to delete
        while (current != null && current.data != data) {
            previous = current;
            current = current.next;
        }

        // If the node was not found
        if (current == null) {
            System.out.println("Node not found");
            return;
        }

        // Remove the node
        previous.next = current.next;
    }

    // Method to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
```

### `Main`
In the `main` method, we can create a `LinkedList` object and use its methods.
```java
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        // Display the linked list
        System.out.print("Initial List: ");
        list.display();  // Output: 10 -> 20 -> 30 -> 40 -> null

        // Delete an element from the linked list
        list.delete(20);
        System.out.print("After Deleting 20: ");
        list.display();  // Output: 10 -> 30 -> 40 -> null

        // Try to delete a non-existing element
        list.delete(50); // Output: Node not found

        // Display the final linked list
        System.out.print("Final List: ");
        list.display();  // Output: 10 -> 30 -> 40 -> null
    }
}
```

### Output
```bash
Initial List: 10 -> 20 -> 30 -> 40 -> null
After Deleting 20: 10 -> 30 -> 40 -> null
Node not found
Final List: 10 -> 30 -> 40 -> null
```