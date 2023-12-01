---
tags:
  - "#python"
  - "#college"
---

# Python Programs
1. Armstrong number
2. Factorial using recursion or iteration
3. Fibonacci using recursion or iteration
4. Check palindrome
5. Sort an array
6. Find an element in an array at a specific index
7. Create a file and write some data in it
8. Write a pattern of 
	 *
     * *
  * * *
    *  *  * *  
9. Wirte a patter of 
* * * *
 *  * *
 *  *

Certainly! Here are Python solutions to the problems you've listed:

### 1. Armstrong Number:
```python
def is_armstrong_number(n):
    num = str(n)
    order = len(num)
    sum = 0

    for digit in num:
        sum += int(digit) ** order

    return sum == n

# Example usage:
number = 153
if is_armstrong_number(number):
    print(f"{number} is an Armstrong number")
else:
    print(f"{number} is not an Armstrong number")
```

### 2. Factorial using Recursion:
#### Using Loop
```python
def factorial_loop(n):
    if n < 0:
        return "Factorial is not defined for negative numbers"
    elif n == 0 or n == 1:
        return 1

    factorial_result = 1
    for i in range(2, n + 1):
        factorial_result *= i

    return factorial_result

# Example usage:
num = 5
result = factorial_loop(num)
print(f"The factorial of {num} is: {result}")

```
#### Recursion
```python
def factorial_recursive(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial_recursive(n - 1)

# Example usage:
num = 5
print(f"Factorial of {num} using recursion: {factorial_recursive(num)}")
```

### 3. Fibonacci using Recursion:
#### Using Loop
```python
def fibonacci_loop(n):
    if n <= 0:
        return []

    fib_sequence = [0, 1]  

    if n == 1:
        return [0]
    elif n == 2:
        return fib_sequence

    for i in range(2, n):
        next_num = fib_sequence[-1] + fib_sequence[-2]
        fib_sequence.append(next_num)

    return fib_sequence

# Example usage:
count = 10
fibonacci_result = fibonacci_loop(count)
print("Fibonacci sequence using loop:")
print(fibonacci_result)

```
#### Recursion
```python
def fibonacci_recursive(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)

# Example usage:
count = 10
print("Fibonacci sequence using recursion:")
for i in range(count):
    print(fibonacci_recursive(i))
```

### 4. Check Palindrome:
```python
def is_palindrome(s):
    return s == s[::-1]

# Example usage:
string = "madam"
if is_palindrome(string):
    print(f"{string} is a palindrome")
else:
    print(f"{string} is not a palindrome")
```

### 5. Sort an Array
#### Built-in Method
```python
arr = [64, 25, 12, 22, 11]
arr.sort()

print("Sorted array:")
for element in arr:
    print(element)

```
#### Bubble Sort
```python
def bubble_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

# Example usage:
arr = [64, 25, 12, 22, 11]

print("Original array:")
for element in arr:
    print(element, end=" ")

bubble_sort(arr)

print("\nSorted array:")
for element in arr:
    print(element, end=" ")

```

### 6. Find an Element in an Array at a Specific Index:
```python
arr = [10, 20, 30, 40, 50]
index = 2

if index < len(arr):
    print(f"Element at index {index}: {arr[index]}")
else:
    print("Index out of range")
```

### 7. Create a File and Write Some Data in It:
#### Without context manger
```python
with open('data.txt', 'w') as file:
    file.write("Hello, this is some data written in a file.")
```
#### Without context manger
```python
file = open('data.txt', 'w')
file.write("Hello, this is some data written in a file.")
file.close()

```

### 8. Print a Pattern:
```python
"""
* 
*  *
*  *  *
*  *  *  *
"""
rows = 4

for i in range(1, rows + 1):
    print("* " * i)

```

### 9. Write a Pattern:
```python
"""
* * * *
* * *
* *
*
"""
rows = 4

for i in range(rows, 0, -1):
    print("* " * i)

```
