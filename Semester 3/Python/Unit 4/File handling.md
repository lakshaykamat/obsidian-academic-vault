---
tags:
- "#college"
- "#python"
---

# File Handling
File handling in Python involves managing data in files, allowing operations such as creation, reading, updating, and deletion.

### File Operations Workflow:

1. **Open a File:**
   - Use the `open()` function: `file = open(filename, mode)`.
   - Modes: "r" (read), "a" (append), "w" (write), "x" (create), "t" (text), "b" (binary).

2. **Basic File Handling Process:**
   - Create a file.
   - Open the file.
   - Perform read/write operations.
   - Close the file.

### File Types
1. **Text files:** Store data as characters and strings.
2. **Binary files:** Store data as bytes (e.g., images, audio).

### Basic File Operations:

#### Opening a File:

```python
file = open('filename.txt', 'r')  # 'r', 'w', 'a', 'x' for respective operations
```

#### Reading from a File:

```python
content = file.read()      # Read entire file content
lines = file.readlines()   # Read lines into a list
```

#### Writing to a File:

```python
file.write('This is a new line.')  # Write content to file
```

#### Closing a File:

```python
file.close()  # Close the file when done
```

### Context Managers (`with` statement):

Using `with` is cleaner and ensures the file is closed automatically:

Example - Reading from a file:

```python
with open('filename.txt', 'r') as file:
    content = file.read()
    # Do operations with the file inside this block
# File is automatically closed outside the block
```

### File Modes:

- **'r':** Read mode (default).
- **'w':** Write mode, truncating the file.
- **'a':** Append mode, appending data to the end.
- **'b':** Binary mode.
- **'t':** Text mode (default).
- **'+':** Update mode (reading and writing).

### Example - Reading from a File:

```python
with open('sample.txt', 'r') as file:
    content = file.read()
    print(content)
```

### Example - Writing to a File:

```python
with open('output.txt', 'w') as file:
    file.write('This is a new line.')
```

### Check File Existence:

```python
import os

if os.path.exists("hello.txt"):
    os.remove("hello.txt")
else:
    print("File does not exist")
```

### `tell()` and `seek()` Functions:

- `tell()`: Returns the current file position.
  ```python
  file.tell()
  ```

- `seek()`: Changes the file position.
  ```python
  file.seek(position)
  ```
