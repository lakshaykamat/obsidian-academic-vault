A deadlock is a state in which two or more processes are unable to proceed because each is waiting for a resource held by the other. This situation halts progress indefinitely, and the processes remain deadlocked, unable to continue execution.
![](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2015/06/deadlock.png)

## Key Characteristics of Deadlock:
1. **Resource Conflict:** Processes compete for resources (like memory, devices, or files) held by other processes.
2. **Mutual Exclusion:** Resources involved in the deadlock can only be used by one process at a time.
3. **Hold and Wait:** Processes hold allocated resources while waiting for additional resources that are held by other waiting processes.
4. **No Preemption:** Resources cannot be forcibly taken away from processes; they must be voluntarily released.
5. **Circular Wait:** A cycle exists among a set of processes where each process holds a resource that the next process in the cycle is waiting for.
## Method for handling Deadlock
#### 1. Deadlock Prevention
- **Addressing Mutual Exclusion:** Ensure resources that don’t require exclusive access aren’t subjected to mutual exclusion.
- **Preventing Hold and Wait:** Require processes to request all necessary resources at the beginning or release held resources if unable to obtain all.
- **No Preemption:** Allow resources to be preempted from processes if necessary, ensuring they're not held indefinitely.
- **Circular Wait Avoidance:** Impose a hierarchy or numerical ordering of resource allocation to prevent circular waits.
### 2. Deadlock Avoidance
- **Resource Allocation Graph:** Use algorithms (like Banker's Algorithm) to predict whether resource allocation could lead to a deadlock. Allocate resources only if the system remains in a safe state.
- **Dynamic Resource Request Handling:** Allow processes to request resources dynamically while ensuring that granting the request won't lead to a deadlock.
### 3. Deadlock Detection and Recovery
- **Deadlock Detection:** Implement algorithms to identify deadlocks by analyzing the resource allocation graph or using other detection methods.
- **Deadlock Recovery:** Upon detection, either abort processes, roll back their progress, or preempt resources to break the deadlock.
### 4. Ostrich Method
- Merely ignore the deadlock occurring in your system.
- The deadlock isn't frequent; it has occurred for years. However, choosing not to create a new algorithm to prevent it results in the daily consumption of significant system resources.