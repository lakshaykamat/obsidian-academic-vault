File allocation methods are techniques used by file systems to manage how storage space is allocated to files on a storage device like a hard disk. These methods determine how files are stored, organized, and retrieved within the file system.
# Contiguous method

In a contiguous allocation method, files are stored in a contiguous manner, meaning the entire file occupies a single contiguous block of storage space on the disk. Here's how it works:
![Contiguous method](https://cdn1.byjus.com/wp-content/uploads/2022/08/contiguous-memory-allocation-in-operating-system.png)

## Advantages
1. Simple and straightforward allocation method
2. Efficient for sequential access as data blocks are adjacent
3. Reduced overhead in addressing and accessing files
## Disadvantages
1. Fragmentation occurs over time when files are deleted and new files are added, leading to free spaces scattered across the disk.
2. Difficulties arise in finding contiguous free space for large files, leading to external fragmentation.
3. Files cannot grow beyond their initial allocated size, which might lead to wasted space or file reorganisation.
# Non contiguous method
Non-contiguous allocation methods store files in a fragmented manner, where different parts of a file can be located in various non-contiguous blocks or sectors across the storage device. Common non-contiguous allocation methods include:
1. [[Linked Allocation]]
2. [[Indexed Allocation]]
## Advantages 
1. Efficient utilization of free space, reducing internal fragmentation.
2. Easier to allocate space for files, especially when continuous space isn't available.
3. Supports file expansion without the need for contiguous space.
## Disadvantages
1. Increased overhead in maintaining and accessing files due to scattered blocks.
2. Fragmentation can lead to slower access times as data blocks are not contiguous.
3. Additional overhead for managing pointers or indexes for scattered blocks of a file.
