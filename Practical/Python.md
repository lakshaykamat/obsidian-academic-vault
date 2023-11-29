---
tags:
- "#python"
- "#college"
---
# Python Practical
## Table of Content
1. [[Academics/Semester 3/Practical/Python#Fibonacci series in python|Fibonacci]]
2. [[Academics/Semester 3/Practical/Python#Factorial in python|Factorial]]
3. [[Academics/Semester 3/Practical/Python#Largest Among Three|Largest among three]]
4. [[Academics/Semester 3/Practical/Python#Sum List|Sun of List]]
5. [[Academics/Semester 3/Practical/Python#Prime Number|Prime Numbers]]
6. [[Academics/Semester 3/Practical/Python#Common element in list|Common elements in list]]
7. [[Academics/Semester 3/Practical/Python#Pattern 1|Pattern 1]]
8. [[Academics/Semester 3/Practical/Python#Pattern 2|Pattern 2]]
9. [[Academics/Semester 3/Practical/Python#Reverse Words|Reverse Words]]
10. [[Academics/Semester 3/Practical/Python#Extract unique words from file|Extract unique words from file]]
### Fibonacci series in python
#### Using iteration
```python
def fibonacci_with_loop(n):
    fib_series = []
    a, b = 0, 1
    for _ in range(n):
        fib_series.append(a)
        a, b = b, a + b
    return fib_series
```
#### Using recursion
```python
def fibonacci_with_recursion(n):
    if n <= 1:
        return n
    else:
        return fibonacci_with_recursion(n - 1) + fibonacci_with_recursion(n - 2)


num_terms = 10
fib_result = [fibonacci_with_recursion(i) for i in range(num_terms)]
print(fib_result)

```

### Factorial in python
#### Using recursion

```python
def factorial(n):
    if n == 0 or n == 1:
        return 1
    else:
        return n * factorial(n - 1)
```
#### Using iteration
```python
def factorial_iterative(n):
    if n == 0 or n == 1:
        return 1
    else:
        result = 1
        for i in range(2, n + 1):
            result *= i
        return result
```
### Largest Among Three
```python
def find_largest_number(num1, num2, num3):
    if num1 >= num2 and num1 >= num3:
        return num1
    elif num2 >= num1 and num2 >= num3:
        return num2
    else:
        return num3
```
### Sum List
```python
def sum_list_numbers(lst):
    total = 0
    for num in lst:
        total += num
    return total
```
### Prime Number
```python
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

print("Prime numbers less than 20:")
for num in range(2, 20):
    if is_prime(num):
        print(num)

```
### Sort List
```python
def ascending_order(input_list):
    n = len(input_list)

    for i in range(n - 1):
        for j in range(0, n - i - 1):
            if input_list[j] > input_list[j + 1]:
                input_list[j], input_list[j + 1] = input_list[j + 1], input_list[j]

    return input_list
```
### Common element in list
```python
def find_common_elements(list1, list2):
    common_elements = set(list1).intersection(set(list2))
    return list(common_elements)
```
### Pattern 1
```python
'''
1
1 1 
1 1 1
1 1 1 1
'''
rows = 4 

for i in range(1, rows + 1):
    for j in range(1, i + 1):
        print("1", end=" ")
    print()

```
### Pattern 2
```python
'''
1 1 1 1 1
1 1  1 
1 1
1
'''
rows = 4 

for i in range(rows, 0, -1):
    for j in range(1, i + 1):
        print("1", end=" ")
    print()

```
### Reverse Words 
```python
def reverse_words(self, s):
    words = s.split()
    reversed_words = words[::-1]
    reversed_string = ' '.join(reversed_words)
    return reversed_string
```
### Extract unique words from file
```python
def extract_unique_words(file_name):
    unique_words = set()


    with open(file_name, 'r') as file:
        for line in file:
            words = line.split()
            for word in words:
                word = word.strip('.,?!-\'"').lower()
                unique_words.add(word)

    return sorted(unique_words)

file_name = 'input.txt'

unique_word_list = extract_unique_words(file_name)
print("Unique words in alphabetical order:")
for word in unique_word_list:
    print(word)

```