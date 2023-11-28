---
tags:
- "#python"
- "#college"
---

# Binary File
Binary files in Python are used to store data in a binary format, unlike text files that store data in a human-readable format. 

Binary files contain information in a format that's directly understandable by the computer's hardware. 

They store data in a sequence of bytes, representing different types of information such as images, videos, executables, etc.

### Characteristics of Binary Files:

1. **Content Representation:** Data is stored in a raw format, using sequences of bytes.
2. **No Character Encoding:** Unlike text files, binary files don’t have character encoding like UTF-8 or ASCII.
3. **Machine-Readable:** Binary files store data in a form directly readable by the machine's hardware.
### File Modes

| Mode    | Description                                         | Example Usage                                      |
|---------|-----------------------------------------------------|-----------------------------------------------------|
| `'rb'`  | Read mode in binary                                 | `with open('file.bin', 'rb') as file: content = file.read()` |
| `'wb'`  | Write mode in binary                                | `with open('file.bin', 'wb') as file: file.write(b'Binary data')` |
| `'ab'`  | Append mode in binary                               | `with open('file.bin', 'ab') as file: file.write(b'Additional data')` |
| `'rb+'` | Read and write mode in binary                       | `with open('file.bin', 'rb+') as file: content = file.read(); file.write(b'New data')` |

### Handling Binary Files in Python:

#### Opening Binary Files:
```python
# Open a binary file in read mode
with open('binary_file.bin', 'rb') as file:
    content = file.read()  # Read the entire content as bytes
```

#### Writing to Binary Files:
```python
# Open or create a binary file in write mode
with open('binary_file.bin', 'wb') as file:
    data = b'\x48\x65\x6C\x6C\x6F'  # Example data in bytes (e.g., ASCII representation)
    file.write(data)  # Write binary data to the file
```

#### Reading and Writing Binary Files:
```python
with open('binary_file.bin', 'rb+') as file:
    content = file.read()  # Read content as bytes
    # Perform operations on binary content
    file.write(b'\xFF\xFE\xFD')  # Write new binary data to the file
```

### Common Binary File Formats:
1. **Images:** JPEG, PNG, GIF, etc.
2. **Videos:** MP4, AVI, MOV, etc.
3. **Audio:** MP3, WAV, FLAC, etc.
4. **Executable Files:** EXE, DLL, etc.