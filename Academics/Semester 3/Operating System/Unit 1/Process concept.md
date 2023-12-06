---
tags:
- "#os"
- "#college"
---
# Process concept
- Instance of a program that is currently being executed by a CPU
- It needs various resources such as memory, registers, and open files needed for its execution

# Characteristics
- **Independence:** Processes operate autonomously, isolated from one another in their own memory space.
- **State Information:** Processes shift between running, ready, waiting, and terminated states based on their execution status.
- **PCB:** The OS manages each process via the PCB, storing critical information like state, program counter, CPU registers.
## Types of Processes
1. **Single-threaded Process:** Executes a single sequence of instructions at a time.
2. **Multi-threaded Process:** Contains multiple threads of execution within the same address space, enabling parallelism and sharing of resources.
## Process States:
- **New:** The process is being created.
- **Ready:** The process is prepared to execute but waiting for CPU time.
- **Running:** The process is currently being executed by the CPU.
- **Waiting:** The process is waiting for an event such as I/O completion.
- **Terminated:** The process has completed its execution.
![](https://notesformsc.org/wp-content/uploads/2017/02/Process-State-Diagram.jpg)
## Importance of Processes:
- **Resource Management:** Processes allow for efficient allocation and management of system resources.
- **Multitasking:** They enable multitasking, allowing multiple programs to run concurrently.
- **Isolation:** Processes ensure that an error or issue in one process does not affect others, contributing to system stability.