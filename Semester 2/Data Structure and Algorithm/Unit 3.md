# Unit 3

# Stack

A stack is a data structure that allows data to be stored and retrieved in a specific order, known as last-in, first-out (LIFO). This means that the last item added to the stack is the first one to be removed.

Stacks can be implemented using arrays or linked lists. In an array-based implementation, the stack is typically represented as a fixed-size array, with a pointer indicating the top of the stack. In a linked-list-based implementation, each node in the linked list stores a value and a pointer to the next node in the list, and the stack is represented as a linked list where the head node is the top of the stack.

# Applications Of Stack

1. A stack is used by compilers and interpreters to keep track of function calls, local variables, and parameters. When a function is called, the current state of the program is saved onto the stack, and when the function returns, the state is restored from the stack.
2. Expression Evaluation: Stacks are used to evaluate arithmetic expressions, postfix expressions, and infix expressions. Infix expressions are converted to postfix or prefix form using stacks, which are then evaluated to get the final result.
3. Browser History: The back and forward buttons in web browsers use a stack data structure to keep track of the user's browsing history. Each time a user clicks the back button, the previous page is popped from the stack, and when the forward button is clicked, the next page is pushed onto the stack.
4. Undo/Redo Operations: Many applications, such as text editors and graphic design software, use stacks to implement undo and redo operations. Each time a user performs an operation, it is pushed onto the stack, and when the user wants to undo the operation, it is popped from the stack.
5. Recursive Algorithms: Recursive algorithms, such as depth-first search in a graph or the Towers of Hanoi problem, use stacks to keep track of the function calls and to avoid stack overflow.
6. Memory Management: Operating systems use a stack data structure to manage memory allocation for processes. Each process has its own stack, and memory is allocated from the top of the stack, which grows downwards.

# Working of Stack

1. A stack is a data structure that operates on the Last-In-First-Out (LIFO) principle.
2. A stack can be implemented using an array or a linked list.
3. In an array-based implementation, a stack is represented as a fixed-size array with a pointer that indicates the top of the stack.
4. In a linked-list-based implementation, a stack is represented as a linked list, with each node containing a value and a pointer to the next node in the list.
5. The two primary operations that can be performed on a stack are push and pop.
6. The push operation adds an item to the top of the stack, while the pop operation removes the item from the top of the stack.
7. Other operations such as peek, size, isEmpty, and clear can also be performed on the stack as needed.
8. When an item is pushed onto the stack, it becomes the new top of the stack.
9. When an item is popped from the stack, the next item becomes the new top of the stack.
10. The most recently added item is always at the top of the stack, and it can be accessed and removed quickly.
11. The working of a stack is based on the principle of LIFO, which means that the last item added to the stack is the first one to be removed.

![Untitled](https://media.geeksforgeeks.org/wp-content/cdn-uploads/20221219100314/stack.drawio2.png)

# Operations of Stack

1. Push: This operation adds an element to the top of the stack. The element is inserted into the stack at the top position. The top position of the stack is then incremented by one.
2. Pop: This operation removes an element from the top of the stack. The element at the top of the stack is removed, and the top position of the stack is decremented by one.
3. Peek/Top: This operation returns the element at the top of the stack without removing it. It is also called the Top operation.
4. isEmpty: This operation checks if the stack is empty. It returns true if the stack is empty, and false otherwise.
5. isFull: This operation checks if the stack is full. It returns true if the stack is full, and false otherwise. This operation is applicable only in cases where the stack has a fixed size.
6. Size: This operation returns the number of elements in the stack.
7. Clear: This operation removes all the elements from the stack, making it empty.

# Implementation

## Array

```c
#include <stdio.h>
#define MAX_SIZE 10

// Stack structure
typedef struct {
    int items[MAX_SIZE];
    int top;
} Stack;

// Initialize stack
void initialize(Stack* stack) {
    stack->top = -1;
}

// Check if the stack is empty
int isEmpty(Stack* stack) {
    return stack->top == -1;
}

// Check if the stack is full
int isFull(Stack* stack) {
    return stack->top == MAX_SIZE - 1;
}

// Push an element into the stack
void push(Stack* stack, int item) {
    if (isFull(stack)) {
        printf("Stack is full. Cannot push element.\n");
        return;
    }

    stack->items[++stack->top] = item;
}

// Pop an element from the stack
int pop(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty. Cannot pop element.\n");
        return -1;
    }

    return stack->items[stack->top--];
}

// Get the top element of the stack without removing it
int peek(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty.\n");
        return -1;
    }

    return stack->items[stack->top];
}

int main() {
    Stack stack;
    initialize(&stack);

    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);

    printf("Top element: %d\n", peek(&stack));

    printf("Popped element: %d\n", pop(&stack));
    printf("Popped element: %d\n", pop(&stack));
    printf("Popped element: %d\n", pop(&stack));

    if (isEmpty(&stack)) {
        printf("Stack is empty.\n");
    } else {
        printf("Stack is not empty.\n");
    }

    return 0;
}
```

In this implementation, the stack is defined as a global array with a maximum size of 10. The push function adds an item to the top of the stack, and the pop function removes an item from the top of the stack. The peek function returns the item at the top of the stack without removing it. The isEmpty and isFull functions are used to check whether the stack is empty or full, respectively. In the main function, we demonstrate the use of the stack by pushing some items onto it, peeking at the top item, popping an item off the stack, and checking whether the stack is empty or full.

## Linked List

```c
#include <stdio.h>
#include <stdlib.h>

// Node structure
typedef struct Node {
    int data;
    struct Node* next;
} Node;

// Stack structure
typedef struct {
    Node* top;
} Stack;

// Initialize stack
void initialize(Stack* stack) {
    stack->top = NULL;
}

// Check if the stack is empty
int isEmpty(Stack* stack) {
    return stack->top == NULL;
}

// Push an element into the stack
void push(Stack* stack, int item) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation failed. Cannot push element.\n");
        return;
    }
    newNode->data = item;
    newNode->next = stack->top;
    stack->top = newNode;
}

// Pop an element from the stack
int pop(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty. Cannot pop element.\n");
        return -1;
    }

    Node* poppedNode = stack->top;
    int poppedData = poppedNode->data;
    stack->top = poppedNode->next;
    free(poppedNode);
    return poppedData;
}

// Get the top element of the stack without removing it
int peek(Stack* stack) {
    if (isEmpty(stack)) {
        printf("Stack is empty.\n");
        return -1;
    }

    return stack->top->data;
}

int main() {
    Stack stack;
    initialize(&stack);

    push(&stack, 1);
    push(&stack, 2);
    push(&stack, 3);

    printf("Top element: %d\n", peek(&stack));

    printf("Popped element: %d\n", pop(&stack));
    printf("Popped element: %d\n", pop(&stack));
    printf("Popped element: %d\n", pop(&stack));

    if (isEmpty(&stack)) {
        printf("Stack is empty.\n");
    } else {
        printf("Stack is not empty.\n");
    }

    return 0;
}
```

In this implementation, the stack is defined as a linked list, where each node of the linked list contains a data element and a pointer to the next node in the list. The push function adds a new node to the top of the stack, and the pop function removes the top node from the stack. The peek function returns the data element of the top node without removing it. The isEmpty function checks whether the stack is empty. In the main function, we demonstrate the use of the stack by pushing some items onto it, peeking at the top item, popping an item off the stack, and checking whether the stack is empty.

# Prefix Notation

Polish notation, also known as prefix notation, is a mathematical notation in which operators are placed before their operands. It is often used in computer science and programming languages to evaluate arithmetic expressions. The evaluation of Polish notation expressions can be efficiently performed using a stack.

Here's a step-by-step process for evaluating an expression in Polish notation using a stack:

1. Start with an empty stack.
2. Read the expression from right to left (since operators are placed before operands).
3. For each element in the expression:
    - If it is an operand (a number), push it onto the stack.
    - If it is an operator, pop the top two elements from the stack.
        - The first popped element becomes the right operand.
        - The second popped element becomes the left operand.
    - Apply the operator to the operands.
    - Push the result back onto the stack.
4. Once you have processed all the elements in the expression, the final result will be the only element left on the stack.

Here's an example to illustrate the process:

Expression: "+ * 4 5 2"

1. Start with an empty stack: []
2. Read the expression from right to left:
    - Push 2 onto the stack: [2]
    - Push 5 onto the stack: [5, 2]
    - Push 4 onto the stack: [4, 5, 2]
    - Encountered '+', so pop 4 and 5 from the stack.
        - Apply '+' to 4 and 5: 4 + 5 = 9
        - Push 9 onto the stack: [9, 2]
    - Encountered '*', so pop 9 and 2 from the stack.
        - Apply '*' to 9 and 2: 9 * 2 = 18
        - Push 18 onto the stack: [18]
3. Processed all elements in the expression.
4. The final result is the only element left on the stack: 18.

So, the expression "+ * 4 5 2" evaluates to 18 using Polish notation and a stack.

![Untitled](Unit%203%20e3ba5e2b197e40adbf65ab0b81adb43c/Untitled.png)

# Queue

A queue is a linear data structure that follows the FIFO (First-In-First-Out) principle, which means that the element that is inserted first will be the first one to be removed. It can be visualized as a real-world queue or line, where people stand in a line and the person who arrived first is served first.

In a queue, elements are added at the back (also called the rear or tail) and removed from the front (also called the head). The queue has two main operations:

1. Enqueue (insertion): Adds an element to the back of the queue.
2. Dequeue (deletion): Removes an element from the front of the queue.

Other important operations of a queue include:

1. Peek (access): Returns the element at the front of the queue without removing it.
2. IsEmpty: Checks whether the queue is empty or not.
3. IsFull: Checks whether the queue is full or not (in case of a fixed-size array implementation).

Queues can be implemented using arrays or linked lists.

# Applications of Queue

- Task scheduling: In operating systems, processes waiting for CPU time are queued in a ready queue, where they are served in a first-come, first-served basis.
- Printer queues: Jobs waiting to be printed are queued and processed in the order they were received.
- Web servers: Requests from clients are queued in a request queue, where they are processed in the order they were received.
- BFS (Breadth-First Search) algorithm: Queues are used in the BFS algorithm to explore all the nodes in a graph, where the nodes are visited in a level-by-level order.
- Simulation of real-life scenarios: Queues can be used to model real-life scenarios such as waiting in line for a ticket, waiting to board a plane, or waiting in a queue at a bank.
- Buffering: Queues can be used to buffer data between two systems with different speeds, ensuring that data is processed in the order it was received.
- Message passing: Queues can be used for message passing between different threads or processes in a concurrent program

# Working of Queue

1. A queue is a linear data structure that follows the FIFO (First-In-First-Out) principle.
2. It has two main operations: enqueue (insertion) and dequeue (deletion).
3. In a queue, elements are added at the back (also called the rear or tail) and removed from the front (also called the head).
4. When an element is added to the queue, it becomes the last element and is placed at the back of the queue.
5. When an element is removed from the queue, it is always the first element that was added (i.e., the element at the front of the queue).
6. Other important operations of a queue include peek (accessing the element at the front of the queue without removing it), isEmpty (checking if the queue is empty), and isFull (checking if the queue is full).
7. Queues can be implemented using arrays or linked lists. In an array implementation, a fixed-size array is used to store the elements of the queue.
8. To enqueue an element, the rear pointer is incremented and the element is added to the back of the queue.
9. To dequeue an element, the front pointer is incremented and the element at the front of the queue is removed.
10. If the queue is full, further enqueue operations are not possible until some elements are dequeued to make space.
11. If the queue is empty, further dequeue operations are not possible until some elements are enqueued.
12. Queues are commonly used in computer science and programming for various applications, such as task scheduling, printer queues, web servers, BFS algorithm, simulation of real-life scenarios, buffering, and message passing.

# Operations in Queue

The main operations in a queue are:

1. Enqueue: Adds an element to the back (also called the rear or tail) of the queue.
2. Dequeue: Removes the element at the front (also called the head) of the queue.
3. Peek: Accesses the element at the front of the queue without removing it.
4. isEmpty: Checks if the queue is empty.
5. isFull: Checks if the queue is full (in the case of a fixed-size queue).

These operations are used to manipulate the elements in the queue according to the FIFO (First-In-First-Out) principle. Other operations, such as size or capacity, may also be available depending on the specific implementation of the queue.

In addition to these basic operations, there may be other specialized operations depending on the use case, such as priority queues (where elements have a priority assigned to them and are dequeued based on their priority) or circular queues (where the back and front pointers wrap around the edges of the array to create a circular structure).

# Implementation

## Array

```c
#include <stdio.h>
#define SIZE 10
typedef struct{
    int items[SIZE];
    int front;
    int back;
}Queue;
void init(Queue* queue){
    queue->front = -1;
    queue->back = -1;
}
int isEmpty(Queue* queue) {
    return queue->front == -1;
}

int isFull(Queue* queue) {
    return queue->back == SIZE -1;
}

void enqueue(Queue* queue,int data){
    if(isFull(queue)){
        return;
    }
    if(isEmpty(queue)){
        queue->front = 0;
    }

    queue->items[++queue->back] = data;
}

void dequeue(Queue* queue){
    if (isEmpty(queue)) {
        printf("Queue is empty. Cannot dequeue element.\n");
        return;
    }
    if (queue->front == queue->back) {
        // Last element in the queue
        queue->front = -1;
        queue->back = -1;
    } else {
        queue->front = ++queue->front;
    }

}

int peek(Queue* queue){
    if (isEmpty(queue)) {
        printf("Queue is empty. Cannot retrieve front element.\n");
        return -1; // Return a default value when there is an error
    }
    return queue->items[queue->front];
}
int main(){
    Queue q1;
    init(&q1);
    enqueue(&q1,2);
    enqueue(&q1,4);
    enqueue(&q1,6);
    enqueue(&q1,8);
    printf("%d ",peek(&q1));
    dequeue(&q1);
    printf("%d ",peek(&q1));
    return 0;
}
```

## Linked List

Sure, here's an example of how to implement a queue using a linked list in C:

```c
#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct Node* next;
} Node;

typedef struct {
    Node* front;
    Node* rear;
} Queue;

void init(Queue* queue) {
    queue->front = NULL;
    queue->rear = NULL;
}

int isEmpty(Queue* queue) {
    return queue->front == NULL;
}

void enqueue(Queue* queue, int item) {
    Node* newNode = (Node*)malloc(sizeof(Node));
    if (newNode == NULL) {
        printf("Memory allocation failed. Cannot enqueue element.\n");
        return;
    }

    newNode->data = item;
    newNode->next = NULL;

    if (isEmpty(queue)) {
        queue->front = newNode;
        queue->rear = newNode;
    } else {
        queue->rear->next = newNode;
        queue->rear = newNode;
    }
}

void dequeue(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty. Cannot dequeue element.\n");
        return;
    }

    Node* temp = queue->front;
    queue->front = queue->front->next;

    if (queue->front == NULL) {
        // Queue became empty after dequeueing the only element
        queue->rear = NULL;
    }

    free(temp);
}

int front(Queue* queue) {
    if (isEmpty(queue)) {
        printf("Queue is empty. Cannot retrieve front element.\n");
        return -1; // Return a default value when there is an error
    }

    return queue->front->data;
}

int main() {
    Queue queue;
    init(&queue);

    enqueue(&queue, 2);
    enqueue(&queue, 4);
    enqueue(&queue, 6);

    printf("Front element: %d\n", front(&queue));
    dequeue(&queue);
    printf("Front element after dequeue: %d\n", front(&queue));

    return 0;
}
```