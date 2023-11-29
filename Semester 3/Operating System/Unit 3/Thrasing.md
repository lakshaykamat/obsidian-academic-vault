---
tags:
- "#os"
- "#college"
---
# Thrashing
- scenario where excessive paging or swapping of memory occurs, causing a severe decline in system performance.
- occurs when system is overly busy, and the demand for memory exceeds the physical RAM capacity.
![](https://media.geeksforgeeks.org/wp-content/uploads/2-103.png)
## Key Characteristics
1. **High Disk Activity:** Intensive swapping of pages or segments between RAM and the disk.
2. **Low CPU Utilization:** The CPU spends most of its time swapping rather than executing tasks.
3. **Significant Delays:** Severe slowdown in system responsiveness due to excessive swapping.
4. **Increased Overhead:** More time spent in managing memory instead of executing processes.
## Causes
- **Insufficient Physical Memory:** Inadequate RAM compared to the memory requirements of running processes.
- **Overloading:** Running too many processes simultaneously, exhausting available memory resources.
- **Inefficient Memory Management:** Poor paging or swapping algorithms leading to frequent and unnecessary data transfers.

## Effects
- **Decreased Performance:** Sluggish system response and overall slowdown in task execution.
- **Unresponsiveness:** Applications or processes may become unresponsive due to excessive swapping.
- **Reduced Throughput:** System efficiency decreases as more time is spent on swapping instead of actual processing.
## Resolution:
- **Add More RAM:** Increasing physical memory to meet the demands of running processes.
- **Optimize Memory Management:** Improve paging or swapping algorithms to reduce unnecessary data transfers.
- **Prioritize Processes:** Efficiently manage and prioritize tasks to avoid overloading the system.