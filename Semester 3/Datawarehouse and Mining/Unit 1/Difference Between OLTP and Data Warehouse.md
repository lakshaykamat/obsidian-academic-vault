---
tags:
- "#college"
- "#dwm"
---

# Difference between OLTP and Data warehouse
| Aspect                   | OLTP                                       | Data Warehouse                                    |
|--------------------------|---------------------------------------------|---------------------------------------------------|
| **Purpose**              | Manages day-to-day transactional operations. | Stores historical data for analysis and reporting. |
| **Usage**                | Handles real-time transactional activities.  | Supports analytical queries and reporting.         |
| **Data Focus**           | Current, operational data.                   | Historical, aggregated, and structured data.       |
| **Database Design**      | Normalized schema for transactional processing. | Denormalized or dimensional schema for analytical querying. |
| **Query Complexity**     | Simple, routine, and individual queries.     | Complex, analytical queries involving aggregations and trends. |
| **Data Changes**         | Frequent data updates and modifications.     | Periodic batch updates; mostly read-only access.  |
| **Transaction Size**     | Handles smaller, individual transactions.   | Manages large data sets and historical records.    |
| **Concurrency**          | Supports high concurrency for many users.   | Focused on read-intensive operations.             |
| **Performance Focus**    | Emphasizes speed for quick transactions.    | Focuses on optimized querying and reporting.      |
| **Indexes**              | Fewer indexes to enhance transaction speed. | More indexes for improved querying performance.    |
| **Data Retention Period**| Short-term data retention.                  | Long-term data retention for historical analysis. |
| **Example Systems**      | Online banking systems, e-commerce platforms. | Business intelligence tools, decision support systems. |