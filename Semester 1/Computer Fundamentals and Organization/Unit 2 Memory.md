# Unit 2 Memory

# Flynn Classification of Computer

M.J. Flynn proposed a classification for the organization of a 
computer system by the number of instructions and data items that are 
manipulated simultaneously.

The sequence of instructions read from memory constitutes an **instruction stream**.

The operations performed on the data in the processor constitute a **data stream**.

<aside>
🖊️ Note: The term 'Stream' refers to the flow of instructions or data.

</aside>

## Single Instruction Stream Single Data Stream (SISD)

SISD stands for "Single Instruction, Single Data." It is a type of computer architecture in which a single processor can execute one instruction on one piece of data at a time. This contrasts with other types of computer architectures, such as SIMD (Single Instruction, Multiple Data) and MIMD (Multiple Instruction, Multiple Data), in which a single processor or multiple processors can execute multiple instructions or multiple pieces of data simultaneously. SISD is typically found in traditional single-core, single-threaded processors.

![https://media.geeksforgeeks.org/wp-content/uploads/sisd.png](https://media.geeksforgeeks.org/wp-content/uploads/sisd.png)

## Single Instruction Multiple Data Stream

SIMD stands for "Single Instruction, Multiple Data." It is a type of computer architecture in which a single processor can execute the same instruction on multiple pieces of data simultaneously. This is done by using a single instruction to operate on multiple data elements at the same time, using a technique called vector processing. This allows for a significant increase in performance, particularly in tasks such as image and video processing, where large amounts of data need to be processed in parallel. SIMD instructions are supported in modern CPUs, and also in specialized processors such as GPUs (graphics processing units) and DSPs (digital signal processors)

![https://media.geeksforgeeks.org/wp-content/uploads/simd.png](https://media.geeksforgeeks.org/wp-content/uploads/simd.png)

## Multiple Instruction Single Data

MISD stands for "Multiple Instruction, Single Data." It is a type of computer architecture in which multiple processors execute different instructions on the same piece of data. This is different from SISD (Single Instruction, Single Data) and SIMD (Single Instruction, Multiple Data) architectures, where a single processor executes instructions on one or multiple pieces of data. MISD architecture is not commonly used in modern computer systems, as it does not provide any significant performance benefits over other architectures such as SISD and SIMD. It is mainly used for specific application such as fault-tolerance, where multiple processors are used to perform the same operation on the same data, and the results are compared to detect errors.

![https://media.geeksforgeeks.org/wp-content/uploads/misd.png](https://media.geeksforgeeks.org/wp-content/uploads/misd.png)

## Multiple Instruction Multiple Data

MIMD stands for "Multiple Instruction, Multiple Data." It is a type of computer architecture in which multiple processors execute different instructions on different pieces of data simultaneously. This allows for a significant increase in performance, as the processors can work on different tasks in parallel. MIMD systems can be found in a wide range of computing environments, from supercomputers and parallel computers to multicore processors in modern PCs and mobile devices. MIMD systems can also be classified into two categories: shared memory and distributed memory. In shared memory systems, all processors share a common memory space, while in distributed memory systems, each processor has its own local memory.

![https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/MIMD.svg/1200px-MIMD.svg.png](https://upload.wikimedia.org/wikipedia/commons/thumb/c/c6/MIMD.svg/1200px-MIMD.svg.png)

# Primary Memory

Primary memory, also known as main memory or RAM (Random Access Memory), is a type of computer memory that is directly accessible by the processor. 

It is used to store data and instructions that the processor is currently executing. Primary memory is typically composed of DRAM (Dynamic Random Access Memory) or SRAM (Static Random Access Memory) chips, and is much faster to access than secondary storage, such as a hard drive or SSD. 

The amount of primary memory in a computer is a key factor in determining its performance, as it limits the amount of data the processor can work with at any given time. When the primary memory is full, the computer starts to use a portion of the hard drive as virtual memory, which is slower than primary memory.

### RAM

RAM stands for Random Access Memory. It is a type of primary memory in a computer that is directly accessible by the processor. RAM is used to store data and instructions that the processor is currently executing, it is volatile memory, meaning that the data is lost when the computer is powered off. 

RAM is typically composed of DRAM (Dynamic Random Access Memory) or SRAM (Static Random Access Memory) chips. The more RAM a computer has, the more data the processor can work with at any given time, which can lead to better performance. When the primary memory is full, the computer starts to use a portion of the hard drive as virtual memory, which is slower than RAM.

- **DRAM (Dynamic Random Access Memory):** This is the most common type of RAM and is used in most personal computers. It stores data in a dynamic fashion, meaning that it constantly refreshes the stored data to prevent it from being lost.
- **SRAM (Static Random Access Memory):** This type of RAM is faster and more expensive than DRAM. It stores data in a static fashion, meaning that it doesn't need to be constantly refreshed like DRAM. It is used in applications that require high-speed data access, such as cache memory.

# Secondary Memory

Secondary memory, also known as external memory or non-volatile storage, is a type of computer memory that is not directly accessible by the processor. 

It is used to store data and instructions that are not currently in use, but can be retrieved when needed. Secondary memory is typically composed of storage devices such as hard drives (HDD) or solid-state drives (SSD) and it is slower to access than primary memory (RAM). 

The data stored in secondary memory remains even if the computer is powered off, that is why it is called non-volatile. The capacity of secondary memory is usually much larger than primary memory and it is used to store files, programs, and the operating system itself.

# Memory hierarchy

The memory hierarchy is the organization of different types of memory in a computer system based on their speed and capacity. It is arranged in a hierarchy from the fastest, smallest and most expensive memory to the slowest, largest and least expensive memory. This hierarchy is used to optimize the performance of the computer system by ensuring that the most frequently used data is stored in the fastest memory, while less frequently used data is stored in slower, larger and less expensive memory. The different levels of the memory hierarchy include:

1. **Register:** These are small, fast memory locations built into the processor. They are used to store data that the processor is currently working on.
2. **Cache memory:** This is a small, fast memory located on or near the processor that stores frequently used data and instructions.
3. **Primary memory (RAM):** This is the main memory in a computer that stores data and instructions that the processor is currently executing. It is faster than secondary memory, but it is also more expensive and has limited capacity.
4. **Secondary memory:** This is non-volatile storage, such as hard drives and solid-state drives, that stores data and instructions that are not currently in use. It is slower than primary memory and has a much larger capacity but also less expensive.
5. **Tertiary memory:** These are external storage devices such as magnetic tape, CD-ROM, and DVD-ROM that are used for long-term storage. They are slower and have even larger capacity than secondary memory.

The memory hierarchy ensures that the data that the processor needs is quickly and easily accessible, while less frequently used data is stored in slower, larger and less expensive memory.

![https://media.geeksforgeeks.org/wp-content/uploads/Untitled-drawing-4-4.png](https://media.geeksforgeeks.org/wp-content/uploads/Untitled-drawing-4-4.png)

## Needs

The need for a memory hierarchy arises from the fact that different types of memory have different characteristics in terms of speed, capacity, and cost. The main goal of the memory hierarchy is to optimize the performance of the computer system by making sure that the most frequently used data is stored in the fastest and most expensive memory, while less frequently used data is stored in slower and less expensive memory.

1. Speed: Memory devices have different access times, the faster the memory, the faster the processor can access the data. Having a memory hierarchy allows the processor to access the data it needs quickly, improving overall performance.
2. Capacity: Different types of memory have different capacities, the more memory a computer has the more data the processor can work with. By using a memory hierarchy, the computer can store more data in total than if it only used one type of memory.
3. Cost: Different types of memory have different costs per unit of storage, the more expensive the memory the less storage you can afford. By using a memory hierarchy, the computer can store more data overall by using less expensive memory for less frequently used data.
4. Energy efficiency: Memory hierarchy also helps to reduce power consumption, by using faster and more expensive memory for critical tasks and slower memory for less critical tasks.

Overall, the memory hierarchy is an important aspect of computer system design, it allows the computer to store more data overall and improve performance by making sure that the most frequently used data is stored in the fastest and most expensive memory.