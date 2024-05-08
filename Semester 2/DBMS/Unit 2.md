# Unit 2

# Three Levels of Architecture

In a database management system (DBMS), there are generally three levels of architecture:

1. **External Level or View Level:** This level deals with the user interface and provides a way for users to interact with the database. It defines the way users see and accesses the data. The external level is concerned with the user's view of the database and may involve the creation of multiple user views of the same data.
2. **Conceptual Level or Logical Level:** This level represents the overall logical structure of the entire database and deals with how the data is organized and how the relationships between the data are defined. It involves the creation of an abstract representation of the entire database that is independent of any specific DBMS or hardware platform.
3. **Internal Level or Physical Level:** This level deals with the physical storage and access methods used to store the data. It defines how the data is stored on disk, how indexes are created and managed, and how data is retrieved from the disk. The internal level is concerned with the physical implementation of the database and is dependent on the specific hardware and software used.

![https://static.javatpoint.com/dbms/images/dbms-three-schema-architecture.png](https://static.javatpoint.com/dbms/images/dbms-three-schema-architecture.png)

# Data Independence

Data independence refers to the ability to change the data storage structure or data access methods without affecting the application programs that use the data. In other words, data independence allows changes to be made to the underlying database structure without impacting the functionality of the applications that access the data.

There are two types of data independence:

1. **Physical data independence:** Physical data independence refers to the ability to change the physical storage structure of the data without affecting the application programs. For example, a change in the storage mechanism or the location of the data files should not impact the way the application accesses the data.
2. **Logical data independence**: Logical data independence refers to the ability to change the logical structure of the data without affecting the application programs. For example, changes to the tables or relationships in the database schema should not affect the way the application accesses the data.

Data independence is important because it allows for greater flexibility in managing and maintaining a database. By separating the application programs from the underlying database structure, changes can be made to the database without requiring changes to be made to the application programs. This reduces the cost and effort required to maintain the database and allows for more efficient database management over time.

![https://static.javatpoint.com/dbms/images/dbms-data-independence.png](https://static.javatpoint.com/dbms/images/dbms-data-independence.png)

# Schema

A database schema is a logical and conceptual design that defines the structure and organization of a database. It describes the data types, relationships, constraints, and other attributes of the data that is stored in the database.

A database schema can be divided into multiple levels, including:

1. **Physical schema:** This level defines how the data is physically stored in the database. It includes details such as file organization, disk storage structure, and indexing techniques.
2. **Logical schema:** This level defines the overall logical structure of the database. It includes the tables, columns, and relationships between them.
3. **External schema:** This level defines the individual views of the data that are presented to the end users. It includes the specific attributes and data that are visible to a particular user or application.

A database schema is important because it provides a blueprint for designing, implementing, and maintaining a database. It helps to ensure that the data is structured in a consistent and organized way, which makes it easier to access and manipulate the data as needed. By using a schema, developers and database administrators can ensure that the data is accurate, consistent, and easily maintainable over time.

![https://static.javatpoint.com/blog/images/database-schema2.png](https://static.javatpoint.com/blog/images/database-schema2.png)

# Mapping

Mapping, in the context of a database, refers to the process of connecting or associating data elements between two different schemas. A mapping defines the relationship between the data elements in two different schemas so that data can be transferred between them.

For example, if an organization has two different databases, one for customer information and the other for order information, a mapping would be required to transfer data between the two databases. The mapping would specify how the data in the customer database relates to the data in the order database, and how the data should be transferred from one database to the other.

There are different types of mapping that can be used in a database, including:

1. **Data mapping:** This type of mapping defines how data is transferred from one schema to another, including the structure and format of the data.
2. **Process mapping:** This type of mapping defines how business processes are connected or integrated between two different schemas, such as a CRM system and a marketing automation system.
3. **Transformation mapping:** This type of mapping defines how data is transformed or modified during the transfer process, such as converting data types or applying business rules to the data.

Overall, mapping is a critical component of database integration and helps to ensure that data is accurately and efficiently transferred between different systems or schemas.

![https://d1zx6djv3kb1v7.cloudfront.net/wp-content/media/2021/07/mapping-.png](https://d1zx6djv3kb1v7.cloudfront.net/wp-content/media/2021/07/mapping-.png)

# Instances

Instances are the collection of information stored at a particular moment. The instances can be changed by certain CRUD operations as the addition, or deletion of data. It may be noted that any search query will not make any kind of changes in the instances.

In the context of databases, an instance refers to a specific occurrence or snapshot of the data stored in a database at a particular moment in time. An instance represents the actual data that is stored in the database, as opposed to the database schema, which defines the structure and organization of the data.

An instance can include data for one or more tables in the database, and can be updated or modified as new data is added to the database or existing data is changed. For example, if a database contains information about employees, an instance of the database would include the current set of data representing the employees and their information at a particular point in time.

Instances are important in database management because they represent the actual data that is used by applications and users. They allow for real-time access to the data and enable changes to be made to the data as needed. Additionally, instances can be used to create backups or snapshots of the data, which can be used for disaster recovery, auditing, or other purposes.

| Schema | Instance |
| --- | --- |
| It is the overall description of the database. | It is the collection of information stored in a database at a particular moment. |
| Schema is same for whole database. | Data in instances can be changed using addition, deletion, updation. |
| Does not change Frequently. | Changes Frequently. |
| Defines the basic structure of the database i.e how the data will be stored in the database. | It is the set of Information stored at a particular time. |

# CRUD

Curd is not a term commonly used in DBMS (Database Management Systems). However, there is a similar term called CRUD, which stands for Create, Read, Update, and Delete.

CRUD represents the four basic operations that can be performed on data stored in a database. These operations are:

1. Create: Adding new data to the database.
2. Read: Retrieving data from the database.
3. Update: Modifying existing data in the database.
4. Delete: Removing data from the database.

These operations are fundamental to any database application, and most database management systems provide APIs and interfaces to perform these operations on data.

![Untitled](Unit%202%2055ac69a0def24b82bba82c04528735e2/Untitled.png)

# Types of Database

## 1. Relational Databases (SQL)

A relational database is a type of database that organizes data into one or more tables, with each table consisting of a set of rows and columns. The relationships between the data are established using keys, which link the data stored in one table with the data stored in another table. 

This allows for efficient querying and retrieval of data, as well as easy updating and maintenance of data. Relational databases are widely used and are based on the relational model, which was first introduced by E.F. Codd in 1970. Some popular examples of relational databases include MySQL, Oracle, Microsoft SQL Server, and PostgreSQL.

## 2. Non-Relational (NO SQL)

A non-relational database, also known as NoSQL, is a type of database that does not use the traditional, relational model for storing data. Instead, NoSQL databases store data in a variety of ways, including document collections, key-value pairs, and graph databases. These databases are designed to handle large amounts of unstructured or semi-structured data, and they are often used in big data and cloud computing applications. Some popular examples of NoSQL databases include MongoDB, Cassandra, Couchbase, and Amazon DynamoDB.

![Untitled](Unit%202%2055ac69a0def24b82bba82c04528735e2/Untitled%201.png)

## Query

A query is a request for information from a database. It is used to retrieve data from a database based on specific criteria. Queries are usually written in Structured Query Language (SQL) and are used to select, insert, update, or delete data in a database. A query can be as simple as retrieving a single record or as complex as aggregating data from multiple tables and generating summaries and reports. Queries are an essential tool for working with databases and allow users to easily retrieve and manipulate data stored in a database.

# Table and Keys

## Types of Keys

1. **Super Key** → A super key is a set of one or more than one keys that can be used to identify a record uniquely in a table. **Example:** Primary key, Unique key, and Alternate key are a subset of Super Keys.
2. **Candidate key** → A Candidate Key is a set of one or more fields/columns that can identify a record uniquely in a table. There can be multiple Candidate Keys in one table. Each Candidate Key can work as a Primary Key.
3. **Primary Key** → A primary key is a set of one or more fields/columns of a table that uniquely identify a record in a database table. It can not accept null or duplicate values. Only one Candidate Key can be Primary Key.
4. **Unique Key** → A unique key is a set of one or more fields/columns of a table that uniquely identify a record in a database table. It is like a Primary key but it can accept only one null value and it can not have duplicate values. For
5. **Surrogate Key** → A surrogate key in a database is a unique identifier for either an entity in the modeled world or an object in the database. The surrogate key is not derived from application data, unlike a natural key
6. **Natural Key** → A natural key (also known as the business key or domain key) is a type of unique key in a database formed of attributes that exist and are used in the external world outside the database (i.e. in the business domain or domain of discourse).
7. **Foreign Key** → A foreign key is a field in one table that refers to the primary key of another table. It is used to establish relationships between tables and ensure referential integrity.
8. **Alternate Key →** An alternate key is a unique identifier for each record in a table, but it is not selected as the primary key. Alternate keys can be used as backup keys if the primary key is unavailable.
9. **Composite Key →** A composite key is a combination of two or more columns that together uniquely identify each record in a table. It is used when a single column is not sufficient to uniquely identify each record.

# SQL Basics

SQL (Structured Query Language) is a standard language used to manage relational databases. It is used to insert, update, delete, and retrieve data from a database. It can also be used to create and modify database structures such as tables, indexes, and relationships.

SQL is a hybrid language, it’s 4 types of languages in one

There are 4 main types of SQL statements:

1. **Data Definition Language(DDL):** This type of statement is used to define the database schema, create, alter, or delete tables and other database objects such as views, indexes, and procedures. Examples of DDL statements include CREATE TABLE, ALTER TABLE, and DROP TABLE.
2. **Data Manipulation Language(DML):** This type of statement is used to manipulate the data stored in the database, including inserting, updating, and deleting records. Examples of DML statements include INSERT, UPDATE, and DELETE.
3. **Data Query Language(DQL):** This type of statement is used to retrieve data from the database and is used for querying and reporting purposes. Examples of DQL statements include SELECT, JOIN, and GROUP BY.
4. **Data Control Language(DCL):** This type of statement is used to control access to the database, including granting and revoking privileges to users. Examples of DCL statements include GRANT and REVOKE.

# What is a Database?

A database is an organized collection of structured data, typically stored and accessed electronically. It is designed to efficiently manage large amounts of data and to provide fast and reliable data access to multiple users. Databases can be used for various purposes, including storing and retrieving information, tracking business transactions, and more. Some common types of databases include relational databases, NoSQL databases, and graph databases.

# Data Types

```sql
INT --Whole Numbers
DECIMAL(M,N) --Decimal Numbers - Exact Value
VARCHAR(1) --String of text of length 1
BLOB --Binary of large Object, Stores large data
DATE --'YYYY-MM-DD'
TIMESTAMP --"YYYY-MM-DD HH:MM:SS' - used for recording
```