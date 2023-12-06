---
tags:
- "#college"
- "#python"
---

## 1. Default Arguments:
Default arguments have predefined values set in the function definition. If no value is passed for these parameters during the function call, the default value is used.

Example:
```python
def greet(name="Guest", message="Hello"):
    return f"{message}, {name}!"

# Using default arguments
result1 = greet()  # Uses default values
result2 = greet("Alice")  # Overrides only 'name' default value
result3 = greet(message="Hi")  # Overrides only 'message' default value

print(result1)  # Output: Hello, Guest!
print(result2)  # Output: Hello, Alice!
print(result3)  # Output: Hi, Guest!
```

## 2. Keyword Arguments:
Keyword arguments are passed to a function by specifying the parameter name along with the value. They allow the caller to pass arguments in any order, using the parameter names.

Example:
```python
def greet(name, message):
    return f"{message}, {name}!"

# Using keyword arguments
result = greet(message="Hey", name="Alice")

print(result)  # Output: Hey, Alice!
```

## 3. Positional Arguments:
Positional arguments are passed based on their position in the function call. They match the parameters in the function definition from left to right.

Example:
```python
def add(a, b):
    return a + b

result = add(3, 5)  # 3 is assigned to 'a', 5 is assigned to 'b'
print(result)  # Output: 8
```

## 4. Arbitrary Positional Arguments (`*args`):
Arbitrary positional arguments allow a function to accept any number of positional arguments. They are captured as a tuple within the function.

Example:
```python
def my_function(*args):
    for arg in args:
        print(arg)

my_function(1, 2, "hello", True)
# Output:
# 1
# 2
# hello
# True
```

## 5. Arbitrary Keyword Arguments (`**kwargs`):
Arbitrary keyword arguments allow a function to accept any number of keyword arguments. They are captured as a dictionary within the function.

Example:
```python
def my_function(**kwargs):
    for key, value in kwargs.items():
        print(f"{key}: {value}")

my_function(name="Alice", age=30, city="New York")
# Output:
# name: Alice
# age: 30
# city: New York
```