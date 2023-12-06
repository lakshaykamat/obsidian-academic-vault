---
tags:
- "#os"
- "#college"
---
# Threads
- **Smallest Execution Unit:** Threads operate independently within a process, executing instructions.
- **Reside in Processes:** Multiple threads share the same memory and resources within a process.
- **Cooperative Work:** Threads collaborate within a process, enhancing task efficiency.
- **Concurrent Execution:** Threads allow independent simultaneous execution of instructions within a process.

### Characteristics of Threads:
1. - **Lightweight:** Threads are resource-efficient compared to processes.
- **Resource Sharing:** Threads share a process's resources.
- **Concurrent Execution:** Allows simultaneous task execution within a process.
- **Independence:** Threads run independently with their own execution paths and variables.

### Types of Threads:
1. **User-level Threads:** Managed by the user-level thread library and not directly supported by the kernel. The kernel views each process as a single-threaded entity.
2. **Kernel-level Threads:** Supported and managed directly by the operating system's kernel. The kernel can manage multiple threads within a process independently.

### Benefits of Threads
- **Enhanced Responsiveness:** Threads maintain application responsiveness via concurrent task execution.
- **Efficient Resource Sharing:** Threads within a process easily share resources, boosting efficiency.
- **Simplified Task Handling:** Threads streamline complex tasks by concurrent execution, aiding manageability.

### Thread States
- **Running:** Currently executing on the CPU.
- **Ready:** Prepared to run but waiting for CPU time.
- **Blocked/Waiting:** Waiting for a particular event or resource.

### Thread Synchronization
- **Mutexes:** Guarantee exclusive access to shared resources for threads.
- **Semaphores:** Regulate resource access, permitting or denying thread execution.
- **Critical Sections:** Code segments accessed by only one thread to prevent conflicts.