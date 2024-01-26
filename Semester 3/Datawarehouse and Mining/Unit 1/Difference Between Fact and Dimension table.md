---
tags:
- "#college"
- "#dwm"
---

# Difference between Fact and Dimension Table
| Aspect           | Fact Table                                          | Dimension Table                                       |
| ---------------- | --------------------------------------------------- | ----------------------------------------------------- |
| **Content**      | Stores quantitative data, numeric measurements.     | Contains descriptive attributes or context.           |
| **Data Type**    | Holds measures, metrics, or business facts.         | Stores descriptive data about business entities.      |
| **Focus**        | Central focus of analysis; contains numerical data. | Provides context and details for analysis.            |
| **Relationship** | Connected to multiple dimension tables via keys.    | Linked to a single fact table using keys.             |
| **Granularity**  | Contains data at a detailed, transactional level.   | Provides attributes at a higher level of abstraction. |
| **Size**         | Larger in size due to numeric and detailed data.    | Smaller compared to fact tables.                      |
| **Changes**      | Less frequent changes, mostly appended data.        | More static; changes are occasional.                  |
| **Aggregation**  | Typically used for aggregations and calculations.   | Utilized for filtering and grouping data.             |
| **Examples**     | Sales amounts, quantities, revenues, etc.           | Time, product, customer, geography, etc.              |
