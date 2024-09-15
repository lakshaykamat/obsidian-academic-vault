### What is Queues?
A **queue** is a linear data structure that follows the **First In, First Out (FIFO)** principle. This means the first element added to the queue will be the first one to be removed, much like people standing in line: the first person in line is the first person served.
![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTz-5tvNlSpkfCIEBlnKblcpbEtXRK2iY4gwg&s)
### Key Characteristics of a Queue:
- **FIFO (First In, First Out)**: The first element added is the first one removed.
- **Linear Structure**: Elements are arranged sequentially, and they enter from one end and leave from the other.
- **Two Main Operations**:
  1. **Enqueue**: Adds an element to the end (rear) of the queue.
  2. **Dequeue**: Removes an element from the front of the queue.

### Real-life Analogy:
Think of a queue like people waiting in line at a ticket counter. The first person in line is the first person to get a ticket and leave, while new people join the line at the end.

### Basic Operations on a Queue:

#### 1 . Enqueue (x):  
   - Adds the element `x` to the end (rear) of the queue.
   - If the queue is full (in case of a fixed-size queue), an **overflow** condition occurs.

#### 2 . Dequeue:  
   - Removes and returns the element at the front of the queue.
   - If the queue is empty, an **underflow** condition occurs (i.e., there is no element to dequeue).

#### 3 . Peek (or Front):  
   - Returns the element at the front of the queue without removing it. 
   - Allows you to look at the first element without modifying the queue.

#### 4 .  `isEmpty`:  
   - Returns `true` if the queue is empty (i.e., no elements are present), otherwise returns `false`.

#### 5 . `isFull` (for a fixed-size queue):  
   - Returns `true` if the queue is full (in case of a static array-based queue).

### Visual Representation:

```
Front → [ 10 ] [ 20 ] [ 30 ] ← Rear
```

In this queue:
- The front element is `10`.
- The rear element is `30`.
- If we **enqueue** `40`, it will be added at the rear.
- If we **dequeue**, `10` will be removed from the front.

### Time Complexity of Queue Operations:

- **Enqueue**: O (1) – Adding an element to the rear of the queue is done in constant time.
- **Dequeue**: O (1) – Removing an element from the front is done in constant time.
- **Peek**: O (1) – Accessing the front element is done in constant time.

### Types of Queues:

#### 1 . Simple Queue (Linear Queue):
   - This is the basic queue type where insertion happens at the rear and removal happens at the front. It may be implemented using an array or a linked list.
   ![](https://media.geeksforgeeks.org/wp-content/uploads/20221209094646/Queue-768.png)
#### 2 . Circular Queue:
   - A circular queue is an advanced version of a linear queue where the last position is connected back to the first position. This eliminates the problem of wasted space that occurs in a linear queue.
   - In a linear queue implemented with an array, once the rear reaches the end of the array, the queue cannot add more elements, even if there are empty spaces at the front (due to dequeued elements). The circular queue fixes this by reusing the empty slots.

   ![Circular Queue](https://media.geeksforgeeks.org/wp-content/uploads/20220608151111/UntitledDiagramdrawio-300x248.png)

#### 3 . Priority Queue:
   - In a priority queue, each element is assigned a priority, and elements are dequeued based on their priority rather than the order in which they were added. Higher-priority elements are dequeued before lower-priority ones.
   ![](https://afteracademy.com/images/priority-queue-intro-569f2c6363b8d93d.png)
#### 4 . Deque (Double-Ended Queue):
   - In a deque (pronounced "deck"), insertion and deletion can happen at both ends (front and rear). It can act as both a stack (LIFO) and a queue (FIFO).
   ![](https://media.geeksforgeeks.org/wp-content/uploads/anod.png)

### Queue Implementations:

Queues can be implemented using:
#### 1 . Array-based Queue:
   - A simple array is used to hold the elements, and two pointers (`front` and `rear`) keep track of the current state.
   - The major disadvantage of an array-based queue is that once the array is full, you cannot add new elements unless you implement circular logic.

#### 2 . Linked List-based Queue:
   - Each element is stored in a node, and nodes are linked together. Two pointers (`front` and `rear`) are used to keep track of the first and last elements in the queue.
   - This implementation is dynamic and can grow as needed.

### Example of Queue Operations:

1. **Initial Queue**: Empty.
2. **Enqueue (10)**: Add `10` to the queue.
   ```
   [ 10 ]
   ```
3. **Enqueue (20)**: Add `20` to the queue.
   ```
   [ 10 ] [ 20 ]
   ```
4. **Enqueue (30)**: Add `30` to the queue.
   ```
   [ 10 ] [ 20 ] [ 30 ]
   ```
5. **Dequeue ()**: Remove the element `10` from the front.
   ```
   [ 20 ] [ 30 ]
   ```
6. **Peek ()**: The front element is `20` (but it is not removed).

### Applications of Queues:

1. **CPU Scheduling**:
   - Operating systems use queues to manage the scheduling of tasks and processes. For example, in round-robin scheduling, a circular queue is often used.
   
2. **Print Queue**:
   - Printers use queues to manage print jobs. The first job sent to the printer is the first one to be printed.

3. **Breadth-First Search (BFS)**:
   - BFS, an algorithm for traversing trees and graphs, uses a queue to keep track of the nodes to be explored.

4. **Handling Asynchronous Data**:
   - In networked systems, queues are used to manage asynchronous data transfer such as message queues and job scheduling.

5. **Call Center Systems**:
   - Call centers use queues to manage customer service requests. The first customer to call is the first to be connected to an agent.

6. **Buffering in Streams**:
   - Queues are used to store incoming data when there is a difference between the rate of data production and consumption (e.g., buffering in video streaming).

7. **Simulation of Real-world Systems**:
   - Queues are often used in simulation problems (like simulating customer service systems or checkout lines).

### Circular Queue:

In a **circular queue**, once the `rear` of the queue reaches the end of the array, it wraps around to the beginning (if there is space available) to reuse empty spaces left after dequeuing elements. 

#### Circular Queue Example:

```
[ ] [ 10 ] [ 20 ] [ 30 ] [ ]
Front →        ^       Rear →
```

After **dequeuing** an element:
```
[ ] [ ] [ 20 ] [ 30 ] [ ]
Front →            ^ Rear →
```

If we **enqueue** `40`:
```
[ 40 ] [ ] [ 20 ] [ 30 ] [ ]
Front →            ^ Rear →
```

### Summary:

- A **queue** follows the **FIFO (First In, First Out)** principle, where the first element added is the first one removed.
- **Basic operations** include `enqueue` (add to the rear), `dequeue` (remove from the front), and `peek` (view the front).
- Queues can be implemented using arrays or linked lists.
- **Circular queues**, **priority queues**, and **deques** are specialized types of queues.
- Queues are used in various applications, including CPU scheduling, BFS, buffering, and call centers.