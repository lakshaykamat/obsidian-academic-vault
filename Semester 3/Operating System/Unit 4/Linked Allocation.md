---
tags:
- "#os"
- "#college"
---
# Linked allocation
Linked allocation is a file allocation method used by file systems to store files on a storage device. In this method, files are allocated space in a non-contiguous manner, and each file is represented as a linked list of disk blocks. Here's an overview of linked allocation
![Linked List Allocation](https://media.geeksforgeeks.org/wp-content/uploads/linkedListAllocation.jpg)

### Characteristics of Linked Allocation
1. **Non-contiguous Allocation:**
    - Files are not stored in a contiguous block but rather as a chain of blocks scattered across the disk.
2. **Pointers and Blocks:**
    - Each block contains data and a pointer/reference to the next block of the file.
3. **Flexibility in Allocation:**
    - Allocation of space is flexible as free blocks can be scattered across the disk.
4. **No External Fragmentation:**
    - Linked allocation avoids external fragmentation since files are stored in scattered blocks.
## Advantages of Linked Allocation:
1. **Efficient Space Utilization:**
	- Effective utilization of space, as free blocks can be utilized without requiring contiguous space.
1. **Simple File Deletion:**
	- Deleting a file involves simply removing the pointers to its blocks, allowing for straightforward deletion.
2. **No External Fragmentation:**
	- Eliminates external fragmentation by using scattered blocks for files.
3. **Size can Increase**
	- File size can easily increase without the headache
## Disadvantages of Linked Allocation:
1. **Random Access Overhead:**
	- Accessing data randomly within a file can be slower due to scattered blocks and the need to traverse pointers.
2. **Wasted Space in Block Pointers:**
	- Each block contains a pointer/reference to the next block, which consumes additional space.
3. **Pointer Management Overhead:**
	- Managing pointers to blocks requires additional overhead in terms of storage and maintenance.
4. **Difficulty in Resizing Files:**
	- Resizing a file (increasing or decreasing its size) involves adjusting and managing the linked blocks, which can be complex.