---
tags:
- "#college"
- "#python"
---

## 1. Built-in Functions
These functions are provided by Python as part of its standard library and can be directly used without defining them. Examples include `print()`, `len()`, `max()`, `min()`, `sorted()`, etc.

## 2. User-defined Functions
Functions created by users to perform specific tasks. They provide modularity and reusability in code by encapsulating a set of statements.

## 3. Anonymous Functions (Lambda Functions)
These are small, one-line functions defined using the `lambda` keyword. They are usually used for simple operations and do not have a name.

Example:
```python
add = lambda x, y: x + y
result = add(3, 5)  # Output: 8
```

## 4. Recursive Functions
Functions that call themselves within their definition. They are used to solve problems that can be broken down into smaller identical sub-problems.

Example:
```python
def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

result = factorial(5)  # Output: 120 (5 * 4 * 3 * 2 * 1)
```