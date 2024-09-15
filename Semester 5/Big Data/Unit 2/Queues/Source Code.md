There are two main ways to implement a queue in Java:

1. **Without using the Collection Framework** (manually with an array or linked list).
2. **Using the Collection Framework** (`Queue` interface with classes like `LinkedList` or `PriorityQueue`).
## Queue using an Array (Fixed-size Array)
```java
class QueueArray {
    private int front, rear, size;
    private int capacity;
    private int[] queue;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        front = size = 0;
        rear = capacity - 1;
        queue = new int[capacity];
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Enqueue operation (adds element to rear)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue.");
    }

    // Dequeue operation (removes element from front)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Peek the front element
    public int front() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    // Peek the rear element
    public int rear() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return queue[rear];
    }

    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());
    }
}
```
### Output
```java
10 enqueued to queue.
20 enqueued to queue.
30 enqueued to queue.
40 enqueued to queue.
Dequeued element: 10
Front element: 20
Rear element: 40
```
## Queue using a Linked List (Dynamic Size)
```java
class QueueLinkedList {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public QueueLinkedList() {
        front = rear = null;
    }

    // Enqueue operation (adds element to rear)
    public void enqueue(int item) {
        Node newNode = new Node(item);

        // If queue is empty, front and rear are the same
        if (rear == null) {
            front = rear = newNode;
            System.out.println(item + " enqueued to queue.");
            return;
        }

        // Add the new node at the end of the queue and update rear
        rear.next = newNode;
        rear = newNode;
        System.out.println(item + " enqueued to queue.");
    }

    // Dequeue operation (removes element from front)
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return Integer.MIN_VALUE;
        }

        int item = front.data;
        front = front.next;

        // If the front becomes null, the queue is empty, so we reset rear as well
        if (front == null) {
            rear = null;
        }

        return item;
    }

    // Peek the front element
    public int front() {
        if (front == null) {
            return Integer.MIN_VALUE;
        }
        return front.data;
    }

    // Peek the rear element
    public int rear() {
        if (rear == null) {
            return Integer.MIN_VALUE;
        }
        return rear.data;
    }

    public static void main(String[] args) {
        QueueLinkedList queue = new QueueLinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Front element: " + queue.front());
        System.out.println("Rear element: " + queue.rear());
    }
}
```
### Output
```java
10 enqueued to queue.
20 enqueued to queue.
30 enqueued to queue.
Dequeued element: 10
Front element: 20
Rear element: 30
```