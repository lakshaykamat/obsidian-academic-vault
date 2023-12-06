---
tags:
- "#os"
- "#college"
---

# Difference between contiguous and non-contiguous memory allocation
| Aspect | Contiguous Memory Allocation | Non-Contiguous Memory Allocation |
| --- | --- | --- |
| Definition | Allocates consecutive blocks of memory to a process. | Allocates separate, non-consecutive blocks of memory to a process. |
| Memory Allocation | Assigns a single memory space to a process. | Allocates memory in scattered locations. |
| Fragmentation | Can lead to external fragmentation, where free memory is scattered in small chunks, making it inefficient to allocate to new processes. | Reduces external fragmentation but may introduce internal fragmentation. |
| Addressing | Easier to address memory locations as they are contiguous. | Requires more complex addressing mechanisms as memory is not contiguous. |
| Utilization of Memory Space | May result in inefficient use of memory, as larger chunks may be allocated than needed. | Tends to use memory space more efficiently, but some memory may be wasted due to internal fragmentation. |
| Reallocation of Memory | Reallocation or deallocation of memory is more challenging. | Reallocation and deallocation of memory can be more flexible. |
| Examples | Early operating systems used contiguous allocation. | Modern operating systems often use non-contiguous allocation for flexibility and reduced fragmentation. |

In summary, contiguous memory allocation assigns a single, continuous memory block to a process, while non-contiguous allocation allocates memory in separate, scattered locations. Contiguous allocation can lead to external fragmentation, making it less efficient, while non-contiguous allocation reduces external fragmentation but may introduce internal fragmentation. Modern operating systems tend to favor non-contiguous memory allocation for its flexibility and efficient memory usage.

![https://media.geeksforgeeks.org/wp-content/uploads/20200405213343/Picture12.jpg](https://media.geeksforgeeks.org/wp-content/uploads/20200405213343/Picture12.jpg)

![https://media.geeksforgeeks.org/wp-content/uploads/20200405214155/Picture24.jpg](https://media.geeksforgeeks.org/wp-content/uploads/20200405214155/Picture24.jpg)
