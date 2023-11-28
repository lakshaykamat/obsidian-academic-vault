---
tags:
- "#college"
- "#python"
---

# Variables
A variable is a symbolic name for a value, storing and representing data within a program's memory in Python.

### Variable Assignment
In Python, you can assign values to variables using the assignment operator `=`.

```python
x = 5        # Assigns the value 5 to the variable x
name = "Alice"  # Assigns the string "Alice" to the variable name
```

### Naming Rules for Variables
- Variable names must start with a letter (a-z, A-Z) or an underscore (_).
- They can contain letters, numbers, and underscores.
- Variable names are case-sensitive (`name` and `Name` would be considered different variables).

### Data Types
Python is dynamically typed, meaning you don’t have to explicitly declare the type of a variable. The interpreter infers the type based on the value assigned to it.

```python
x = 5            # Integer
name = "Alice"   # String
is_valid = True  # Boolean
```

### Reassigning Variables
You can reassign a variable to a different value or a different data type.

```python
x = 5
x = "Hello"  # Valid, x now holds a string value
```

### Variable Scope
- Global: Accessible anywhere in code.
- Local: Limited to specific function/block where defined.

### Constants
Python treats variables named in all uppercase as constants, indicating values that are not meant to change conventionally.

```python
PI = 3.14159
```

### Mutable and Immutable Types
Mutable: Can change after creation (e.g., lists).
Immutable: Cannot change after creation (e.g., tuples).

```python
# Immutable
name = "Alice"
# Mutable
numbers = [1, 2, 3, 4, 5]
```
