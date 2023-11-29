---
tags:
- "#os"
- "#college"
---
# Free Space management
Free space list is used to keep track of all free disk blocks

It involves managing the available storage space on the hard disk or other secondary storage devices. 

OS uses various techniques to manage free space and optimize the use of storage devices.
![](https://media.geeksforgeeks.org/wp-content/uploads/2-190.png)

A bit map uses bits to represent block status, often contiguous, while a bit vector utilizes fixed-size arrays for block allocation status representation.
## Bit map vs Bit Vector

| **Aspect**         | **Bit Map**                             | **Bit Vector**                              |
|--------------------|-----------------------------------------|---------------------------------------------|
| **Representation** | Uses a collection of bits, often in a linear fashion, to represent block status. | Utilizes a fixed-size array or vector structure to represent block status with bits. |
| **Memory Allocation** | Requires contiguous memory allocation for the entire bitmap, which may lead to inefficiencies for larger storage systems. | Involves an array structure with fixed-size allocation, providing more flexibility in terms of memory usage. |
| **Data Structure** | Typically refers to a bitmap with bits represented in contiguous memory. | A generalized term for a vector or array of bits used to represent block allocation status. |
| **Flexibility**    | Less flexible due to its requirement for contiguous memory allocation. | More flexible in terms of memory allocation, allowing for easier implementation. |
| **Implementation** | Compact representation, efficient for quick checks of block availability. | Offers ease of implementation with a fixed-size array, providing efficient checks of block status. |
| **Memory Efficiency** | May be less memory-efficient for larger storage due to contiguous memory requirements. | Offers moderate memory efficiency, adaptable to various storage sizes. |