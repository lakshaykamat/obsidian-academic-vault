Indexed allocation is a file allocation method used by file systems to manage file storage on a disk. In this method, a separate index block or table is utilized to keep track of file blocks' addresses or locations within the storage device.

![Indexed allocation](https://files.codingninjas.in/article_images/indexed-file-allocation-0-1649937783.webp)
### Characteristics of Indexed Allocation:
1. **Index Block:**
	- An index block or table is maintained separately from the actual data blocks on the disk.
2. **Pointers to Blocks:**
	- The index block contains pointers or addresses that directly point to the data blocks where the file's content is stored.
3. **One-to-One Mapping:**
	- Each file has its own index block containing pointers to its data blocks.
4. **Direct Block Access:**
	- Allows direct access to file blocks using the index without needing to traverse linked structures.
### Advantages of Indexed Allocation:
1. **Fast Access:**
	- Enables faster access to file blocks as the index provides direct block addressing, reducing access time.
2. **Efficient for Large Files:**
	- Well-suited for large files where direct block access is beneficial for performance.
3. **No External Fragmentation:**
	- Eliminates external fragmentation as files are stored in contiguous blocks, and the index manages their locations.
4. **Supports File Growth:**
	- Supports file growth without the need for contiguous allocation, as new blocks can be added and indexed.

### Disadvantages of Indexed Allocation:
1. **Overhead of Index Blocks:**
	- Requires additional space for maintaining index blocks, which can consume storage space.
2. **Limited Scalability:**
	- Larger indices may pose scalability challenges as the index size grows with file system size.
3. **Complexity in Management:**
	- Managing and updating index structures can be complex, especially with large files or frequent file modifications.