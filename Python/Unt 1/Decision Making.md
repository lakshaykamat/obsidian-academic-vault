---
tags:
- "#college"
- "#python"
---
# Decision making

Basic decision-making statements in Python include `if`, `elif` (short for else if), and `else`. These statements allow you to control the flow of your code based on certain conditions.

### `if` Statement:
The `if` statement is used to execute a block of code if a condition is true.

```python
x = 10

if x > 5:
    print("x is greater than 5")
```

### `if` ... `else` Statement:
The `if` ... `else` statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

```python
x = 3

if x > 5:
    print("x is greater than 5")
else:
    print("x is less than or equal to 5")
```

### `if` ... `elif` ... `else` Statement:
The `if` ... `elif` ... `else` statement is used to check multiple conditions.

```python
x = 10

if x > 10:
    print("x is greater than 10")
elif x == 10:
    print("x is equal to 10")
else:
    print("x is less than 10")
```

### Nested `if` Statements:
You can also have `if` statements inside other `if` statements (nested).

```python
x = 10
y = 5

if x > 5:
    if y > 3:
        print("Both conditions are true")
    else:
        print("Inner condition is false")
else:
    print("Outer condition is false")
```