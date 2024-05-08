# Unit 1

# Data

Data is information that has been collected, processed, and stored for a specific purpose. It can be in the form of numbers, text, images, audio, or any other type of digital representation. Data is used to support decision-making, research, and other activities by providing a basis for knowledge and understanding. In a digital context, data is stored in computers and databases and can be analyzed, manipulated, and communicated through software and hardware tools.

# Information

Information is processed data that has meaning and is useful to individuals or organizations. It is a collection of data that has been organized, analyzed, and presented in a way that makes it meaningful and valuable. Information can take many forms, such as text, numbers, images, or audio, and it can be used to make decisions, solve problems, and support various other activities. In the digital age, information is widely available and easily accessible through the internet and other digital technologies.

| DATA | INFORMATION |
| --- | --- |
| Data are the variables that help to develop ideas/conclusions. | Information is meaningful data. |
| Data are text and numerical values. | Information is a refined form of actual data. |
| Data doesn’t rely on Information. | While Information relies on Data. |
| Bits and Bytes are the measuring units of data. | Information is measured in meaningful units like time, quantity, etc. |
| Data can be easily structured as the following: 1. Tabular data 2. Graph 3. Data tree | Information can also be structured as the following: 1. Language 2. Ideas 3. Thoughts |
| Data does not have any specific purpose | Information carries a meaning that has been assigned by interpreting data. |
| It is low-level knowledge. | It is the second level of knowledge. |
| Data does not directly help in decision-making. | Information directly helps in decision-making. |
| Data is a collection of facts, which itself has no meaning. | Information puts those facts into context. |
| An example of data in student test scores. | An example of information is the average score of the class that is derived from given data. |

![Untitled](Unit%201%20542e3ab4c406497dbbd5314d486342ee/Untitled.png)

# DBMS

DBMS stands for Database Management System. It is a software application that provides users with the ability to interact with a database, manage and manipulate data stored in a database, and control access to the data.

A DBMS acts as an interface between the database and the user, allowing users to retrieve and modify data without having to write complex SQL commands. Some common examples of DBMS include MySQL, Oracle, Microsoft SQL Server, and PostgreSQL.

# File System vs DBMS

A file system and a database are both used for storing and organizing data, but they have some key differences in terms of their functionality and use cases.

A file system is a way of organizing and storing files and directories on a computer's hard drive or other storage devices. It is essentially a hierarchical structure of files and directories, which can be accessed and manipulated using file operations like reading, writing, and deleting files. File systems are typically used for managing documents, images, videos, and other files that do not require complex data relationships or query operations.

On the other hand, a database is a software system designed to manage and store large amounts of structured data. It is built to handle complex data relationships and to provide efficient methods for querying and retrieving data. Databases allow users to define data structures and relationships between tables, and they offer a range of features for data manipulation, such as sorting, filtering, and joining data from multiple tables.

While a file system is a simple and efficient way to store and manage files, it is not suitable for managing large amounts of structured data or complex data relationships. Databases are designed specifically for these types of tasks, and they provide more robust data management features, such as transaction support, data indexing, and concurrency control.

In summary, while both file systems and databases are used for data storage and organization, databases are better suited for managing complex data structures and relationships, while file systems are more appropriate for managing simple files and documents.

| Basis | File System | DBMS |
| --- | --- | --- |
| Structure | The file system is software that manages and organizes the files in a storage medium within a computer. | DBMS is software for managing the database. |
| Data Redundancy | Redundant data can be present in a file system. | In DBMS there is no redundant data. |
| Backup and Recovery | It doesn’t provide backup and recovery of data if it is lost. | It provides backup and recovery of data even if it is lost. |
| Query processing | There is no efficient query processing in the file system. | Efficient query processing is there in DBMS. |
| Consistency | There is fewer data consistency in the file system. | There is more data consistency because of the process of normalization. |
| Complexity | It is less complex as compared to DBMS. | It has more complexity in handling as compared to the file system. |
| Security Constraints | File systems provide less security in comparison to DBMS. | DBMS has more security mechanisms as compared to file systems. |
| Cost | It is less expensive than DBMS. | It has a comparatively higher cost than a file system. |
| Data Independence | There is no data independence. | In DBMS data independence exists. |
| User Access | Only one user can access data at a time. | Multiple users can access data at a time. |
| Meaning | The user has to write procedures for managing databases | The user is not required to write procedures. |
| Sharing | Data is distributed in many files. So, not easy to share data | Due to its centralized nature sharing is easy |
| Data Abstraction | It gives details of storage and representation of data | It hides the internal details of the Database |
| Integrity Constraints | Integrity Constraints are difficult to implement | Integrity constraints are easy to implement |
| Example | Cobol, C++ | Oracle, SQL Server |

![Untitled](Unit%201%20542e3ab4c406497dbbd5314d486342ee/Untitled%201.png)

# Components

1. **Data:** This is the information that is stored in the database system. It can be in various formats such as text, numbers, images, or videos.
2. **Hardware:** The hardware includes the physical components of the system, such as the computer, storage devices, and network equipment, which are used to store and access data.
3. **Software:** The software component of a database system includes the database management system (DBMS) and the application programs used to access and manipulate data.
4. **Users:** These are the people who use the database system to access data, run queries, and perform other operations on the data.
5. **Procedures:** Procedures refer to the rules and guidelines that govern how data is stored, accessed, and manipulated in the database system.
6. **Database schema:** The schema defines the structure of the database, including the tables, fields, relationships, and constraints.
7. **Security:** Security mechanisms are used to protect the data from unauthorized access or modification. This includes user authentication, access controls, and encryption.
8. **Backup and recovery:** Backup and recovery procedures ensure that data is protected against loss or corruption, and can be recovered in the event of a system failure or other disaster.

![Untitled](Unit%201%20542e3ab4c406497dbbd5314d486342ee/Untitled%202.png)

## Advantages

1. **Improved data sharing:** A database system enables multiple users to access the same data at the same time. This means that different departments or groups within an organization can share data and collaborate more effectively.
2. **Data consistency:** A database system ensures that data is consistent and up-to-date across all applications that access it. This eliminates the possibility of data inconsistencies or errors that can occur when different users update data separately.
3. **Improved data security:** A database system provides security mechanisms to protect the data from unauthorized access or modification. This includes user authentication, access controls, and encryption.
4. **Efficient data retrieval and manipulation:** A database system can retrieve and manipulate large amounts of data quickly and efficiently. This is achieved through indexing, caching, and other performance optimization techniques.
5. **Scalability:** A database system can be scaled up or down as needed to accommodate changing data volumes or usage patterns.

## Disadvantages

1. **Cost:** A database system can be expensive to set up and maintain, particularly for smaller organizations. The cost of licensing, hardware and ongoing maintenance can be a significant investment.
2. **Complexity:** A database system can be complex to design, implement, and maintain. This requires specialized knowledge and expertise that may not be readily available in-house.
3. **Performance issues:** A poorly designed database or inefficient queries can lead to slow performance, particularly when dealing with large volumes of data.
4. **Single point of failure:** A database system can be a single point of failure if it is not adequately backed up and protected against system failures or disasters.
5. **Data independence:** In a database system, data is stored independently of the applications that use it. This can make it difficult to update or modify the data structure without impacting existing applications.

Overall, while a database system can provide significant benefits in terms of data sharing, consistency, security, and scalability, it also comes with some challenges and considerations around cost, complexity, performance, and data independence.

# Languages

DBMS (Database Management System) languages are programming languages that are used to interact with a database management system. There are several types of DBMS languages:

1. **Data Definition Language (DDL):** DDL is used to define the structure and organization of a database, including tables, fields, and relationships. DDL commands include CREATE, ALTER, and DROP.
2. **Data Manipulation Language (DML):** DML is used to add, modify, or delete data within a database. DML commands include INSERT, UPDATE, and DELETE.
3. **Query Language (QL):** QL is used to retrieve data from a database. SQL (Structured Query Language) is the most common type of QL used with relational databases.
4. **Procedural Language (PL):** PL is used to define procedures or functions that can be executed within a DBMS environment. Examples of PL include PL/SQL (Oracle), T-SQL (Microsoft SQL Server), and PL/pgSQL (PostgreSQL).
5. **Object-Oriented Language (OOL):** OOL is used to interact with object-oriented databases, which store data as objects rather than tables. Examples of OOL include Java and C#.

The specific language used with a DBMS will depend on the type of DBMS being used, as well as the specific tasks being performed within the system. Many DBMS systems support multiple languages, allowing users to choose the one that best suits their needs and expertise.