# Unit 2

# Linked List

A linked list is a linear data structure in which the elements are not stored at contiguous memory locations. Instead, each element (or node) in the list consists of two parts: the data and a pointer to the next node in the list.

The first node in the list is called the head, while the last node is called the tail. The tail's next pointer is typically set to NULL, indicating the end of the list.

Linked lists can be used to implement dynamic data structures such as stacks, queues, and associative arrays. Compared to arrays, linked lists have the advantage of being able to efficiently insert and delete elements at any position in the list. However, they also have the disadvantage of not allowing constant-time access to individual elements, since each element must be traversed sequentially from the beginning of the list.

There are different types of linked lists such as singly linked list, doubly linked list, and circular linked list.

![Untitled](Unit%202%206904dd64642549a0aa8a9031fa95bc70/Untitled.png)

## Array vs Linked List

Arrays and linked lists are both data structures used to store collections of elements, but they have distinct characteristics and are suited for different scenarios. Let's compare arrays and linked lists based on various factors:

1. Structure:
    - Array: Elements are stored in contiguous memory locations, forming a fixed-size block of memory.
    - Linked List: Elements are stored in separate nodes that contain both data and a reference/pointer to the next node, forming a dynamic structure.
2. Insertion and Deletion:
    - Array: Insertion and deletion operations can be costly, especially in the middle or beginning of the array, as elements may need to be shifted to accommodate the change.
    - Linked List: Insertion and deletion operations are efficient, especially for inserting/deleting nodes at the beginning or middle, as it requires updating pointers without shifting elements.
3. Accessing Elements:
    - Array: Accessing elements by index is efficient, as it involves a direct memory lookup.
    - Linked List: Accessing elements by index is inefficient, as it requires traversing the list from the head node to the desired position.
4. Size and Flexibility:
    - Array: Fixed size determined during initialization. It is less flexible and requires resizing if the number of elements changes.
    - Linked List: Dynamic size that can grow or shrink easily by adding or removing nodes. It offers flexibility in terms of size adjustments.
5. Memory Overhead:
    - Array: Requires contiguous memory block, so it may have memory fragmentation and a fixed memory allocation even if not fully utilized.
    - Linked List: Each node requires additional memory for storing the reference/pointer, leading to slightly higher memory overhead.
6. Memory Allocation:
    - Array: Memory is allocated statically or dynamically using functions like `malloc()` or `calloc()`.
    - Linked List: Memory is dynamically allocated for each node using `malloc()` or `calloc()`.
7. Searching:
    - Array: Searching can be efficient using binary search (for sorted arrays) or linear search. Random access is possible.
    - Linked List: Searching is less efficient, as it requires traversing the list linearly from the head to find an element.

Based on these factors, arrays are more suitable when fast element access, random access, or efficient searching is required. Linked lists are better for frequent insertions and deletions, dynamic resizing, and when sequential access or traversing the list is more important.

It's important to choose the appropriate data structure based on the specific requirements and operations of your program. In some cases, a combination of both arrays and linked lists can be used to leverage their respective strengths.

![https://cdn.educba.com/academy/wp-content/uploads/2021/04/Linked-List-vs-Array.jpg](https://cdn.educba.com/academy/wp-content/uploads/2021/04/Linked-List-vs-Array.jpg)

## Key Points

Here are some key points about linked lists:

1. A linked list is a linear data structure in which elements are stored in a non-contiguous manner. Each element in the linked list is called a node, and consists of two fields - data and a pointer to the next node in the list.
2. The first node of the linked list is called the head node, and the last node is called the tail node. The tail node's next pointer is set to NULL to indicate the end of the list.
3. Linked lists can be used to implement dynamic data structures such as stacks, queues, and associative arrays.
4. Unlike arrays, linked lists do not have a fixed size, and new nodes can be added or removed from the list easily.
5. However, accessing an element in a linked list requires traversing the list from the head to the desired node, which can be slower than accessing an element in an array directly.
6. Linked lists come in different variations such as singly linked list, doubly linked list, and circular linked list. Singly linked list has each node containing only a pointer to the next node, whereas doubly linked list has each node containing pointers to both the next and the previous node. A circular linked list is a type of linked list in which the last node points to the head node, forming a loop.
7. Linked lists can be used to solve a wide range of problems, such as implementing file systems, symbol tables, and garbage collectors.

# Singly Linked List

## Creating Linked List

```c
struct Node* createNode(int data){
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}
```

Now connect the nodes with each other

```c
		struct Node* head = createNode(2);
    struct Node* second = createNode(4);
    struct Node* third = createNode(6);
    head->next = second;
    second->next = third;
```

## Traversal in Linked List

```c
void printList(struct Node* node){
    while(node!=NULL){
        printf("%d ",node->data);
        node = node->next;
    }
}
```

## Insertion in Linked List

### Insert at Beginning

**Time Complexity:** O(1)

**Space Complexity:** O(1)

The time complexity of this function is O(1), as the operation takes a constant amount of time regardless of the size of the linked list. This is because the new node is simply inserted at the beginning of the list by updating the head pointer and modifying a couple of pointers.

The space complexity of this function is also O(1), as only a single new node is created in the heap, regardless of the size of the linked list.

```c
void insertAtFirst(struct Node** headRef,int data){
    //creating a new node in heap
    struct Node* newNode = createNode(data);

    //pointing it's next to current head to make it first element or the new head
    newNode->next = *headRef;
    //reassigning the new head
    *headRef = newNode;
}
```

 This function, `insertAtFirst`, is used to insert a new node with a given data value at the beginning of a linked list. Here's a step-by-step explanation of the function:

```c
void insertAtFirst(struct Node** headRef, int data) {
    // Creating a new node in heap
    struct Node* newNode = createNode(data);

```

The function begins by creating a new node using the `createNode` function. This new node will contain the specified data value.

```c
    // Pointing its next to current head to make it the first element or the new head
    newNode->next = *headRef;
```

The `next` pointer of the new node is set to the current head node. This step ensures that the new node becomes the first element in the linked list, as it now points to what was previously the head node.

```c
    // Reassigning the new head
    *headRef = newNode;

```

The head pointer is then reassigned to point to the newly inserted node. This effectively makes the new node the new head of the linked list.

### Insertion at given index

The time complexity of this function is O(n), where n is the length of the linked list. This is because in the worst case, the function may need to traverse the entire list to find the insertion point.

The space complexity of this function is O(1), as only a single new node is created in the heap, regardless of the size of the linked list.

```c
void insertAtIndex(struct Node** headRef, int index, int data) {
    // Create a new node with the given data
    struct Node* newNode = createNode(data);
    
    // Handle the special case of inserting at the beginning of the list
    if (index == 0) {
        newNode->next = *headRef;
        *headRef = newNode;
        return;
    }
    
    // Traverse the list to find the node before the insertion point
    struct Node* currentNode = *headRef;
    for (int i = 0; i < index - 1 && currentNode != NULL; i++) {
        currentNode = currentNode->next;
    }
    
    // Handle the case where the index is out of range
    if (currentNode == NULL) {
        printf("Error: Index out of range\n");
        return;
    }
    
    // Insert the new node into the list
    newNode->next = currentNode->next;
    currentNode->next = newNode;
}
```

The function `insertAtIndex` is used to insert a new node with a given data value at a specified index in a linked list. Here's a step-by-step explanation:

1. First, a new node is created using the `createNode` function, which allocates memory for the new node in the heap and initializes its data value.
2. If the index is 0, it is a special case where the new node needs to be inserted at the beginning of the list. In this case, the `next` pointer of the new node is set to the current head node, and the head pointer is updated to point to the new node. The function then returns.
3. If the index is greater than 0, the function needs to traverse the list to find the node just before the insertion point. It starts at the head node and follows the `next` pointers until it reaches the node just before the desired index. The loop continues until either the desired index is reached or the end of the list is encountered.
4. If the loop reaches the end of the list without finding the desired index, it means the index is out of range. In this case, the function prints an error message and returns.
5. Once the correct insertion point is found, the new node is inserted into the list. The `next` pointer of the new node is set to the node that comes after it, and the `next` pointer of the node before it is updated to point to the new node.

### Insert at the End

```c
void insertAtEnd(struct Node** headRef, int data) {
    // Create a new node with the given data
    struct Node* newNode = createNode(data);

    // If the list is empty, the new node becomes the head
    if (*headRef == NULL) {
        *headRef = newNode;
        return;
    }

    // Traverse the list to find the last node
    struct Node* currentNode = *headRef;
    while (currentNode->next != NULL) {
        currentNode = currentNode->next;
    }
    currentNode->next = newNode;
}

```

The function takes two parameters: a double pointer to the head node of the linked list (`headRef`) and an integer data value (`data`).

1. A new node is created using the `createNode` function, which allocates memory for the new node in the heap and initializes its data value.
2. If the linked list is empty (i.e., the head pointer is `NULL`), it means there are no nodes in the list. In this case, the new node becomes the head node, and the function returns. The head pointer is updated to point to the new node.
3. If the linked list is not empty, the function traverses the list to find the last node. It starts at the head node and follows the `next` pointers until it reaches a node whose `next` pointer is `NULL`. This indicates that it is the last node in the list.
4. Once the last node is found, the `next` pointer of the last node is set to point to the new node. This effectively inserts the new node at the end of the list.

The time complexity of the `insertAtEnd` function is O(n), where n is the length of the linked list. This is because in the worst case, the function needs to traverse the entire list to find the last node before inserting the new node at the end. The traversal involves following the `next` pointers from the head node to the last node, which requires iterating through each node in the list.

The space complexity of the function is O(1) because it only requires a constant amount of additional space. The function creates a single new node in the heap, regardless of the size of the linked list. No additional data structures or recursive calls are used, so the space usage remains constant.

### Insert After Node

```c
void insertAfterNode(struct Node* prevNode, int data) {
    if (prevNode == NULL) {
        printf("Error: Previous node cannot be NULL.\\n");
        return;
    }

    struct Node* newNode = createNode(data);

    newNode->next = prevNode->next;
    prevNode->next = newNode;
}

```

The function takes two parameters: a pointer to the previous node (`prevNode`) after which the new node will be inserted, and an integer data value (`data`) for the new node.

Here's how the function works:

1. First, it checks if the `prevNode` is `NULL`. If it is `NULL`, it means that the previous node does not exist, and an error message is printed. The function then returns.
2. If the `prevNode` is not `NULL`, a new node is created using the `createNode` function.
3. The `next` pointer of the new node is set to the `next` pointer of the `prevNode`.
4. The `next` pointer of the `prevNode` is updated to point to the new node, effectively inserting the new node after the `prevNode`.

The time complexity of the `insertAfterNode` function is O(1) in the average case. This is because inserting a node after a given node involves updating a few pointers and does not require traversing the entire linked list. It only requires a constant amount of operations regardless of the size of the list.

However, in the worst case scenario where the given `prevNode` is the last node in the linked list, the time complexity would be O(n), where n is the length of the list. This is because in that case, the function needs to traverse the entire list to find the last node in order to perform the insertion.

The space complexity of the function is O(1) as it only requires a constant amount of additional space. It creates a single new node in the heap and does not rely on any additional data structures or recursive calls.

Overall, the time complexity of the `insertAfterNode` function is O(1) in the average case and O(n) in the worst case, while the space complexity remains constant at O(1).

## Deletion in Linked List

### Deleting the first node

Certainly! Here's an implementation of a function `deleteFirstNode` that deletes the first node of a linked list:

```c
void deleteFirstNode(struct Node** headRef) {
    if (*headRef == NULL) {
        printf("Error: The list is already empty.\\n");
        return;
    }

    struct Node* temp = *headRef;
    *headRef = (*headRef)->next;
    free(temp);
}

```

The function takes a double pointer to the head node of the linked list (`headRef`).

Here's how the function works:

1. It first checks if the list is empty by checking if the `headRef` is `NULL`. If it is, it means that the list is already empty, and an error message is printed. The function then returns.
2. If the list is not empty, a temporary pointer `temp` is created and set to point to the current head node.
3. The `headRef` is updated to point to the next node after the current head node. This effectively removes the first node from the list.
4. The `temp` pointer, which still points to the original head node, is freed to deallocate the memory occupied by the deleted node.

The time complexity of the `deleteFirstNode` function is O(1), which means it has constant time complexity. This is because deleting the first node involves updating a few pointers and deallocating the memory of the deleted node. It does not require traversing the entire linked list. Regardless of the size of the list, the number of operations remains constant.

The space complexity of the function is also O(1), indicating constant space usage. It does not require any additional data structures or recursion. It simply uses a temporary pointer (`temp`) to hold the reference to the first node before deletion.

In summary, the time complexity of `deleteFirstNode` is O(1), and the space complexity is O(1).

### Deleting at the index

Sure, here's a function to delete a node at a given index in a linked list:

```c
void deleteAtIndex(struct Node** headRef, int index) {
    if (*headRef == NULL) {
        printf("Error: List is empty\\n");
        return;
    }

    // Handle the special case of deleting the first node
    if (index == 0) {
        struct Node* temp = *headRef;
        *headRef = (*headRef)->next;
        free(temp);
        return;
    }

    // Traverse the list to find the node before the deletion point
    struct Node* currentNode = *headRef;
    for (int i = 0; i < index - 1 && currentNode != NULL; i++) {
        currentNode = currentNode->next;
    }

    // Handle the case where the index is out of range
    if (currentNode == NULL || currentNode->next == NULL) {
        printf("Error: Index out of range\\n");
        return;
    }

    // Delete the node at the given index
    struct Node* temp = currentNode->next;
    currentNode->next = temp->next;
    free(temp);
}

```

Here's a step-by-step explanation of the function:

1. The function takes in a reference to the head of the linked list (`headRef`) and the index of the node to delete (`index`).
2. If the linked list is empty, the function prints an error message and returns.
3. If the index is 0, the function handles the special case of deleting the first node by assigning the head to the second node and freeing the first node.
4. If the index is not 0, the function traverses the linked list to find the node before the deletion point.
5. If the index is out of range, the function prints an error message and returns.
6. Otherwise, the function deletes the node at the given index by assigning the next pointer of the previous node to the next pointer of the node to be deleted, and freeing the node to be deleted.

The time complexity of this function is O(n) because in the worst case, it needs to traverse the entire linked list to find the node before the deletion point. The space complexity of this function is O(1) because it only uses a constant amount of additional memory to delete a node.

### Deleting the last node

Certainly! Here's a function to delete the last node of a linked list:

```c
void deleteLastNode(struct Node** headRef) {
    if (*headRef == NULL) {
        printf("Error: List is empty\\n");
        return;
    }

    // Handle the special case of a single node in the list
    if ((*headRef)->next == NULL) {
        free(*headRef);
        eadRef = NULL;
        return;
    }

    // Traverse the list to find the second-to-last node
    struct Node* currentNode = *headRef;
    while (currentNode->next->next != NULL) {
        currentNode = currentNode->next;
    }

    // Delete the last node
    struct Node* lastNode = currentNode->next;
    currentNode->next = NULL;
    free(lastNode);
}

```

Here's how the function works:

1. The function takes a reference to the head of the linked list (`headRef`).
2. If the linked list is empty, it prints an error message and returns.
3. If there is only one node in the list (the head node), it handles the special case by freeing the head node and setting the head pointer to NULL.
4. If there are more than one nodes in the list, the function traverses the list to find the second-to-last node. It stops at the node whose `next` pointer points to the last node.
5. The last node is deleted by freeing its memory and setting the `next` pointer of the second-to-last node to NULL.

The time complexity of this function is O(n) because, in the worst case, it needs to traverse the entire linked list to find the second-to-last node. The space complexity of this function is O(1) because it only uses a constant amount of additional memory to delete the last node.

### Delete the node by Element

Certainly! Here's a function to delete the first occurrence of a node with a given element in a linked list:

```c
void deleteByElement(struct Node** headRef, int data) {
    if (*headRef == NULL) {
        printf("Error: List is empty\\n");
        return;
    }

    // Handle the special case of the element being in the first node
    if ((*headRef)->data == data) {
        struct Node* temp = *headRef;
        *headRef = (*headRef)->next;
        free(temp);
        return;
    }

    // Traverse the list to find the node before the node to be deleted
    struct Node* currentNode = *headRef;
    while (currentNode->next != NULL && currentNode->next->data != data) {
        currentNode = currentNode->next;
    }

    // Handle the case where the element is not found
    if (currentNode->next == NULL) {
        printf("Error: Element not found\\n");
        return;
    }

    // Delete the node with the given element
    struct Node* temp = currentNode->next;
    currentNode->next = temp->next;
    free(temp);
}

```

Here's a step-by-step explanation of the function:

1. The function takes a reference to the head of the linked list (`headRef`) and the element to be deleted (`data`).
2. If the linked list is empty, it prints an error message and returns.
3. If the element is found in the first node, it handles the special case by assigning the head to the second node and freeing the first node.
4. If the element is not found in the first node, the function traverses the linked list to find the node before the node to be deleted. It stops at the node whose `next` node has the element to be deleted.
5. If the element is not found in the linked list, it prints an error message and returns.
6. Otherwise, the function deletes the node with the given element by assigning the `next` pointer of the previous node to the `next` pointer of the node to be deleted, and freeing the node to be deleted.

The time complexity of this function is O(n) because, in the worst case, it needs to traverse the entire linked list to find the node before the node to be deleted. The space complexity of this function is O(1) because it only uses a constant amount of additional memory to delete a node.

## Searching in Linked List

```c
int search(struct Node* head, int value) {
    struct Node* currentNode = head;
    int index = 0;

    while (currentNode != NULL) {
        if (currentNode->data == value) {
            return index;
        }
        currentNode = currentNode->next;
        index++;
    }

    // Value not found
    return -1;
}
```

Certainly! Here's a step-by-step explanation of the `search` function:

1. The function takes the head of the linked list (`head`) and the value to search for (`value`) as input parameters.
2. It initializes a pointer `currentNode` to the head of the list and an index variable to keep track of the current position. Initially, the index is set to 0.
3. It enters a loop that continues until the end of the list is reached (`currentNode != NULL`).
4. Inside the loop, it checks if the data in the current node matches the value being searched for (`currentNode->data == value`).
5. If the data matches, it means the value is found in the current node. The function returns the current index.
6. If the value is not found in the current node, it moves to the next node by updating the `currentNode` pointer to the next node in the list (`currentNode = currentNode->next`).
7. It also increments the index by 1, indicating that we have moved to the next position in the list.
8. The loop continues until the end of the list is reached or the value is found.
9. If the loop completes without finding the value, it means the value is not present in the linked list. The function returns -1 to indicate that.
- Time Complexity: The time complexity of the `search` function is O(n), where n is the number of nodes in the linked list. In the worst case, the function may need to traverse the entire list to find the value or reach the end of the list. The time complexity grows linearly with the size of the linked list.
- Space Complexity: The space complexity of the `search` function is O(1) because it uses a constant amount of extra memory regardless of the size of the linked list. The function only requires a few variables (`currentNode`, `index`, and `value`) to perform the search, and the amount of memory used by these variables remains constant regardless of the size of the list.

# Circular Linked List

A circular linked list is a type of linked list where the last node of the list points back to the first node, creating a circular structure. In other words, the next pointer of the last node in the list does not point to NULL as in a traditional singly linked list, but instead points to the head node of the list.

Here are some key characteristics of a circular linked list:

1. Circular Structure: In a circular linked list, the next pointer of the last node points back to the first node, forming a loop or circle.
2. No NULL termination: Unlike a traditional singly linked list, where the last node's next pointer is NULL, the last node in a circular linked list points to the first node.
3. Traversal: Starting from any node in the circular linked list, you can traverse the entire list by following the next pointers until you reach the starting node again.
4. No concept of "end": Since the last node points to the first node, there is no concept of an "end" in a circular linked list. You can keep traversing the list indefinitely.

![Untitled](Unit%202%206904dd64642549a0aa8a9031fa95bc70/Untitled%201.png)

### Creation

```c
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* next;
};

void traverseCircularLinkedList(struct Node* head) {
    if (head == NULL) {
        printf("Circular linked list is empty.\\n");
        return;
    }

    struct Node* currentNode = head;

    // Traverse the circular linked list
    do {
        printf("%d ", currentNode->data);
        currentNode = currentNode->next;
    } while (currentNode != head);

    printf("\\n");
}

int main() {
    // Create nodes for the circular linked list
    struct Node* head = (struct Node*)malloc(sizeof(struct Node));
    struct Node* second = (struct Node*)malloc(sizeof(struct Node));
    struct Node* third = (struct Node*)malloc(sizeof(struct Node));

    // Assign data to the nodes
    head->data = 1;
    second->data = 2;
    third->data = 3;

    // Connect the nodes to form a circular linked list
    head->next = second;
    second->next = third;
    third->next = head;

    // Traverse and print the circular linked list
    printf("Circular Linked List: ");
    traverseCircularLinkedList(head);

    return 0;
}

```

# Doubly Linked List

A doubly linked list is a type of linked list where each node contains two pointers: one that points to the previous node and another that points to the next node. This allows for both forward and backward traversal of the list. In addition to the data element stored in each node, a doubly linked list also maintains references to its previous and next nodes.

Here are some key characteristics of a doubly linked list:

1. Bidirectional Traversal: Unlike a singly linked list, where you can only traverse the list in one direction (forward), a doubly linked list allows traversal in both directions (forward and backward) by following the next and previous pointers.
2. Previous Pointer: Each node in a doubly linked list has a pointer that points to the previous node, enabling efficient backward traversal.
3. Next Pointer: Each node also has a pointer that points to the next node, allowing forward traversal.
4. Flexibility: The presence of both next and previous pointers in each node provides flexibility in performing operations such as inserting, deleting, or searching for elements in both directions.
5. Increased Memory Overhead: Compared to a singly linked list, a doubly linked list requires additional memory to store the previous pointers, increasing the overall memory overhead.

![Untitled](Unit%202%206904dd64642549a0aa8a9031fa95bc70/Untitled%202.png)

### Creation

```c
#include <stdio.h>
#include <stdlib.h>

struct Node {
    int data;
    struct Node* prev;
    struct Node* next;
};

struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->prev = NULL;
    newNode->next = NULL;
    return newNode;
}

void printList(struct Node* head) {
    struct Node* currentNode = head;

    if (head == NULL) {
        printf("Doubly linked list is empty.\n");
        return;
    }

    while (currentNode != NULL) {
        printf("%d ", currentNode->data);
        currentNode = currentNode->next;
    }

    printf("\n");
}

int main() {
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;

    // Create nodes for the doubly linked list
    head = createNode(1);
    second = createNode(2);
    third = createNode(3);

    // Connect the nodes to form the doubly linked list
    head->next = second;
    second->prev = head;
    second->next = third;
    third->prev = second;

    // Print the doubly linked list
    printf("Doubly Linked List: ");
    printList(head);

    // Free the allocated memory
    free(head);
    free(second);
    free(third);

    return 0;
}
```