Implementing a set data structure from scratch without using the Java Collections Framework involves creating a structure that maintains unique elements. You can use different underlying data structures to achieve this, such as arrays or linked lists. Here, I'll show you two basic implementations:

1. **Set using a Hash Table (HashSet-like)**
2. **Set using a Linked List**

### 1. Set Using a Hash Table (HashSet-like)

A hash table implementation allows for average constant time complexity for add, remove, and contains operations, assuming good hash distribution.

#### HashSet Implementation

```java
import java.util.Arrays;

public class HashSetCustom {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float LOAD_FACTOR = 0.75f;
    private Node[] table;
    private int size;

    private static class Node {
        final int key;
        Node next;

        Node(int key) {
            this.key = key;
        }
    }

    public HashSetCustom() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    private int hash(int key) {
        return Integer.hashCode(key) % table.length;
    }

    public boolean add(int key) {
        int index = hash(key);
        Node node = table[index];
        
        while (node != null) {
            if (node.key == key) {
                return false; // Key already exists
            }
            node = node.next;
        }

        Node newNode = new Node(key);
        newNode.next = table[index];
        table[index] = newNode;
        size++;

        if (size > table.length * LOAD_FACTOR) {
            resize();
        }

        return true;
    }

    public boolean remove(int key) {
        int index = hash(key);
        Node prev = null;
        Node node = table[index];

        while (node != null) {
            if (node.key == key) {
                if (prev == null) {
                    table[index] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return true;
            }
            prev = node;
            node = node.next;
        }

        return false; // Key not found
    }

    public boolean contains(int key) {
        int index = hash(key);
        Node node = table[index];

        while (node != null) {
            if (node.key == key) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    private void resize() {
        Node[] oldTable = table;
        table = new Node[oldTable.length * 2];
        size = 0;

        for (Node node : oldTable) {
            while (node != null) {
                add(node.key);
                node = node.next;
            }
        }
    }

    public static void main(String[] args) {
        HashSetCustom set = new HashSetCustom();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Contains 20: " + set.contains(20)); // true
        System.out.println("Remove 20: " + set.remove(20)); // true
        System.out.println("Contains 20: " + set.contains(20)); // false
    }
}
```

### 2. Set Using a Linked List

This implementation maintains uniqueness and order using a singly linked list. It’s less efficient but useful for educational purposes.

#### Linked List Set Implementation

```java
public class LinkedListSet {
    private Node head;
    private int size;

    private static class Node {
        final int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    public LinkedListSet() {
        head = null;
        size = 0;
    }

    public boolean add(int key) {
        if (contains(key)) {
            return false; // Key already exists
        }

        Node newNode = new Node(key);
        newNode.next = head;
        head = newNode;
        size++;
        return true;
    }

    public boolean remove(int key) {
        Node prev = null;
        Node node = head;

        while (node != null) {
            if (node.key == key) {
                if (prev == null) {
                    head = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return true;
            }
            prev = node;
            node = node.next;
        }

        return false; // Key not found
    }

    public boolean contains(int key) {
        Node node = head;

        while (node != null) {
            if (node.key == key) {
                return true;
            }
            node = node.next;
        }

        return false;
    }

    public static void main(String[] args) {
        LinkedListSet set = new LinkedListSet();
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("Contains 20: " + set.contains(20)); // true
        System.out.println("Remove 20: " + set.remove(20)); // true
        System.out.println("Contains 20: " + set.contains(20)); // false
    }
}
```

### Summary

- **Hash Table-Based Set**: Provides average constant time complexity for add, remove, and contains operations. It uses a hash table and is efficient but involves handling hash collisions and resizing.
- **Linked List-Based Set**: Simple implementation using a singly linked list. It maintains order and uniqueness but has linear time complexity for add, remove, and contains operations.

These custom implementations demonstrate how sets can be created from fundamental principles, providing insight into how standard library implementations might work.