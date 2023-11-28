---
tags:
- "#college"
- "#python"
---
# Strings
Strings in Python represent sequences of characters and are declared using single (''), double ("") or triple (''' ''') quotes. They are immutable, meaning once created, their contents cannot be changed. Here are some key aspects of working with strings in Python:

## Declaring Strings
```python
# Using single quotes
single_quoted = 'Hello, World!'

# Using double quotes
double_quoted = "Hello, World!"

# Using triple quotes for multi-line strings
multi_line = '''This is a 
multi-line string.'''
```

## Accessing Characters in a String:
```python
my_string = "Hello, World!"

# Accessing individual characters
first_char = my_string[0]  # H
last_char = my_string[-1]  # !
substring = my_string[3:7]  # lo, 
```

## Basic String Operations:
```python
# Concatenation
concatenated = "Hello, " + "World!"

# Length of a string
length = len("Hello, World!")  # 13

# String methods
uppercased = "hello".upper()  # "HELLO"
lowercased = "WORLD".lower()  # "world"
```

## String Formatting
```python
name = "Alice"
age = 30

# Using f-string (formatted string literals)
formatted_string = f"My name is {name} and I am {age} years old."
```

## Escape Characters

```python
# Using escape characters
escaped_string = "This string contains a newline \nand a tab \tcharacter."
```


[[String Method]]