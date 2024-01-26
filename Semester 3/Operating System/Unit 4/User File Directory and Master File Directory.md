---
tags:
- "#os"
- "#college"
---

# File Directory
- A physical disk can be broken up into multiple partitions, or mini-disks
- A file directory, also commonly referred to as a file folder or simply a directory, is a storage structure used within a file system to organize and manage files.
- It serves as a container or hierarchical structure that stores files, subdirectories, or other directories, enabling users and operating systems to categorize, locate, and manage various data efficiently.

| Feature             | User File Directory (UFD)                            | Master File Directory (MFD)                            |
|---------------------|-----------------------------------------------------|--------------------------------------------------------|
| Scope               | Pertains to individual users and their files.       | Encompasses information about all users and their files.|
| Content             | Contains details of files owned by a specific user.  | Holds metadata about various User File Directories (UFDs) and their locations.|
| Function            | Manages files for a particular user.                 | Acts as a directory for locating individual UFDs.       |
| Accessibility       | Accessible only to the respective user.             | Typically managed by the operating system and accessible by privileged users or system processes.|
| Size                | Each user has their own UFD, sized according to their files. | Generally larger and contains references to multiple UFDs.|
| Level of Detail     | Contains detailed information about files owned by a user. | Contains higher-level information about various UFDs and their locations.|
| Organization        | Organized per user, allowing user-specific file management. | Organizes pointers or information for various users' UFDs, allowing system-wide file organization.|

![](https://media.geeksforgeeks.org/wp-content/uploads/20230620202955/d1.png)