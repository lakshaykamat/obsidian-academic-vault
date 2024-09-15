### What is a Stack?

A **stack** is a linear data structure that follows the **Last In, First Out (LIFO)** principle. This means that the last element added to the stack will be the first one to be removed. It can be thought of as a collection of elements with two main operations:
1. **Push**: Add an element to the top of the stack.
2. **Pop**: Remove the element from the top of the stack.

A stack is often visualized as a vertical collection of items, where you can only interact with the topmost item.
![](https://media.geeksforgeeks.org/wp-content/uploads/20220714004311/Stack-660x566.png)

### Key Characteristics of a Stack:
- **LIFO (Last In, First Out)**: The most recently added element is the first one to be removed.
- **Access is restricted**: You can only access or remove the element at the top of the stack.
- **Used for backtracking**: Stacks are commonly used in algorithms where backtracking is necessary, such as in undo operations, parsing expressions, and depth-first search.

### Basic Operations on a Stack:

1. **Push (x)**:
   - Adds the element `x` to the top of the stack.
   - If the stack is full (in the case of a fixed-size stack), an overflow condition occurs.

2. **Pop**:
   - Removes and returns the top element from the stack.
   - If the stack is empty, an underflow condition occurs (i.e., there are no elements to pop).

3. **Peek (or Top)**:
   - Returns the top element of the stack without removing it.
   - It allows you to look at the top element without modifying the stack.

4. **isEmpty**:
   - Returns `true` if the stack is empty (i.e., no elements are present); otherwise, returns `false`.

5. **isFull** (for a fixed-size stack):
   - Returns `true` if the stack is full (for stacks with a defined maximum capacity).

### Example of Stack Operations:

Imagine a stack of books:
1. You can **push** books onto the stack (add them to the top).
2. You can **pop** books off the stack (remove the top book).
3. You can **peek** at the top book to see what's on top without removing it.

### Stack Representation:

A stack is typically represented as a collection of elements arranged in a vertical manner. The top element is always accessible, while the elements below are only accessible after removing the top.

Example:
```
Top -> [ 40 ]
       [ 30 ]
       [ 20 ]
       [ 10 ]
```

In this stack:
- The **top** element is 40.
- If we **pop** the stack, the 40 will be removed, and the new top will be 30.

### Stack Example with Operations:

1. **Initial Stack**: Empty.
2. **Push (10)**: Add 10 to the stack.
   ```
   [ 10 ]
   ```
3. **Push (20)**: Add 20 to the stack.
   ```
   [ 20 ]
   [ 10 ]
   ```
4. **Push (30)**: Add 30 to the stack.
   ```
   [ 30 ]
   [ 20 ]
   [ 10 ]
   ```
5. **Pop ()**: Remove the top element (30) from the stack.
   ```
   [ 20 ]
   [ 10 ]
   ```
6. **Peek ()**: The top element is 20 (but it is not removed).
7. **Push (40)**: Add 40 to the stack.
   ```
   [ 40 ]
   [ 20 ]
   [ 10 ]
   ```

### Time Complexity of Stack Operations:

- **Push**: O (1) (constant time) — Adding an element to the top is done in constant time.
- **Pop**: O (1) (constant time) — Removing an element from the top is done in constant time.
- **Peek**: O (1) — Accessing the top element is done in constant time.

### Applications of Stacks:

1. **Function Call Management (Recursion)**:
   - The stack is used to manage function calls in programming languages. When a function is called, its state is pushed onto the call stack, and when it returns, the state is popped off the stack.
   
2. **Expression Evaluation**:
   - Stacks are used to evaluate expressions (especially in postfix or prefix notation) and also for parsing expressions in infix notation.
   - Infix (e.g., `A + B`), Prefix (e.g., `+ A B`), and Postfix (e.g., `A B +`) notations often utilize stacks for conversion and evaluation.

3. **Undo/Redo Functionality**:
   - Text editors and many applications use stacks to implement undo and redo functionality. The most recent actions are pushed onto a stack, and when undo is invoked, actions are popped off the stack.

4. **Balanced Parentheses and Delimiter Matching**:
   - Stacks are used to check for balanced parentheses or other delimiters in code or expressions. For example, to verify if `((A + B) * C)` has correctly balanced parentheses.

5. **Backtracking Algorithms**:
   - Stacks are commonly used in algorithms where you need to backtrack, such as depth-first search (DFS) in graph traversal, solving mazes, and solving puzzles like the Tower of Hanoi.

6. **Reversing Data**:
   - Stacks can be used to reverse data. For example, reversing a string or reversing the order of elements in a list.

7. **Browser History**:
   - Web browsers use stacks to keep track of visited pages (back and forward operations). The current page is at the top of the stack, and when you go back, you pop the top page and move to the previous one.

### Types of Stacks:

1. **Fixed-size Stack**:
   - A stack with a predefined maximum size. If you try to push more elements than the maximum, it results in a **stack overflow**.

2. **Dynamic Stack**:
   - A stack that grows dynamically as elements are added. It typically uses a linked list or dynamically resizes the array when needed.

### Stack Data Structure Implementation:

There are two common ways to implement a stack:
1. **Array-based Stack**:
   - Uses a fixed-size array to store elements. The top pointer keeps track of the top element.
   - Drawback: The size of the array needs to be defined in advance, and it cannot grow beyond that limit.

2. **Linked List-based Stack**:
   - Each element is stored in a node, and nodes are linked together. The top pointer points to the most recent node.
   - Advantage: The size can grow dynamically without any predefined limit.
