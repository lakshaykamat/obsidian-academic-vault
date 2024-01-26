---
tags:
- "#os"
- "#college"
---

# Disk Scheduling Algorithms
<iframe src="https://drive.google.com/file/d/1poVoOqqxr9Tk1xRP8qmXHnx56XZTuVqy/preview" width="740" height="580" allow="autoplay"></iframe>
## First Come First Serve
- Simple and straigtforwad
- Request served in the order which they arrive
- Process the I/O requests one by one from head of the queue to the end without any consideration for the location of the data on the disk
## Advantages of FCFS
1. Simple implementation
2. Fairness
## Disadvantages of FCFS
1. Possibility of starvation
2. High avg. seek time
3. No optimisation
## Example

A Disk contains 200 tracks (0-199) request queue contains track no. 82, 170, 43, 140, 24, 16, head = 50
Calculate total no. of tracks movement by R/W head
![Image](https://i.postimg.cc/BvGcdJNv/Screenshot-from-2023-11-16-00-04-58.png)


5. SSTF
6. SCAN
7. LOOK
8. C SCAN
9. C LOOK

	Seek Time:  Time taken to reach up to desired track
	Goal: To minimise the seek time
