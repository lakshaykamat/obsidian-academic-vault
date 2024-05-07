# Vectors in R

### Definition

A vector in R is a fundamental data structure that represents an ==ordered collection of elements of the same data type.== Vectors are ==one-dimensional and can store numerical values, character strings, or logical values.==

### Creating Vectors

Vectors are typically created using the `c()` function, which stands for concatenate. Here are examples of creating vectors of different types:

```R
# Numeric vector
numeric_vector <- c(1, 2, 3, 4, 5)

# Character vector
character_vector <- c("apple", "banana", "orange")

# Logical vector
logical_vector <- c(TRUE, FALSE, TRUE)
```

### Indexing and Accessing Elements

Elements within a vector can be accessed using square brackets with an index. Indexing in R is 1-based:

```R
# Accessing the second element of a numeric vector
second_element <- numeric_vector[2]
```

### Vector Operations

Arithmetic operations can be performed element-wise on numeric vectors:

```R
# Addition of two numeric vectors
result_vector <- numeric_vector + c(10, 10, 10, 10, 10)
```

### Vectorized Operations

R is designed to efficiently handle vectorized operations, allowing the application of a function or operation to an entire vector without explicit loops:

```R
# Vectorized square root operation
sqrt_vector <- sqrt(numeric_vector)
```

### Named Vectors

Elements in a vector can be named, facilitating easier referencing:

```R
# Creating a named vector
named_vector <- c(apple = 1, banana = 2, orange = 3)

# Accessing element by name
value_of_banana <- named_vector["banana"]
```

### Vector Functions

Various functions can be applied to vectors for summary statistics:

```R
# Finding the length of a vector
vector_length <- length(numeric_vector)

# Calculating the sum of a numeric vector
sum_of_vector <- sum(numeric_vector)
```