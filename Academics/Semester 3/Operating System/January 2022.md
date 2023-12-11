---
tags:
- "#college"
- "#os"
---
# Short answer question
## Explain the role of bootstrap program
The bootstrap program is like the *starting point for a computer*. 

It kicks off the process when you turn on the computer, helping it to find and load the main system (like Windows or macOS). 

It gets everything ready, so the computer can start working and you can use it.
## What is Throughput
Throughput refers to the *rate at which a system or device can process and deliver a certain amount of work within a specified period.* 

It measures the amount of data, tasks, or operations completed successfully per unit of time, indicating the system's efficiency or capacity in handling workloads.

> Throughput is like the speed limit on a highway—it measures how much stuff (like data or tasks) a system can handle in a specific time, showing how fast things get done or processed.

## Differentiate program and process
A program is a set of *stored instructions awaiting execution,* while a process is an *active execution of those instructions in memory.* Programs reside as files, whereas processes utilize system resources, executing tasks with allocated memory and CPU time.
## Why Deadlock occur
[[Deadlocks]] occurs when two or more processes are indefinitely waiting for resources held by each other, creating a circular dependency. 

Each process waits for a resource held by another, preventing any progression and leading to a standstill where none can proceed, causing a system deadlock.
![](https://prepinstadotcom.s3.ap-south-1.amazonaws.com/wp-content/uploads/2023/01/Deadlock-in-Operating-System-1.webp)
## What is semaphore
A semaphore is like a *traffic signal for programs.* It helps control when different parts of a program **can use shared things, ensuring that only one part uses them at a time.** 

> It prevents chaos and helps programs work together smoothly.
![](https://scaler.com/topics/images/binary-semaphores.webp)
## Define the term seek time
Seek time refers to the time taken by a hard drive's read/write head to position itself to the specific track or location where data is stored. 

It is the time the head takes to move to the correct position on the disk from its current position, typically measured in milliseconds (ms). Lower seek times indicate faster access to data and contribute to overall disk performance.
## What is Thrashing
[[Thrasing]] occurs in a computer system when the CPU spends more time swapping data between memory and the disk (paging or swapping) than executing actual tasks. 

It happens due to excessive multitasking or insufficient memory. The system becomes overwhelmed, resulting in a decrease in performance as it struggles to handle the constant swapping, leading to a slow-down or freeze in operations.
![](https://media.geeksforgeeks.org/wp-content/uploads/2-103.png)
## What is Segmentation
[[What is Segmentation|Segmentation]] is a memory management technique used by operating systems to divide a process into segments of variable sizes. 

Each segment represents a logical unit such as code, data, stack, or heap. Segments are independent and can grow or shrink dynamically. This technique allows for more flexible memory allocation and efficient handling of varying-sized data structures within a process.

> Segmentation is like dividing a big task into different parts. Each part handles specific things, like instructions or data. It helps manage memory by separating these parts, allowing for flexibility in handling different-sized tasks more easily.

## List out the major attributes of the file

1. **Name:** The file's identifier by which it's known or referenced. 
2. **Type:** Indicates the file format or its classification (e.g., text file, executable, directory).
3. **Size:** The amount of space occupied by the file in bytes or kilobytes.
4. **Location:** The physical location on the storage device where the file is stored.
5. **Permission/Protection:** Specifies who can read, write, or execute the file and what type of access they have.
6. **Creation Date:** The date and time when the file was created.
7. **Modification Date:** The date and time when the file was last modified.
8. **Owner:** The user or account that has control and authority over the file.
9. **File Extension:** The suffix at the end of a filename indicating its file type or format.
10. **Attributes/Flags:** Additional settings or characteristics associated with the file, such as whether it's hidden or read-only.

# Long Answer Question
## What are the necessary and sufficient conditions to check the deadlock?

1. **Mutual Exclusion:**
   - **Explanation:** At least one resource must be held in a manner that it cannot be simultaneously shared between multiple processes. For instance, if a process holds exclusive access to a printer or a CPU core, other processes must wait for its release.
   - **Significance:** This condition ensures that resources cannot be used by multiple processes simultaneously.

2. **Hold and Wait:**
   - **Explanation:** Processes hold allocated resources while waiting to acquire additional resources. A process that already holds some resources may request more, leading to resource contention.
   - **Significance:** It leads to resource holding and potential resource starvation for other processes waiting in line.

3. **No Preemption:**
   - **Explanation:** Resources cannot be forcibly taken away from a process that holds them. A process must voluntarily release the resources it holds.
   - **Significance:** Preemption of resources could avoid deadlock situations by forcibly taking resources from one process to satisfy another. However, this condition specifies that such preemption is not allowed.

4. **Circular Wait:**
   - **Explanation:** There exists a circular chain of two or more processes, where each process in the chain is waiting for a resource held by the next process. For example, Process A waits for a resource held by Process B, which, in turn, waits for a resource held by Process C, and so on, ultimately leading back to Process A.
   - **Significance:** This circular dependency prevents any of the processes involved from proceeding, creating a deadlock situation where none of the processes can advance.
## Explain Paging
[[Paging]] is a memory management technique used by operating systems to efficiently manage and allocate memory to processes. It involves dividing physical memory and processes into fixed-size blocks called pages.

Here's how paging works:

1. **Dividing Memory:** Physical memory (RAM) and processes are divided into fixed-size chunks called pages. Simultaneously, logical memory in processes is divided into blocks of the same size known as frames.

2. **Address Translation:** When a process accesses memory, the CPU generates logical addresses. These addresses contain a page number and an offset within the page.

3. **Page Table:** The operating system maintains a page table, mapping the logical addresses (page numbers) to physical addresses (frame numbers) in memory. Each entry in the page table stores the mapping information for a specific page.

4. **Address Mapping:** When a process requests data, the CPU translates logical addresses using the page table to determine the corresponding physical addresses in memory.

5. **Memory Access:** The data is fetched or stored at the physical memory address derived from the translation, allowing the process to access the required memory content.
![](https://scaler.com/topics/images/what-is-paging.webp)
### Benefits of Paging
- Efficient Memory Utilization: Allows for dynamic allocation of memory to processes, minimizing internal fragmentation.
- Simplified Memory Management: Facilitates easier management of memory spaces by breaking it into smaller, manageable units.
- Simplified Address Translation: Provides an efficient way to translate logical addresses to physical addresses using the page table.

## Differentiate Scan and C-Scan disk scheduling with appropriate example
### Scan (Elevator) Disk Scheduling
- **Movement:** The disk arm scans back and forth across the disk in a single direction, serving requests along the way until it reaches the end, then reverses direction.
- **Example:** Suppose the disk arm is at track 20 and has pending requests at tracks 15, 34, 2, 45, 18. It moves from track 20 to track 2, serving requests on the way, then reverses direction at track 2 and goes to track 45, serving requests again.
- **Advantage:** Reduces waiting time for requests at the expense of fairness as requests closer to the current position are serviced more frequently.

### C-Scan (Circular Scan) Disk Scheduling
- **Movement:** Similar to Scan, but the disk arm only moves in a single direction, scanning from one end to the other, then immediately moves back to the starting point without serving requests.
- **Example:** With the same requests as before, after reaching track 2, the arm moves to track 45, then immediately jumps to the opposite end, servicing requests in a circular fashion without going beyond the last track accessed.
- **Advantage:** Ensures fairness in servicing requests by moving in a circular manner without favoring any particular section of the disk.

### Differentiation
- **Movement Pattern:** Scan moves back and forth across the disk, while C-Scan moves in a circular unidirectional manner.
- **Servicing Requests:** Scan serves requests in both directions, while C-Scan focuses on unidirectional servicing without immediate reversal.
- **Disk Access Pattern:** Scan may cause uneven service times, favoring certain regions, whereas C-Scan ensures more uniform service for requests.

Both algorithms aim to reduce seek time and improve disk access efficiency but follow different movement patterns, affecting the fairness in servicing requests. Scan may have shorter waiting times for certain requests, whereas C-Scan provides more consistent access times across the disk.

## Remaining Questions
- 2
- 4
- 5