The Java Collection Framework provides a **`Queue`** interface that defines queue operations. It is typically implemented using classes like `LinkedList`, `PriorityQueue`, etc.
## Queue using `LinkedList` (Queue Interface)
```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithCollection {
    public static void main(String[] args) {
        // Create a Queue using LinkedList (LinkedList implements the Queue interface)
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(10);  // Enqueue operation
        queue.offer(20);
        queue.offer(30);

        // Peek the front element
        System.out.println("Front element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.poll());

        // Check front and rear
        System.out.println("Front element: " + queue.peek());
    }
}
```
### Output
```java
Front element: 10
Dequeued element: 10
Front element: 20
```

## Queue using `PriorityQueue` (Queue Interface)
A **priority queue** is a special type of queue where elements are dequeued based on their priority rather than their insertion order.
```java
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Enqueue elements
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(10);

        // Elements are dequeued based on priority (smallest first for PriorityQueue)
        System.out.println("Dequeued element: " + priorityQueue.poll());
        System.out.println("Dequeued element: " + priorityQueue.poll());
        System.out.println("Front element: " + priorityQueue.peek());
    }
}
```
### Output
```bash
Dequeued element: 10
Dequeued element: 20
Front element: 30
```