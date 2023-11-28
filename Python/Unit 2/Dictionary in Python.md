---
tags:
- "#college"
- "#python"
---

# Dictionary in Python
In Python, a dictionary is a collection of key-value pairs. Dictionaries are unordered, mutable, and defined using curly braces `{}`. Each element in a dictionary consists of a key-value pair separated by a colon `:`.

### Creating a Dictionary:

#### Example:
```python
# Creating a dictionary
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

# Creating an empty dictionary
empty_dict = {}
```

### Accessing Dictionary Elements:

You can access values in a dictionary by using the associated keys. Keys must be unique within a dictionary.

#### Example:
```python
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

print(my_dict["name"])  # Output: Alice
print(my_dict["age"])   # Output: 30
```

### Modifying Dictionary Elements:

#### Adding or Modifying Elements:
```python
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

# Adding a new key-value pair
my_dict["email"] = "alice@example.com"

# Modifying the value of an existing key
my_dict["age"] = 31

print(my_dict)
# Output: {'name': 'Alice', 'age': 31, 'city': 'New York', 'email': 'alice@example.com'}
```

### Removing Elements:

#### Removing a Key-Value Pair:
```python
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

# Removing a key-value pair
del my_dict["age"]

print(my_dict)  # Output: {'name': 'Alice', 'city': 'New York'}
```

#### Clearing a Dictionary:
```python
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

my_dict.clear()  # Removes all elements in the dictionary

print(my_dict)  # Output: {}
```

### Dictionary Methods:

Python dictionaries have several methods for manipulating and accessing data, such as `keys()`, `values()`, `items()`, `get()`, `update()`, and more.

#### Example:
```python
my_dict = {"name": "Alice", "age": 30, "city": "New York"}

keys = my_dict.keys()  # Returns dictionary keys as a view
values = my_dict.values()  # Returns dictionary values as a view
items = my_dict.items()  # Returns key-value pairs as a view of tuples

print(keys)    # Output: dict_keys(['name', 'age', 'city'])
print(values)  # Output: dict_values(['Alice', 30, 'New York'])
print(items)   # Output: dict_items([('name', 'Alice'), ('age', 30), ('city', 'New York')])
```

Dictionaries are useful for storing and manipulating data with key-value pairs, providing a flexible way to manage information in Python.