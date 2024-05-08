# Unit 4

# Tree Data Structure

A tree data structure is a hierarchical data structure in computer science that consists of nodes connected by edges. It is similar to a real-life tree with roots, branches, and leaves. In a tree data structure, there is a single node called the root node, which is the topmost node in the hierarchy. Each node in a tree can have zero or more child nodes, except for the leaf nodes, which have no children.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled.png)

## Terminologies

- **Root:** The topmost node of a tree, which has no parent node.
- **Parent:** A node that has one or more child nodes.
- **Child:** A node that has a parent node.
- **Leaf:** A node that has no child nodes.
- **Sibling:** Nodes that share the same parent node.
- **Subtree:** A portion of a tree, including a node and all of its descendants.
- **Depth:** The number of edges from the root node to a given node.
- **Height:** The number of edges from a given node to the deepest leaf node in its subtree.

## Applications

1. **File Systems:** In a file system, directories and files are often organized in a tree structure, with the root directory at the top and subdirectories and files as its children.
2. **Data Compression:** Huffman coding is a compression technique that uses a binary tree to assign codes to characters based on their frequency of occurrence.
3. **Network Routing:** Tree structures are often used in network routing algorithms to determine the optimal path for data to travel between nodes.
4. **Computer Graphics:** Tree structures are used in computer graphics for rendering scenes, where each node represents a part of the scene or a transformation to be applied to the scene.
5. **Decision Trees:** In machine learning, decision trees are used to represent a sequence of decisions and their outcomes, leading to a final prediction or classification.
6. **XML Parsing:** Extensible Markup Language (XML) documents are often parsed into a tree structure for easier processing and manipulation.
7. **Compiler Design:** Abstract Syntax Trees (ASTs) are used in compiler design to represent the structure of source code in a tree format, making it easier to analyze and transform.
8. **Database Indexing:** Tree structures such as B-trees and B+ trees are commonly used in database indexing to organize and access data efficiently.

## Repl

[https://replit.com/@lakshaykamat/Tree#main.c](https://replit.com/@lakshaykamat/Tree#main.c)

## Traversal

Traversing a tree means visiting every node in the tree. You might, for instance, want to add all the values in the tree or find the largest one. For all these operations, you will need to visit 
each node of the tree.

Linear data structures like arrays, stacks, queues, and [linked list](https://www.programiz.com/data-structures/linked-list) have only one way to read the data. But a hierarchical data structure like a [tree](https://www.programiz.com/data-structures/trees) can be traversed in different ways.

1. **Preorder Traversal:** In preorder traversal, the algorithm visits the current node, then its left child, and then its right child. This is typically denoted as "root-left-right". Preorder traversal is useful for creating a copy of a tree, constructing an expression tree, or evaluating expressions in prefix notation.

<aside>
💡 **ROOT** LEFT RIGHT

</aside>

```c
void preOrder(struct Node *root) {
  if (root != NULL) {
    printf("%d ", root->data);
    preOrder(root->left);
    preOrder(root->right);
  }
}
```

1. **Postorder Traversal:** In postorder traversal, the algorithm visits the left child, then the right child, and then the current node. This is typically denoted as "left-right-root". Postorder traversal is useful for deleting a tree or evaluating expressions in postfix notation.

<aside>
💡 LEFT RIGHT **ROOT**

</aside>

```c
void postOrder(struct Node * root){
	if(root!=NULL){
		postOrder(root->left);
		postOrder(root->right);
		printf("%d ",root->data);
	}
}
```

1. **Inorder Traversal:** In inorder traversal, the algorithm visits the left child, then the current node, and then the right child. This is typically denoted as "left-root-right". Inorder traversal is useful for sorting a binary search tree or generating an infix expression from an expression tree.

<aside>
💡 LEFT **ROOT** RIGHT

</aside>

```c
void inOrder(struct Node *root) {
  if (root != NULL) {
    inOrder(root->left);
    printf("%d ", root->data);
    inOrder(root->right);
  }
}
```

## Types of Trees

- **Binary tree:** A tree where each node has at most two children.
- **Binary search tree:** A binary tree where the value of each node in the left subtree is less than the value of the root node, and the value of each node in the right subtree is greater than or equal to the value of the root node.
- **AVL tree:** A self-balancing binary search tree where the heights of the two subtrees of each node differ by at most one.

# Binary Tree

A binary tree is a data structure composed of nodes, where each node has at most two children, referred to as the left child and the right child. The topmost node of the tree is known as the root node, and each node in the tree has zero, one, or two children. Binary trees are commonly used to represent hierarchical relationships between data, such as the structure of a file system or the organization of a company. They are also useful for implementing efficient searching and sorting algorithms. Binary trees can be traversed in several ways, including preorder, inorder, and postorder, to perform various operations on the tree.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%201.png)

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%202.png)

## Properties

- A binary tree is a tree data structure in which each node has at most two children.
- The maximum number of nodes in a binary tree of height h is 2^(h+1) - 1, and the minimum number of nodes is h+1.
- In a binary tree, the left child of a node has a smaller value than the node, and the right child has a larger value.
- A binary tree can be traversed in different ways, including preorder, inorder, and postorder traversal.
- The height of a binary tree is the maximum number of edges between the root and a leaf node.

## Types of Binary trees

- **Full binary tree:** A binary tree where each node has either two children or no children.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%203.png)

- **Complete binary tree:** A binary tree where all levels are completely filled, except possibly the last level, which is filled from left to right.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%204.png)

- **Perfect binary tree:** A binary tree where all internal nodes have two children and all leaf nodes are at the same level.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%205.png)

- **Balanced binary tree:** A binary tree where the difference in height between the left and right subtrees of any node is at most one.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%206.png)

- **Skewed binary tree:** A binary tree where all nodes have only one child either to the left or right, resulting in a linear data structure.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%207.png)

- **Degenerate (or pathological) binary tree:** A binary tree where each parent node has only one associated child node. This results in a tree structure that is essentially a linked list.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%208.png)

# Binary Search Tree

A binary search tree is a binary tree data structure where each node has a key or value associated with it, and the value of each node in the left subtree is less than the value of the root node, and the value of each node in the right subtree is greater than the value of the root node. This property allows for efficient searching, insertion, and deletion of data. Binary search trees are commonly used in computer science to implement search algorithms, and they have a time complexity of O(log n) for these operations. However, if the tree is unbalanced, the worst-case time complexity can become O(n), where n is the number of nodes in the tree.

## Properties of Binary Search Trees (BSTs)

- Each node in a BST has a unique key or value.
- The value of each node in the left subtree is less than the value of the root node.
- The value of each node in the right subtree is greater than the value of the root node.
- Every subtree of a BST is itself a BST.
- There can be no duplicate nodes in a BST.

## Advantages of Binary Search Trees:

- Efficient searching: BSTs provide an efficient way to search for a specific value, with an average time complexity of O(log n).
- Efficient insertion and deletion: BSTs also provide an efficient way to insert or delete a node, with an average time complexity of O(log n).
- Versatility: BSTs can be used to store any type of data that can be compared, making them a versatile data structure.
- Ordered traversal: BSTs allow for in-order traversal of the tree, which can be used to output the elements in order, perform certain calculations or operations, and more.
- Space efficiency: BSTs use a minimal amount of memory to store data as compared to other data structures like arrays, linked lists, or hash tables.
- Easy implementation: Implementing a BST is relatively straightforward, and there are many resources available to help developers understand and utilize the data structure effectively.

# Graph Data Structure

A graph is a non-linear data structure that consists of a collection of vertices (also known as nodes) and a set of edges that connect pairs of vertices. In a graph, each vertex represents an entity, and each edge represents a relationship or connection between two entities.

A graph G can be defined as an ordered set G(V, E) where V(G) represents the set of vertices and E(G) represents the set of edges which are used to connect these vertices.

A Graph G(V, E) with 5 vertices (A, B, C, D, E) and six edges ((A,B), (B,C), (C,E), (E,D), (D,B), (D,A)) is shown in the following figure.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%209.png)

# Components

- **Vertices:** Vertices are the fundamental units of the graph. Sometimes, vertices are also known as vertex or nodes. Every node/vertex can be labeled or unlabelled.
- **Edges:** Edges are drawn or used to connect two nodes of the graph. It can be
ordered pair of nodes in a directed graph. Edges can connect any two
nodes in any possible way. There are no rules. Sometimes, edges are also known as arcs. Every edge can be labeled/unlabelled.

# Directed and Undirected Graph

Directed and undirected are two types of graphs based on the directionality of their edges.

In an undirected graph, edges have no direction and can be traversed in either direction. This means that if there is an edge between vertex A and vertex B, then there is also an edge between vertex B and vertex A. In other words, the relationship between the two vertices is bidirectional.

On the other hand, in a directed graph, each edge has a direction that specifies which vertex is the source and which is the destination. This means that if there is an edge from vertex A to vertex B, there is no guarantee that there is also an edge from vertex B to vertex A. The relationship between the two vertices is unidirectional, with one vertex being the origin and the other being the destination.

Directed and undirected graphs have different properties and can be used to represent different types of relationships between vertices. For example, an undirected graph might be used to represent a social network, where the relationship between two individuals is mutual, while a directed graph might be used to represent a road network, where the direction of traffic flow is important.

![Untitled](Unit%204%2089df3134ed954d98ad6f3e578b3293dc/Untitled%2010.png)

# Terminology

Here are some common terminologies used in Graph Theory:

1. Vertex or Node: A single point in the graph, often represented as a circle.
2. Edge: The line connecting two vertices. It can be directed or undirected, and can have a weight or cost associated with it.
3. Adjacent vertices: Two vertices that are connected by an edge.
4. Path: A sequence of vertices connected by edges. The length of a path is the number of edges it contains.
5. Cycle: A path that starts and ends at the same vertex.
6. Degree: The number of edges incident to a vertex. In a directed graph, a vertex has both an in-degree and an out-degree.
7. Weight: A value associated with an edge that represents the cost or distance between two vertices.
8. Connected graph: A graph in which there is a path between any two vertices.
9. Disconnected graph: A graph in which there are one or more pairs of vertices that are not connected by any path.
10. Subgraph: A subset of a graph that is also a graph.
11. Spanning tree: A subgraph of a connected graph that includes all of the vertices and a subset of the edges, forming a tree.
12. Directed Acyclic Graph (DAG): A directed graph that does not contain any cycles.
13. Bipartite graph: A graph whose vertices can be partitioned into two sets such that there are no edges between vertices within each set.
14. Complete graph: A graph in which every pair of distinct vertices is connected by an edge.
15. Isomorphic graphs: Two graphs that have the same structure, but may have different labels or names for their vertices.