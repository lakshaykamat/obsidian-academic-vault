---
tags:
- "#college"
- "#dwm"
---

# Two Tier architecture
A two-tier architecture is a basic client-server architecture that consists of two primary layers or tiers: the client tier and the server tier. 

In this setup, the client is responsible for the presentation layer and application logic, while the server handles the data storage and management. 

1. **Client Tier (Front-end):**
   - Presentation Layer: This layer interacts directly with the user and presents the user interface (UI) elements. It includes components such as forms, buttons, menus, and screens that users interact with to perform actions and view information.
   - Application Logic: Some part of the business logic may reside in the client, handling tasks like input validation, user authentication, and basic processing before sending requests to the server.

2. **Server Tier (Back-end):**
   - Data Management: The server tier manages the data storage, retrieval, manipulation, and processing. It hosts the database or data storage system that holds the application's data.
   - Application Logic: The server also hosts parts of the application logic, handling complex processing, business rules, data validation, and responding to client requests by retrieving or modifying data in the database.

## Characteristics
- **Simplicity:** It is straightforward and easy to implement compared to more complex architectures.
- **Limited Scalability:** Scaling can be challenging since both the application logic and data storage reside on the server, potentially leading to performance issues as user demands increase.
- **Performance:** This architecture might suffer from performance limitations due to the client-server communication overhead.
- **Network Dependency:** The communication between the client and server heavily relies on the network, impacting the system's performance based on network speed and reliability.
- **Data Security:** Security measures are typically concentrated on the server side, making it crucial to secure the server and its connections.
![](https://dwgeek.com/wp-content/uploads/2017/10/Data-Warehouse-two-tier-architecture.jpg)
![]()

# Three Tier architecture
A three-tier architecture is a client-server architecture that divides an application into three logically independent tiers or layers, each performing specific functions and communicating with the other tiers to complete tasks. 

This architecture model separates the presentation layer, application logic layer, and data storage layer, providing modularity, scalability, and easier maintenance compared to a two-tier architecture.


1. **Presentation Tier (Client Tier):**
   - This tier represents the user interface or the front-end layer that interacts directly with users.
   - Responsibilities include displaying information to users, collecting user inputs (through forms, UI components), and sending requests to the application server.
   - User interactions are processed here, and the presentation layer communicates with the application server to access or modify data.

2. **Application Tier (Logic Tier or Middle Tier):**
   - Also known as the business logic or application logic layer, this tier contains the core logic and processing functionalities of the application.
   - It handles business rules, processes, calculations, validations, and workflow management.
   - Receives requests from the presentation layer, processes them, and interacts with the data tier for data retrieval or storage operations.

3. **Data Tier (Data Storage Tier):**
   - This tier is responsible for managing and storing data used by the application.
   - It houses databases, file systems, or other data storage systems where the application's data is stored.
   - Provides access to stored data for the application tier, allowing retrieval, modification, and storage operations based on the business logic's requirements.

## Characteristics and advantages
- **Modularity and Scalability:** Dividing the application into separate tiers allows for easier scalability and maintenance of each tier independently.
- **Enhanced Security:** Security measures can be implemented at each tier, securing data access and interactions between layers.
- **Improved Performance:** The distribution of responsibilities across tiers can enhance performance by optimizing each tier's functionality.
- **Support for Different Platforms:** The separation of concerns enables different technologies and platforms to be used in each tier independently.

![](https://cdn.educba.com/academy/wp-content/uploads/2020/01/Three-Tier-Data-Warehouse-Architecture-2.jpg)

![[Difference between two tier and three tier]]