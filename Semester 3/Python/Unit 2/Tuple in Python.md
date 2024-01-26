---
tags:
  - "#college"
  - "#python"
---

# Tuple
In Python, a tuple is an ==ordered and immutable (unchangeable)==collection of elements. Tuples are defined using parentheses `()` and elements are separated by commas.

### Creating a Tuple:

#### Example:
```python
# Creating a tuple of integers
my_tuple = (1, 2, 3, 4, 5)

# Creating a tuple of strings
fruits = ("apple", "banana", "orange")

# Creating a mixed data type tuple
mixed_tuple = (1, "hello", True, 3.14)
```

### Accessing Tuple Elements:

Elements in a tuple are accessed by their index, starting from 0 for the first element, similar to lists.

#### Example:
```python
fruits = ("apple", "banana", "orange")

print(fruits[0])  # Output: apple
print(fruits[1])  # Output: banana
print(fruits[-1])  # Output: orange (accessing from the end of the tuple)
```

### Immutable Nature of Tuples:

Tuples are immutable, meaning once created, their elements cannot be changed, added, or removed.

#### Example:
```python
fruits = ("apple", "banana", "orange")

# Attempting to modify a tuple will raise an error
# fruits[0] = "kiwi"  # This will cause a TypeError

# However, reassignment of the entire tuple is possible
fruits = ("kiwi", "banana", "orange")  # ('kiwi', 'banana', 'orange')
```

### Tuple Operations:

#### Tuple Packing and Unpacking:
Tuple packing refers to packing multiple values into a single tuple, while tuple unpacking allows assigning those values to multiple variables.

#### Example:
```python
# Tuple Packing
my_tuple = 1, 2, 3  # (1, 2, 3)

# Tuple Unpacking
a, b, c = my_tuple  # a = 1, b = 2, c = 3
```

### Tuple Methods:

Tuples have limited methods due to their immutability. They include `index()` and `count()`.

#### Example:
```python
my_tuple = (1, 2, 2, 3, 4)

index = my_tuple.index(2)  # Finds the index of the first occurrence of value 2
count = my_tuple.count(2)  # Counts the number of occurrences of value 2

print(index)  # Output: 1
print(count)  # Output: 2
```