---
tags:
- "#college"
- "#dwm"
---

# Difference between Star and Snowflake schema

| Aspect                  | Star Schema                                                                          | Snowflake Schema                                                             |
| ----------------------- | ------------------------------------------------------------------------------------ | ---------------------------------------------------------------------------- |
| **Structure**           | Denormalized structure with dimensional tables directly connected to the fact table. | Normalized structure with dimension tables normalized into sub-tables.       |
| **Table Relationships** | Single-level relationships between fact and dimension tables.                        | Normalized relationships with sub-levels among dimension tables.             |
| **Complexity**          | Less complex due to denormalization, fewer tables, and simpler relationships.        | More complex due to normalization, more tables, and intricate relationships. |
| **Query Performance**   | Generally offers better query performance due to fewer joins.                        | Potentially slower due to additional joins across normalized tables.         |
| **Maintenance**         | Easier to maintain as it involves less complicated structures.                       | Requires more effort for maintenance due to normalization and more tables.   |
| **Storage Space**       | May require more storage space due to denormalization and duplicated data.           | Typically saves storage space due to normalization and reduced redundancy.   |
| **Usability**           | Easier for users to understand and navigate due to simplified structure.             | Potentially more challenging for users due to a more intricate design.       |
