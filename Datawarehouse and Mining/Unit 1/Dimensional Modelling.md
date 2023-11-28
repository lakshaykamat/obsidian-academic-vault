---
tags:
- "#college"
- "#dwm"
---

# Dimensional Modelling
Dimensional modeling is a technique used in data warehousing to design and organize data for easier querying and analysis.

It involves structuring data into dimensions and facts to provide a more intuitive and understandable model for users.

## Fact table
- Stores quantitative and numeric data.
- Contains metrics or measures.
- Connected to dimension tables.
- Facilitates data analysis and reporting.
- Holds data at a specific granularity level.
- Central to multidimensional data modelling.
- Supports decision-making and analytics.
- Represents business facts or events.
### Example

Fact table of a book details (book_id)

| B_id | Author | Price |
| --- | --- | --- |
| B1 | ABC | 45 |
|B2 | XYZ | 76 |
## Dimension table
- Holds descriptive attributes.
- Contains reference data.
- Provides context to the fact table.
- Includes hierarchies and categories.
- Supports data analysis and reporting.
- Typically smaller in size than fact tables.
- Used for filtering and grouping data.
- Often linked to a fact table through keys.

### Example
Dimension table of book transactions

| B_id | T_id | number |
| ---- | ---- | ------ |
| B1   | 1    | 25     |
| B2   | 2    | 26     |


![[Difference Between Fact and Dimension table]]