### What is a Linked List?

A **Linked List** is a linear data structure where elements (called **nodes**) are stored in a sequence, but unlike arrays, the elements are not stored in contiguous memory locations. Each node contains:
1. **Data**: The actual value stored in the node.
2. **Reference (or Pointer)**: A link to the next node in the sequence.

### Key Characteristics of a Linked List:
- **Dynamic Size**: Unlike arrays, which have a fixed size, linked lists can grow or shrink dynamically by adding or removing nodes.
- **Non-contiguous Memory Allocation**: Nodes in a linked list are scattered in memory, and the list is maintained by pointers.
- **No Random Access**: Elements in a linked list are accessed sequentially by traversing the list from the head node, unlike arrays where elements can be accessed directly using an index.

### Structure of a Node:
Each **node** in a linked list contains:
1. **Data**: The element to store.
2. **Pointer to the next node**: A reference (or pointer) to the next node in the sequence. In some types of linked lists, it may also have a pointer to the previous node (doubly linked list).
![](https://media.geeksforgeeks.org/wp-content/uploads/20220712172013/Singlelinkedlist.png)
### Types of Linked Lists:

#### 1 . Singly Linked List:
   - Each node contains a reference to the next node.
   - The last node points to `null`, marking the end of the list.
   - Traversal is possible in only one direction (from the head to the last node).

   **Structure**:
   ```
   [Data | Next] -> [Data | Next] -> [Data | Next] -> null
   ```
![](https://media.geeksforgeeks.org/wp-content/uploads/singly-linkedlist.png)
#### 2 . Doubly Linked List:
   - Each node contains two references: one to the next node and one to the previous node.
   - This allows traversal in both directions, forward and backward.

   **Structure**:
   ```
   null <- [Prev | Data | Next] <-> [Prev | Data | Next] <-> [Prev | Data | Next] -> null
   ```
![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/03/DLL1.png)
#### 3 . Circular Linked List:
   - In a circular linked list, the last node's next pointer points to the first node, forming a circular loop.
   - It can be singly or doubly linked.

   **Structure**:
   ```
   [Data | Next] -> [Data | Next] -> [Data | Next] -> back to first node
   ```
![](https://media.geeksforgeeks.org/wp-content/uploads/Circular-doubly-linked-list.png)
### Key Operations on Linked Lists:

#### 1 . Insertion:
- New nodes can be added at various positions: 
	- **Beginning**: Update the head to point to the new node, and link the new node to the previous head.
	- **End**: Traverse to the last node and update its next pointer to the new node.
	- **Middle**: Traverse to the desired position, link the previous node to the new node, and link the new node to the next node.
   
#### 2 . Deletion:
- Nodes can be removed from various positions:
     - **Beginning**: Update the head to point to the next node.
     - **End**: Traverse to the second-last node and set its next pointer to `null`.
     - **Middle**: Traverse to the node before the one to be deleted, and update its next pointer to bypass the node being deleted.

#### 3 . Traversal:
- Start at the head and move through each node using the reference to the next node until the end (null) is reached.

#### 4 . Search:
- Traverse through the list to find a specific value or node.

#### 5 . Reversing the List:
   - Change the pointers of each node such that the list is reversed.

### Advantages of Linked Lists:

1. **Dynamic Size**: Can easily grow or shrink in size by adding or removing nodes without the need for memory reallocation (unlike arrays, which have a fixed size).
2. **Efficient Insertions/Deletions**: Adding or removing nodes is easier, especially at the beginning or end, compared to arrays (which require shifting elements).
3. **Efficient Memory Use**: Only the memory needed for the data and the pointers is allocated, unlike arrays, which might waste space if not fully utilized.

### Disadvantages of Linked Lists:

1. **No Random Access**: Accessing elements requires traversal from the head to the desired node, making access time proportional to the list's size (O (n)).
2. **Extra Memory for Pointers**: Each node requires additional memory for the pointer (s), increasing the memory overhead compared to arrays.
3. **Slower Traversal**: Since each element can only be accessed sequentially, traversing large linked lists can be slower compared to arrays where elements are indexed.

### Use Cases of Linked Lists:

1. **Dynamic Data**: When the size of the data structure is not known in advance or changes frequently, a linked list is a good choice.
2. **Efficient Insertions and Deletions**: For scenarios where elements are frequently added or removed from the middle or beginning of the structure, linked lists offer better performance than arrays.
3. **Implementing Stacks and Queues**: Linked lists are commonly used to implement dynamic data structures like stacks and queues.

### Time Complexity of Operations:

- **Accessing an element**: O (n) (since we may need to traverse the list).
- **Inserting an element**: O (1) (if inserting at the head or tail, or O (n) if inserting at a specific position after traversal).
- **Deleting an element**: O (1) (if deleting from the head or tail, or O (n) if deleting a node after traversal).