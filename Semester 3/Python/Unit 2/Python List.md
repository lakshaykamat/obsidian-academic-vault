---
tags:
- "#college"
- "#python"
---

# List
In Python, a list is a versatile data structure that stores a collection of items. Lists are ==ordered, mutable (changeable)==, and ==can contain elements of different data types==. Lists are defined using square brackets `[]` and elements are separated by commas.

## Creating a List:

#### Example:
```python
# Creating a list of integers
numbers = [1, 2, 3, 4, 5]

# Creating a list of strings
fruits = ["apple", "banana", "orange"]

# Creating a list with mixed data types
mixed_list = [1, "hello", True, 3.14]
```

### Accessing List Elements:

Elements in a list are accessed by their index, starting from 0 for the first element.

#### Example:
```python
fruits = ["apple", "banana", "orange"]

print(fruits[0])  # Output: apple
print(fruits[1])  # Output: banana
print(fruits[-1])  # Output: orange (accessing from the end of the list)
```

### List Operations:

#### Adding Elements:
```python
# Append: Add element at the end of the list
fruits.append("grapes")  # ['apple', 'banana', 'orange', 'grapes']

# Insert: Add element at a specific index
fruits.insert(1, "kiwi")  # ['apple', 'kiwi', 'banana', 'orange', 'grapes']
```

#### Removing Elements:
```python
# Remove: Remove the first occurrence of a value
fruits.remove("banana")  # ['apple', 'kiwi', 'orange', 'grapes']

# Pop: Remove element by index and return it
popped = fruits.pop(1)  # 'kiwi' | ['apple', 'orange', 'grapes']
```

### List Slicing:

Allows you to create a sublist by specifying a range of indices.

#### Example:
```python
numbers = [1, 2, 3, 4, 5]

sublist = numbers[1:4]  # [2, 3, 4]
```

### List Methods:

Python provides various methods to manipulate lists, including `sort()`, `reverse()`, `index()`, `count()`, `clear()`, and more.

#### Example:
```python
numbers = [3, 1, 4, 2, 5]

numbers.sort()  # Sorts the list in ascending order
print(numbers)  # Output: [1, 2, 3, 4, 5]

numbers.reverse()  # Reverses the list
print(numbers)  # Output: [5, 4, 3, 2, 1]
```