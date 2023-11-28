---
tags:
- "#college"
- "#python"
---
# Sets

In Python, a set is an ==unordered and mutable collection== of ==unique elements==. Sets are defined using curly braces `{}` or the `set()` constructor function, and elements are separated by commas.

### Creating a Set:

#### Example:
```python
# Creating a set using curly braces
my_set = {1, 2, 3, 4, 5}

# Creating a set using the set() constructor
fruits = set(["apple", "banana", "orange"])

# Creating an empty set
empty_set = set()
```

### Sets and Unique Elements:

Sets in Python contain only unique elements. If duplicates are present in the initialization, they are automatically removed.

#### Example:
```python
my_set = {1, 2, 2, 3, 3, 4, 5}
print(my_set)  # Output: {1, 2, 3, 4, 5}
```

### Accessing Set Elements:

As sets are unordered, they do not support indexing or slicing to access specific elements. However, you can iterate through a set using loops.

#### Example:
```python
fruits = {"apple", "banana", "orange"}

for fruit in fruits:
    print(fruit)  # Outputs elements in an arbitrary order due to the unordered nature
```

### Modifying Sets:

#### Adding Elements:
```python
fruits = {"apple", "banana", "orange"}

fruits.add("kiwi")  # Adds a single element to the set
fruits.update(["grapes", "melon"])  # Adds multiple elements to the set

print(fruits)  # Output: {'apple', 'banana', 'orange', 'kiwi', 'grapes', 'melon'}
```

#### Removing Elements:
```python
fruits = {"apple", "banana", "orange"}

fruits.remove("banana")  # Removes a specific element from the set
fruits.discard("kiwi")  # Removes an element if present, without raising an error

print(fruits)  # Output: {'apple', 'orange'}
```

### Set Operations:

Sets support various operations like union, intersection, difference, etc., which can be performed between sets using operators or methods.

#### Example:
```python
set1 = {1, 2, 3}
set2 = {3, 4, 5}

union = set1 | set2  # Union of sets using '|' operator
intersection = set1 & set2  # Intersection of sets using '&' operator
difference = set1 - set2  # Difference of sets using '-' operator

print(union)  # Output: {1, 2, 3, 4, 5}
print(intersection)  # Output: {3}
print(difference)  # Output: {1, 2}
```