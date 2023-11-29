---
tags:
- "#os"
- "#college"
---
# Process Control Block
Manage and store information about each individual process in a computer system. 

It contains essential details necessary for the operating system to manage the processes effectively throughout their life cycle.


- **Process Identification (PID):** Uniquely identifies each process in the system.
- **Processor State:** Saves CPU registers, program counter, and process status.
- **Process Scheduling:** Holds priority, queue pointers, and scheduling-related data.
- **Memory Management:** Manages memory usage, limits, page tables, and segment tables.
- **I/O Status:** Stores I/O operation details, open files, and device allocations.
- **Process Control:** Manages ownership, permissions, accounting data, etc.
- **Parent Process Pointer:** References the process(es) that initiated it.
- **Additional Information:** Includes accounting, limits, signal handling, etc., OS-dependent.