---
tags:
- "#college"
- "#dwm"
---

# Data warehouse Schema
A schema is a collection of database objects, including tables, views, indexes etc.

## Star Schema
- Central fact table surrounded by denormalized dimension tables.
- Fact table holds measures, while dimensions contain descriptive attributes.
- Simplifies querying and provides quick aggregations.

### Advantages of Star schema
- Simplicity and Understandability
- Query Performance
- Optimized for OLAP
- Most suitable for query processing
![](https://media.geeksforgeeks.org/wp-content/uploads/Untitled-drawing-3-2.png)
![](https://upload.wikimedia.org/wikipedia/commons/b/bb/Star-schema.png)
## Snowflake Schema
- Similar to a star schema but with normalized dimension tables.
- Dimension tables are further normalized into sub-dimensions.
- More normalized structure can save storage space but may complicate queries.

### Advantages of Snowflake schema
- **Normalized Structure:** Reduces data redundancy and saves storage space.
- **Easier Maintenance:** Simplifies updates due to normalization.
- **Scalability:** Allows flexibility for evolving business needs.
- **Data Integrity:** Enhances consistency and integrity of data.
- **Specific Use Cases:** Suitable for certain compliance needs.
- **Complex Queries:** Supports detailed and fine-grained queries.
- **Join Reduction:** May reduce joins, optimizing performance.

### Disadvantages of Snowflake schema
- **Complexity in Queries:** More complex query structures compared to star schema.
- **Potential Performance Impact:** Increased number of joins can impact query performance.
- **Additional Joins:** Requires more joins across normalized tables, affecting query speed.
- **User Understanding:** More challenging for users to navigate compared to a star schema.
- **Maintenance Overhead:** Increased maintenance complexity due to normalized structure.
- **Limited Use Cases:** Not ideal for scenarios prioritizing query performance over normalization.
- **Storage Overhead:** May lead to increased storage requirements due to normalization.

![](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b2/Snowflake-schema.png/800px-Snowflake-schema.png)
![](https://media.geeksforgeeks.org/wp-content/uploads/20230608140940/Capture-163-660.webp)

## Galaxy Schema
- Combination of multiple star schemas sharing dimension tables.
- Useful for complex business scenarios or when multiple fact tables share common dimensions.
- Offers more flexibility but can increase complexity.

### Advantages of Galaxy Schema:

- **Flexibility:** Offers more flexibility for complex business scenarios.
- **Multiple Star Schemas:** Supports multiple star schemas sharing dimensions.
- **Varied Analytical Perspectives:** Facilitates diverse analytical perspectives.

### Disadvantages of Galaxy Schema

- **Complexity:** Increases complexity due to multiple interconnected star schemas.
- **Maintenance Challenges:** Higher maintenance complexity compared to simpler schemas.
- **Query Performance:** Potential impact on query performance due to increased complexity.
![](https://media.geeksforgeeks.org/wp-content/uploads/factcommonnew.jpg)

![[Difference Between Star and Snowflake Schema]]