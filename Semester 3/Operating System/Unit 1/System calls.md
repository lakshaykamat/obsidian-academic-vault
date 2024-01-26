---
tags:
- "#os"
- "#college"
---
# System calls
- **Interface for Interaction:** System calls act as an interface between user-level programs and the operating system's kernel.
- **Requesting Services:** They allow user programs to request OS services like file operations, process management, memory handling, and I/O tasks.
- **Privileged Operations:** Enable user programs to execute privileged instructions or operations that require higher-level access managed by the OS.
- **Controlled Access:** Manage the transition between user mode and kernel mode, ensuring controlled access to system resources.
- **Examples:** Common system calls include file operations like `open()`, `read()`, `write()`, process-related calls like `fork()`, `exec()`, memory management calls like `malloc()`, `free()`, etc.
- **Functionality Execution:** User programs invoke system calls to perform tasks that need OS intervention, transitioning from user mode to kernel mode for execution.
- **Boundary Management:** System calls define the boundary between user space and kernel space, maintaining security and controlled access to system resources.