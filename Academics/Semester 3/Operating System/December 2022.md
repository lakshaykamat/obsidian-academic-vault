---
tags:
- "#os"
- "#college"
---

<iframe src="https://drive.google.com/file/d/1K7uKq31KSP-OLz3WOkQncibf3_ICEH-0/preview" width="640" height="480" allow="autoplay"></iframe>

# Table of content
## [[December 2022#Short answer question|Short answer question]]
### [[December 2022#What is Kernal|What is kernal]]
### [[December 2022#What is Overlays|What is overlays]]

# Short answer question
## What is Kernal
A kernel is the _core component_ of an operating system, managing system resources, memory, and communication between hardware and software. 

It provides essential functions for software to interact with hardware, enabling tasks such as process management, device communication, and memory allocation, crucial for overall system operation and functionality.
![](https://static.javatpoint.com/blog/images/what-is-kernel.png)
## What is Overlays
Overlays refer to a technique used in computer programming and memory management, allowing programs to ==utilize memory beyond the system's physical limitations.==

This method enables multiple modules or sections of a program to share the same memory space by loading specific sections when needed, swapping them in and out as required, optimizing memory usage in systems with limited resources like early computers.

## Differentiate between preemptive and non-preemptive scheduling.
| Aspect            | Preemptive Scheduling                                                 | Non-Preemptive Scheduling                                                   |
| ----------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| Task Interruption | Allows tasks to be interrupted and temporarily suspended.             | Does not allow tasks to be interrupted  once they start until they finish.  |
| Priority Handling | Prioritizes high-priority tasks,allowing them to execute immediately. | Executes tasks based on their arrival  order; priorities aren't considered. |
| Complexity        | Generally more complex to implement                                   | Relatively simpler to implement and manage                                  |
| Examples          | Round Robin, Priority-based Scheduling                                | First-Come-First-Served, Shortest Job Next                                  |
 

## Differentiate between contiguous and non-contiguous memory allocation methods.

| Aspect                            | Contiguous Memory Allocation                   | Non-Contiguous Memory Allocation                  |
|-----------------------------------|------------------------------------------------|---------------------------------------------------|
| Memory Allocation Structure       | Allocates memory in a continuous block         | Allocates memory in non-adjacent, scattered blocks|
| [[Fragmentation]]                     | May lead to external fragmentation             | Minimizes external fragmentation but may cause internal fragmentation            |
| Addressing                        | Simplifies memory addressing                   | Requires complex addressing due to scattered locations |
| Memory Utilization                | Efficient for certain types of data structures | May have more efficient utilization for specific situations but could be less efficient overall    |
| Examples                          | Simple and used in systems like early computers | Paging, Segmentation, and Virtual Memory systems  |

## What is Thrashing?
[[Thrasing]] occurs when a computer system ==excessively swaps data between RAM and storage== due to high multitasking demands, severely impacting performance. 

It results from _insufficient physical memory to handle running processes,_ causing the system to spend more time swapping data than executing tasks efficiently.
![](https://media.geeksforgeeks.org/wp-content/uploads/2-103.png)

## Write a difference between process and thread

| Aspect               | [[Process concept]]                                   | [[Threads]]                                      |
|----------------------|----------------------------------------------|---------------------------------------------|
| Definition           | Independent unit of execution                | Subset of a process, lightweight execution unit|
| Resource Allocation  | Owns its own memory and resources            | Shares memory and resources within a process |
| Communication        | Inter-process communication required         | Easy communication within the same process  |
| Context Switching    | More overhead due to separate address spaces | Less overhead, faster context switching     |
| Creation Overhead    | Higher overhead to create and maintain      | Lower overhead to create and manage        |
| Independence         | Relatively more independent                 | Highly dependent, part of a process context|

## What is convoy effect?
The Convoy Effect occurs in [[CPU Scheduling|First-Come-First-Served]] scheduling, where ==shorter processes are delayed behind longer ones==, reducing system efficiency. 

Short tasks get stuck waiting for lengthy processes to finish, causing increased latency and hindering overall throughput in the queue.
![](https://prepinsta.com/wp-content/uploads/2023/01/Convoy-effect.webp)


## What is Rotational latency
Rotational latency is the ==delay in accessing information on a hard drive== because the needed data might not be immediately under the reading head. 

It's like waiting for the right part of a spinning carousel to come around before you can grab something off of it. This delay affects how quickly you can get the data you need from the hard drive.

## What is the need of  [[Academics/Semester 3/Operating System/Operating System|Operating System]]

1. **Resource Management:** Manages hardware resources like CPU, memory, disk space, and peripherals, allocating them to different software programs efficiently.

2. **Provides User Interface:** Offers an interface (CLI or GUI) for users to interact with the computer, run applications, and manage files easily.

3. **Hardware Abstraction:** Hides complex hardware details, enabling software to interact with hardware using standardized methods, enhancing portability and compatibility.

4. **Process Management:** Handles running programs, multitasking, scheduling tasks, and ensuring they run without interfering with each other.

5. **Memory Management:** Controls memory allocation and deallocation, optimizing usage and preventing conflicts among various programs.

6. **File System Management:** Manages files, directories, and storage devices, organizing data efficiently and ensuring accessibility and data integrity.

## Differentiate between logical and physical address space

| Aspect                 | Logical Address Space                         | Physical Address Space                        |
|------------------------|-----------------------------------------------|----------------------------------------------|
| Definition             | Addresses used by the CPU in program execution| Actual physical addresses in the memory      |
| Visibility              | Seen by the CPU and processes                 | Directly accessed by the hardware            |
| Size                   | Can be larger than physical memory             | Represents the actual physical memory size   |
| Mapping                | Mapped to physical addresses via MMU          | Represents the real locations in memory      |
| Address Translation    | Requires translation to physical addresses   | Directly used by the hardware for memory access|


# Long Answer Question

## Q2. a) Explain different [[Early Systems|types of operating system]] with suitable applications

1. **Batch Operating System:**
   - **Explanation:** Executes jobs in batches without user interaction, common in early mainframes.
   - **Applications:** Used in payroll processing, batch report generation, and large-scale data processing where similar tasks are executed without user intervention.

2. **Multi-Programming System:**
   - **Explanation:** Allows multiple programs to run concurrently, maximizing CPU utilization.
   - **Applications:** Common in modern desktop operating systems, enabling the execution of multiple programs simultaneously for various user tasks.

3. **Multi-Processing System:**
   - **Explanation:** Uses multiple processors to perform tasks.
   - **Applications:** Found in servers, high-performance computing (HPC), and scientific research applications that require intensive computations distributed across multiple processors.

4. **Multi-Tasking Operating System:**
   - **Explanation:** Enables multiple tasks or processes to run concurrently on a single processor.
   - **Applications:** Used in personal computers and workstations to run several applications concurrently, enhancing user productivity.

5. **Time-Sharing Operating System:**
   - **Explanation:** Shares a single processor among multiple users, rapidly switching between tasks to provide the illusion of simultaneous execution.
   - **Applications:** Employed in interactive systems like servers, mainframes, or cloud environments, enabling multiple users to access the system simultaneously.

6. **Distributed Operating System:**
   - **Explanation:** Spreads computations across multiple interconnected computers.
   - **Applications:** Used in distributed computing environments, cloud computing, and peer-to-peer networks, facilitating resource sharing, fault tolerance, and scalability.

7. **Network Operating System:**
   - **Explanation:** Manages network resources like file sharing, printer access, and communication protocols.
   - **Applications:** Found in servers and network-attached storage devices to control and coordinate network operations, enabling shared access to resources.

8. **Real-Time Operating System:**
   - **Explanation:** Processes data and events with strict timing constraints.
   - **Applications:** Utilized in critical systems such as aviation, medical devices, industrial automation, and control systems that demand precise and immediate responses to stimuli or events.
## Q2. b)What is a process scheduler? State the characteristics of a good process scheduler and also explain the types of schedulers
A process scheduler is a vital component of an operating system responsible for determining the order in which processes are executed by the CPU. 

It manages the scheduling of processes and allocates CPU time to them based on specific algorithms and priorities.

### Characteristics of a good process scheduler:
1. **Efficiency:** Optimizes CPU utilization and system throughput, minimizing idle time and maximizing process execution.

2. **Fairness:** Ensures fair allocation of CPU time among processes, preventing starvation or unfairness in resource allocation.

3. **Response Time:** Minimizes the response time for interactive processes, ensuring timely user interaction.

4. **Throughput:** Maximizes the number of processes completed per unit of time, improving overall system performance.

5. **Priority Handling:** Supports prioritization mechanisms to execute high-priority tasks promptly.

### Types of schedulers:

1. **Long-Term Scheduler (Job Scheduler):**
   - Selects processes from the pool of submitted processes and loads them into memory for execution.
   - Determines which processes should be admitted to the system for processing.

2. **Short-Term Scheduler (CPU Scheduler):**
   - Determines which process from the ready queue will be executed next and allocates CPU time.
   - Executes frequently, making rapid scheduling decisions based on predefined algorithms like Round Robin, Shortest Job Next, etc.

3. **Medium-Term Scheduler:**
   - Manages the swapping of processes in and out of memory (i.e., swapping processes from disk to main memory and vice versa).
   - Helps control the degree of multiprogramming, ensuring efficient memory utilization.

## Q3. a) Write and explain deadlock characteristics.
[[Deadlocks]] is a state in a computer system where two or more processes are unable to proceed because each is waiting for the other to release a resource, resulting in a circular dependency. The characteristics of deadlock include:

1. **Mutual Exclusion:** Resources cannot be simultaneously used or shared by multiple processes. When a process holds a resource, it denies access to others.

2. **Hold and Wait:** Processes hold resources while waiting for additional resources, creating a situation where resources are allocated but remain unused due to the process waiting for others.

3. **No Preemption:** Resources cannot be forcibly taken away from a process. If a process holds resources and requests more that are currently held by another process, it must wait.

4. **Circular Wait:** A circular chain of two or more processes exists, where each process holds a resource that is requested by the next process in the chain, ultimately forming a cycle of dependencies.

Explanation:
Imagine two friends each holding a book that the other needs to complete their task. They refuse to give up their book until they get the other's book, resulting in a situation where both are waiting indefinitely, causing a deadlock.

## Q6. a) Explain all file allocation method in detail with their advantage and disadvantage
### [[File Allocation Method#Contiguous method|1. Contiguous Allocation]]
Allocates files in contiguous blocks of disk space. Each file occupies a contiguous set of blocks on the disk.
   
#### Advantages
- **Fast Sequential Access:** Because of contiguous storage, reading and writing files sequentially is efficient.
- **Simple Implementation:** Straightforward to implement and manage.
   
#### Disadvantages
- **External Fragmentation:** Wastage of space due to scattered free blocks, making it challenging to allocate larger files.
- **Fragmentation Over Time:** As files are deleted or resized, free spaces are fragmented, leading to inefficiency.

### [[Linked Allocation|2. Linked Allocation]]
Represents files as linked lists of disk blocks. Each block contains a pointer to the next block in the file.
   
#### Advantages
- **No Fragmentation:** Eliminates external fragmentation issues.
- **Variable File Size:** Allows dynamic file growth without fragmentation concerns.
   
#### Disadvantages
- **Slow Access:** Random access can be slow due to traversing linked blocks.
- **Wasteful:** Requires additional space for storing pointers in each block, which can be wasteful.

### [[Indexed Allocation|3. Indexed Allocation]]
Uses an index block for each file that contains pointers to allocated blocks.
   
#### Advantages
- **Fast Access:** Allows quick access to any part of the file using the index block.
- **No Fragmentation:** Avoids external fragmentation.
   
#### Disadvantages
- **Wastage:** May waste space in the index block for small files.
- **Overhead:** Requires extra overhead to manage and maintain the index blocks.

### Comparison:
#### Fragmentation
  - Contiguous Allocation: Prone to external fragmentation.
  - Linked Allocation: Eliminates external fragmentation.
  - Indexed Allocation: Avoids external fragmentation.

#### Access Speed
  - Contiguous Allocation: Faster sequential access.
  - Linked Allocation: Slower random access due to traversal.
  - Indexed Allocation: Quick access to any part of the file using the index block.

#### Implementation Complexity
  - Contiguous Allocation: Simple to implement.
  - Linked Allocation: Moderate complexity due to pointer management.
  - Indexed Allocation: Additional overhead due to managing index blocks.

#### File Growth
  - Contiguous Allocation: Inflexible for file growth.
  - Linked Allocation: Allows dynamic file growth.
  - Indexed Allocation: Efficient for file growth without fragmentation.

## Remains
- 3 A B
- 4 A B
- 5 A B
- 6 B
