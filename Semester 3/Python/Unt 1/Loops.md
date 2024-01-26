---
tags:
- "#college"
- "#python"
---

# Loops in python
Loops are used to repeatedly execute a block of code until a certain condition is met. 
There are mainly two types of loops: `for` loops and `while` loops.

## `for` Loop:
The `for` loop is used to iterate over a sequence (such as a list, tuple, string, or range) or other iterable objects.
### Iterating through a sequence
```python
fruits = ["apple", "banana", "orange"]

for fruit in fruits:
    print(fruit)
```

### Using `range` in a `for` loop
```python
for i in range(5):  # Iterates from 0 to 4
    print(i)
```

## `while` Loop
The `while` loop is used to execute a block of code as long as a specified condition is true.

### Example of a `while` loop
```python
count = 0

while count < 5:
    print(count)
    count += 1
```

## Loop Control Statements
Python provides control statements to modify the behavior of loops.

### `break` Statement
The `break` statement is used to exit the loop prematurely.

```python
for i in range(10):
    if i == 5:
        break
    print(i)  # Prints numbers from 0 to 4
```

### `continue` Statement
The `continue` statement is used to skip the current iteration and continue with the next iteration of the loop.

```python
for i in range(5):
    if i == 2:
        continue
    print(i)  # Skips printing 2, prints other numbers from 0 to 4
```

## `else` Clause with Loops
Python allows an `else` block immediately after a loop. This block executes when the loop condition becomes `False`.

```python
for i in range(5):
    print(i)
else:
    print("Loop completed without any break")
```
