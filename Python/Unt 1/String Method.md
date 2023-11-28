---
tags:
- "#college"
- "#python"
---

## String Methods for Manipulation:

1. **`upper()` and `lower()`**
   - `upper()`: Converts a string to uppercase.
   - `lower()`: Converts a string to lowercase.
   
   ```python
   text = "Hello, World!"
   print(text.upper())  # Output: HELLO, WORLD!
   print(text.lower())  # Output: hello, world!
   ```

2. **`strip()`**
   - Removes leading and trailing whitespace characters.
   
   ```python
   text = "   Hello, World!   "
   print(text.strip())  # Output: Hello, World!
   ```

3. **`replace()`**
   - Replaces a substring within a string with another substring.
   
   ```python
   text = "Hello, World!"
   new_text = text.replace("World", "Universe")
   print(new_text)  # Output: Hello, Universe!
   ```

4. **`split()`**
   - Splits a string into a list of substrings based on a delimiter.
   
   ```python
   text = "apple,banana,orange"
   fruits = text.split(",")  # ['apple', 'banana', 'orange']
   ```

## String Methods for Finding Information:

5. **`find()` and `index()`**
   - `find()`: Returns the lowest index of a substring within a string.
   - `index()`: Returns the index of a substring within a string.
   
   ```python
   text = "Hello, World!"
   print(text.find("World"))  # Output: 7
   print(text.index("World"))  # Output: 7
   ```

6. **`count()`**
   - Counts the occurrences of a substring within a string.
   
   ```python
   text = "Hello, World!"
   print(text.count("l"))  # Output: 3 (number of 'l' occurrences)
   ```

## String Formatting Methods:

7. **`format()`**
   - Formats the string with specified values.
   
   ```python
   name = "Alice"
   age = 30
   print("My name is {} and I am {} years old.".format(name, age))
   # Output: My name is Alice and I am 30 years old.
   ```

8. **f-strings (Formatted String Literals)**
   - Provides an efficient way to format strings with variables.
   
   ```python
   name = "Alice"
   age = 30
   print(f"My name is {name} and I am {age} years old.")
   # Output: My name is Alice and I am 30 years old.
   ```