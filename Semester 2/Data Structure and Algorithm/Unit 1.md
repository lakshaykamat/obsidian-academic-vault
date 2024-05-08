# Unit 1

# Data Structures

In computer science, data structures refer to ways of organizing and storing data in a computer program so that it can be efficiently accessed and manipulated.

Data structures can be classified into two main categories: primitive data structures and abstract 

data structures.

## Primitive data structures

Primitive data structures in DSA (Data Structures and Algorithms) are the basic building blocks used to create more complex data structures. They include:

1. **Integer** - a whole number data type used to represent positive or negative values.
2. **Float** - a floating-point number data type used to represent real numbers.
3. **Double** - a double-precision floating-point number data type used to represent real numbers with higher precision.
4. **Boolean** - a logical data type used to represent true or false values.
5. **Character** - a single-character data type used to represent letters, symbols, and numbers.

These data types are often used to create more complex data structures such as arrays, linked lists, stacks, queues, trees, graphs, and hash tables. They are considered primitive because they are basic building blocks and cannot be broken down further into simpler data types.

## Abstract data structures

Abstract Data Types (ADTs) are high-level data structures that are defined independently of any programming language or implementation details. They describe the behavior and operations of a data structure, but not its internal implementation details. In other words, ADTs specify what an operation does, but not how it does it.

Examples of abstract data types include:

1. **Stack:** A collection of elements that supports two operations, "push" and "pop", which add and remove elements from the collection respectively.
2. **Queue:** A collection of elements that supports two operations, "enqueue" and "dequeue", which add elements to the end of the collection and remove elements from the front of the collection respectively.
3. **List:** A collection of elements that supports operations such as "insert", "delete", "get", and "set", which allow elements to be added, removed, and accessed by position.
4. **Set:** A collection of unique elements that supports operations such as "add", "remove", and "contains", which allow elements to be added, removed, and checked for membership.
5. **Map:** A collection of key-value pairs that supports operations such as "put", "get", and "remove", which allow elements to be added, accessed, and removed by key.

ADTs provide a high-level abstraction that allows programmers to think about data structures in a more general way, without getting bogged down in the details of a particular programming language or implementation. This makes them a powerful tool for designing and implementing algorithms and data structures that can be used across a wide range of applications and programming languages.

# Algorithms

In computer science, an algorithm is a set of well-defined instructions or a step-by-step procedure that is designed to solve a specific problem or accomplish a specific task.

Algorithms are the building blocks of computer programs and are used to manipulate, process, and transform data. They can be expressed in various forms, including natural language, pseudocode, and programming languages.

Good algorithms are characterized by their correctness, efficiency, and simplicity. Correctness means that the algorithm produces the desired output for any valid input. Efficiency refers to the algorithm's ability to solve the problem in a reasonable amount of time and with reasonable use of resources, such as memory or CPU cycles. Simplicity refers to the clarity and ease of understanding of the algorithm, which makes it easier to implement, debug, and maintain.

Examples of common algorithms include sorting algorithms (such as merge sort or quicksort), search algorithms (such as binary search), graph algorithms (such as Dijkstra's algorithm), and encryption algorithms (such as AES or RSA). The choice of algorithm depends on the specific problem being solved, the characteristics of the input data, and the performance requirements of the program.

![Untitled](Unit%201%20d198c57bb9514299bae50b13d135a353/Untitled.png)

# Database

A database is an organized collection of data that is stored and managed on a computer system. It is a central repository of information that can be accessed, managed, and updated by multiple users and applications simultaneously.

Databases are commonly used in a wide range of applications, such as e-commerce, banking, healthcare, education, and government. They are designed to store and manage large amounts of data in a structured and efficient manner, and to support fast and reliable access to that data.

A database is typically made up of one or more tables, which contain rows of data and columns that define the attributes of the data. The data is organized according to a schema, which defines the structure of the tables and the relationships between them. The schema can be created using a database management system (DBMS), which provides tools for creating, updating, and querying the database.

Common types of databases include relational databases, object-oriented databases, NoSQL databases, and graph databases. Each type of database has its own strengths and weaknesses and is suited to different types of applications and data models.

Overall, databases are essential tools for managing and organizing large amounts of data and are critical to many modern applications and services.

# Data warehouse

A data warehouse is a large, centralized repository of integrated data from multiple sources that are used for reporting and analysis. It is designed to support business intelligence (BI) activities, such as data mining, online analytical processing (OLAP), and predictive analytics.

Data warehouses are typically used in organizations where data is spread across multiple systems, departments, or locations. The data is extracted from various operational systems, transformed into a common format, and loaded into the data warehouse. The data is structured in a way that is optimized for analytical processing, rather than transaction processing.

Data warehouses are often implemented using a dimensional model, which organizes data into facts (measures) and dimensions. Facts represent the numerical data being analyzed (such as sales revenue or units sold), while dimensions represent the various attributes of the data (such as time, location, or product).

Data warehouses offer several benefits, including:

- Improved data quality and consistency, since data is consolidated from multiple sources
- Faster and more efficient data retrieval and analysis
- Increased flexibility and scalability, as data can be easily added or modified to meet changing business needs
- Improved decision-making and strategic planning, as data can be analyzed and visualized in a variety of ways.

Overall, data warehouses are essential tools for organizations that need to store, manage, and analyze large amounts of data from multiple sources, in order to gain valuable insights and make informed business decisions.

![Untitled](Unit%201%20d198c57bb9514299bae50b13d135a353/Untitled%201.png)

# Heap and Stack

In computer science, a stack and a heap are both data structures used to manage memory in a computer program.

A stack is a linear data structure in which elements are added and removed from one end, called the "top." It operates on a Last-In, First-Out (LIFO) principle, meaning that the last element added to the stack is the first one to be removed. A common analogy for a stack is a pile of plates, where the last plate placed on the top is the first to be removed. Stacks are commonly used for managing function calls and local variables in computer programs.

A heap, on the other hand, is a more complex data structure used for dynamic memory allocation. It is a region of memory where objects can be stored and retrieved in any order. The heap is managed by the operating system or the programming language runtime, and it is used to allocate and deallocate memory during program execution. The heap is typically used for storing complex data structures, such as arrays and linked lists, as well as for managing dynamic objects, such as objects created using the "new" keyword in Java.

The main difference between a stack and a heap is the way they manage memory. While a stack is managed by the program itself, a heap is managed by the operating system or runtime environment. Additionally, the stack has a fixed size and is typically smaller than the heap, while the heap can grow or shrink dynamically as needed.

Understanding the differences between stacks and heaps is important for efficient memory management in computer programs, and for avoiding common programming errors, such as stack overflow and heap fragmentation.

# Data type vs Data Structure

A data type is a classification of data based on the type of value that it can take. For example, common data types in many programming languages include integer, float, string, and Boolean.

A data structure, on the other hand, refers to the way data is organized and stored in a computer so that it can be accessed and used efficiently. It is a way to organize data in a specific format, such as a list, a tree, or a graph, to allow for efficient manipulation and retrieval. Data structures may contain elements of one or more data types.

In summary, a data type defines the type of value that can be stored in a variable, while a data structure defines the way data is organized and stored for efficient access and manipulation.

# Abstract Data Type

An Abstract Data Type (ADT) is a high-level description of a data structure that specifies the behavior of the data structure, without specifying its implementation details. It defines what operations can be performed on the data structure, such as insert, delete, or search, and what the data structure should do when these operations are performed.

An ADT defines the logical form of data and the operations that can be performed on it, independent of how the data is actually stored in memory. This allows for multiple implementations of the same ADT, with different performance characteristics, and for users of the ADT to understand how to use it, without needing to know its implementation details.

Examples of ADTs include the stack, queue, and linked list. An ADT can be implemented using different physical data structures, such as arrays or linked lists, to achieve different performance characteristics.

# Data Structure Operations

Data structures support a variety of operations to manipulate and process the data they contain. The specific operations that are available depend on the type of data structure being used. Here are some common operations for several types of data structures:

Arrays:

- Access: retrieve the value of an element at a specific index
- Insertion: add a new element at a specific index, shifting other elements to make room
- Deletion: remove an element from a specific index, shifting other elements to fill the gap
- Search: find the index of an element with a specific value
- Sorting: reorder the elements of the array in a specific order, such as ascending or descending

Linked lists:

- Insertion: add a new node to the beginning or end of the list
- Deletion: remove a node from the beginning, end, or middle of the list
- Access: retrieve the value of a node at a specific position
- Traversal: visit each node in the list in a specific order, such as from beginning to end or end to beginning
- Search: find the node with a specific value

Stacks:

- Push: add an element to the top of the stack
- Pop: remove the top element from the stack
- Peek: retrieve the value of the top element without removing it
- Size: return the number of elements currently in the stack
- Empty: check whether the stack is currently empty

Queues:

- Enqueue: add an element to the back of the queue
- Dequeue: remove the front element from the queue
- Peek: retrieve the value of the front element without removing it
- Size: return the number of elements currently in the queue
- Empty: check whether the queue is currently empty

Binary trees:

- Insertion: add a new node to the tree in the correct position
- Deletion: remove a node from the tree and rearrange the remaining nodes
- Traversal: visit each node in the tree in a specific order, such as in-order, pre-order, or post-order
- Search: find the node with a specific value
- Height: return the height of the tree, which is the length of the longest path from the root to a leaf node

There are several common operations that can be performed on data structures, including:

1. Insertion: Adding an element to a data structure at a specific position, such as the beginning or end of a list, or a specific index in an array.
2. Deletion: Removing an element from a data structure at a specific position, such as the beginning or end of a list, or a specific index in an array.
3. Searching: Finding the location of an element in a data structure based on its value.
4. Traversal: Visiting each element in a data structure in a specific order, such as depth-first or breadth-first traversal of a tree.
5. Sorting: Rearranging the elements of a data structure in a specific order, such as ascending or descending order based on their value.
6. Access: Retrieving the value of an element in a data structure at a specific position, such as accessing a specific index in an array or a specific node in a linked list.
7. Merge: Combining two or more data structures of the same type into a single data structure.
8. Split: Separating a data structure into two or more smaller data structures.
9. Updating: Changing the value of an element in a data structure at a specific position, such as updating a specific index in an array or a specific node in a linked list.

These operations are important for designing and implementing algorithms that manipulate data structures efficiently and effectively. Depending on the specific data structure and application, some operations may be more important or more complex than others.

These are just a few examples of the many operations that can be performed on different data structures. Choosing the appropriate data structure and using the appropriate operations is an important part of efficient programming and algorithm design.

# Categories of data structures

There are several categories of data structures, including:

1. **Linear data structures:** These are data structures that store data in a linear sequence, such as arrays, linked lists, stacks, and queues.
2. **Hierarchical data structures:** These are data structures that store data in a hierarchical, tree-like structure, such as binary trees, n-ary trees, and trie trees.
3. **Graph data structures:** These are data structures that store data as nodes and edges, forming a graph, such as adjacency lists and adjacency matrices.
4. **Dictionary data structures:** These are data structures that store data as key-value pairs, such as hash tables and binary search trees.
5. **Matrix data structures:** These are data structures that store data in a matrix format, such as two-dimensional arrays.

Each category of data structure has its own strengths and weaknesses, and the choice of data structure depends on the specific requirements of the application.

# Application of Data Structures

1. **Database indexing:** Data structures such as B-trees and hash tables are used to index large databases for efficient searching and retrieval of data.
2. **Compression:** Data structures such as Huffman trees and Arithmetic coding are used for data compression.
3. **Graph algorithms:** Graph data structures are used to solve problems related to networks, such as shortest path problems and network flow problems.
4. **Computer graphics:** Data structures such as BSP trees and octrees are used in computer graphics to efficiently store and manipulate 3D scenes.
5. **Artificial intelligence:** Data structures such as decision trees and neural networks are used in artificial intelligence to store and process information.
6. **Operating systems:** Data structures such as heaps and priority queues are used in operating systems to manage resources and allocate memory efficiently.
7. **Compiler design:** Data structures such as syntax trees and symbol tables are used in compiler design to parse and analyze source code.

# Time Complexity

Time complexity is a measure of the amount of time it takes for an algorithm to solve a problem as a function of the size of the input. It is a way of quantifying the efficiency of an algorithm.

In other words, the time complexity is the amount of time that an algorithm takes to complete its task, expressed as a function of the size of the input. This allows us to analyze how the running time of an algorithm grows as the input size increases.

Time complexity is usually expressed using Big O notation. For example, if an algorithm takes a constant amount of time to complete, regardless of the size of the input, its time complexity would be O(1). If an algorithm's running time increases linearly with the size of the input, its time complexity would be O(n). If the running time increases quadratically with the size of the input, the time complexity would be O(n^2).

It is important to consider the time complexity of an algorithm when solving problems, especially for large input sizes, as algorithms with a higher time complexity will take longer to run and may be impractical or even impossible to use for large input sizes. Therefore, choosing the appropriate algorithm with the best time complexity for a given problem is important for efficient computation.

# Big O Notation

![Untitled](Unit%201%20d198c57bb9514299bae50b13d135a353/Untitled%202.png)

Big O notation is a mathematical notation used to describe the performance or time complexity of an algorithm. It is a way of expressing how the running time of an algorithm or the memory space required by an algorithm grows as the size of the input data increases.

In Big O notation, the performance of an algorithm is expressed as a function of the size of the input data. The letter "O" is used to denote the order of the function, and the function is typically written in terms of "n," which represents the size of the input.

For example, if the running time of an algorithm grows linearly with the size of the input, we would express its time complexity as O(n). This means that the running time of the algorithm is proportional to the size of the input.

Other common time complexities include O(1) for constant time algorithms, O(log n) for algorithms that have a logarithmic time complexity, O(n^2) for quadratic time algorithms, and O(2^n) for exponential time algorithms.

Big O notation is useful because it allows us to compare the performance of different algorithms and to choose the most efficient algorithm for a given problem. It also helps us to understand how the performance of an algorithm will be affected by changes in the size of the input data.

It is important to note that Big O notation provides an upper bound on the time or space complexity of an algorithm and that the actual performance of an algorithm may be better or worse than the Big O notation suggests, depending on the specific implementation and other factors.

![Untitled](Unit%201%20d198c57bb9514299bae50b13d135a353/Untitled%203.png)

# Strings

In computer programming, a string is a sequence of characters, usually enclosed in quotation marks (either single or double quotes), that represents a piece of text. Strings are used to represent and manipulate textual data in computer programs.

## Pattern Matching Algorithms

Pattern matching algorithms are vital to Data Structures and Algorithms (DSA). They are used to find one or more occurrences of a pattern in a given text. Below are some of the commonly used pattern-matching algorithms in DSA:

1. **Naive Pattern Matching Algorithm:** This algorithm compares the pattern with the text character by character, and if a match is not found, it slides the pattern by one position and repeats the process until a match is found or the end of the text is reached. The worst-case time complexity of this algorithm is O(m*n), where m is the length of the pattern and n is the length of the text.
2. **Knuth-Morris-Pratt (KMP) Algorithm:** This algorithm is an improvement over the naive algorithm and uses a prefix function to skip unnecessary comparisons. The prefix function computes the longest proper prefix of the pattern that is also a suffix of its substring, and this information is used to avoid matching characters that have already been matched. The worst-case time complexity of the KMP algorithm is O(m+n).
3. **Boyer-Moore Algorithm:** This algorithm is based on two pre-processing steps, namely the bad character rule and the good suffix rule. The bad character rule compares the character in the text with the last occurrence of the same character in the pattern, while the good suffix rule uses information about the suffix of the pattern that matches a prefix of the text. The Boyer-Moore algorithm has a worst-case time complexity of O(m*n), but it is faster than the naive algorithm in practice.
4. **Rabin-Karp Algorithm:** This algorithm uses hashing to compare the pattern with the text. A hash function is used to compute the hash value of the pattern and the substrings of the text, and if the hash values match, the pattern and the substring are compared character by character to confirm the match. The worst-case time complexity of the Rabin-Karp algorithm is O(m*n), but it is faster than the naive algorithm in practice.

These are some of the most commonly used pattern matching algorithms in DSA, and their choice depends on the specific requirements of the problem at hand, such as the size of the text and the pattern, and the expected frequency of matches.

### Brute force

The brute force algorithm, also known as the naive algorithm, is a simple algorithmic approach that involves checking every possible solution to a problem until a satisfactory one is found. In computer science, the brute force algorithm is commonly used to solve problems in search, optimization, and other areas.

In the context of pattern matching, the brute force algorithm compares each character of the text with the first character of the pattern, and if they match, it compares the subsequent characters until the end of the pattern is reached or a mismatch occurs. If a match is found, the algorithm continues comparing the next character in the text with the first character of the pattern and repeats the process until the end of the text is reached or all occurrences of the pattern are found.

The worst-case time complexity of the brute force algorithm for pattern matching is O(m*n), where m is the length of the pattern and n is the length of the text. This is because, in the worst-case scenario, the algorithm needs to compare each character of the pattern with each character of the text. Therefore, the brute force algorithm is inefficient for large patterns or texts.

Despite its inefficiency, the brute force algorithm is useful as a baseline algorithm and for small problem sizes where performance is not a concern. Additionally, it is a simple and easy-to-understand algorithm, making it a good choice for educational purposes or when teaching the concept of pattern matching.

Certainly, here's an example and code for the brute force algorithm in C for finding the first occurrence of a pattern in a text:

Example: Find the index of the first occurrence of the pattern "abc" in the text "abababcababc".

```c
#include <stdio.h>
#include <string.h>

int search(char *pat, char *txt) {
    int M = strlen(pat);
    int N = strlen(txt);
 
    for (int i = 0; i <= N - M; i++) {
				int j;
        for (j = 0; j < M; j++) {
            if (txt[i + j] != pat[j])
                break;
        }
 
        if (j == M)
            return i;
    }
 
    return -1;
}

int main() {
    char txt[] = "abababcababc";
    char pat[] = "abc";
    int result = search(pat, txt);
    if (result == -1)
        printf("Pattern not found\n");
    else
        printf("Pattern found at index %d\n", result);
    return 0;
}
```

### Linear Search

The linear search algorithm can be used to search for a specific character or substring within a string in C. Here's an example implementation of the linear search for a character in a string:

```c
#include <stdio.h>
#include <string.h>

int linear_search_char(char string[], char target) {
    int i;
    int n = strlen(string);
    for (i = 0; i < n; i++) {
        if (string[i] == target) {
            return i;
        }
    }
    return -1; // target not found
}

int main() {
    char string[] = "Hello, World!";
    char target = 'o';
    int result = linear_search_char(string, target);
    if (result == -1) {
        printf("'%c' not found in '%s'\n", target, string);
    } else {
        printf("'%c' found at index %d in '%s'\n", target, result, string);
    }
    return 0;
}
```

# Sorting Algorithm

## Bubble Sort

Bubble sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements if they are in the wrong order until the entire list is sorted.

Here's how the algorithm works:

1. Start at the beginning of the list, and compare the first two elements. If the first element is greater than the second element, swap them.
2. Move to the next pair of adjacent elements and repeat step 1. Continue doing this until you reach the end of the list. At this point, the largest element will be at the end of the list.
3. Repeat steps 1 and 2 for all elements in the list except the last one. After each iteration, the last element of the list is guaranteed to be in its correct position.
4. Continue iterating through the list, excluding the last element, until no swaps are made. This indicates that the list is sorted.

The name "bubble sort" comes from the way the algorithm works: smaller elements "bubble up" to the top of the list as they are swapped with larger elements. Bubble sort is easy to implement and understand, but its time complexity is O(n^2), making it inefficient for large lists

![Untitled](Unit%201%20d198c57bb9514299bae50b13d135a353/Untitled%204.png)

```c
#include <stdio.h>

void bubbleSort(int arr[], int n) {
   int i, j;
   for (i = 0; i < n-1; i++) {
       for (j = 0; j < n-i-1; j++) {
           if (arr[j] > arr[j+1]) {
               // swap arr[j] and arr[j+1]
               int temp = arr[j];
               arr[j] = arr[j+1];
               arr[j+1] = temp;
           }
       }
   }
}

int main() {
   int arr[] = {64, 34, 25, 12, 22, 11, 90};
   int n = sizeof(arr)/sizeof(arr[0]);
   bubbleSort(arr, n);
   printf("Sorted array: \n");
   for (int i = 0; i < n; i++) {
       printf("%d ", arr[i]);
   }
   printf("\n");
   return 0;
}
```