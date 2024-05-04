# R Objects
In R, everything is an object, including data structures, functions, symbols, and even expressions themselves. Each object has a specific type and can hold different kinds of information. Here's how you can work with some common R objects and perform useful manipulations on them:

## Vector
Vectors are one-dimensional arrays that can hold numeric, character, logical, or other types of data.

### Creation:
```R
# Numeric vector
numeric_vector <- c(1, 2, 3, 4, 5) 

# Character vector 
character_vector <- c("apple", "banana", "orange")
```

### Useful Methods and Manipulations:
```R
# Length of a vector
length(numeric_vector)

# Accessing elements
numeric_vector[3]  # Access the third element of numeric_vector

# Adding elements
new_vector <- c(numeric_vector, 6)

# Removing elements
new_vector <- numeric_vector[-3]  # Remove the third element

# Vectorized operations
result <- numeric_vector * 2  # Multiply each element by 2

# Concatenation
combined_vector <- c(numeric_vector, character_vector)

# Sorting
sorted_vector <- sort(numeric_vector)

# Checking for existence
element_exists <- 3 %in% numeric_vector

# Filtering
filtered_vector <- numeric_vector[numeric_vector > 2]
```

## Data Frame
Data frames are two-dimensional structures that can hold multiple vectors of different types, similar to a spreadsheet or a database table.

### Creation:
```R
# Create a data frame
my_data <- data.frame(
  ID = c(1, 2, 3),
  Name = c("John", "Alice", "Bob"),
  Age = c(25, 30, 28)
)
```

### Useful Methods and Manipulations:
```R
# Summary statistics
summary(my_data)

# Accessing columns
my_data$Name

# Adding columns
my_data$Salary <- c(50000, 60000, 55000)

# Removing columns
my_data <- my_data[, -4]  # Remove the Salary column

# Filtering rows
filtered_data <- my_data[my_data$Age > 25, ]
```


## Lists
Lists are versatile data structures that can hold elements of different types, such as vectors, matrices, or even other lists.

### Creation:
```R
# Create a list
my_list <- list(
  numeric_vector = c(1, 2, 3),
  character_vector = c("apple", "banana", "orange"),
  matrix = matrix(1:6, nrow = 2),
  another_list = list(a = 1, b = "two")
)
```

### Useful Methods and Manipulations:
```R
# Accessing elements
my_list$numeric_vector

# Adding elements
my_list$new_vector <- c(4, 5, 6)

# Removing elements
my_list$new_vector <- NULL

# Accessing elements within nested lists
my_list$another_list$a

# Extracting a sublist
sublist <- my_list[c("character_vector", "another_list")]
```

## Matrices
Matrices are two-dimensional arrays that contain elements of the same atomic type (numeric, character, logical).

### Creation:
```R
# Create a matrix
my_matrix <- matrix(1:6, nrow = 2)
```

### Useful Methods and Manipulations:
```R
# Dimension of the matrix
dim(my_matrix)

# Accessing elements
my_matrix[1, 2]

# Adding rows or columns
new_row <- c(7, 8)
my_matrix <- rbind(my_matrix, new_row)

# Removing rows or columns
my_matrix <- my_matrix[-1, ]

# Transpose
transposed_matrix <- t(my_matrix)
```

## Arrays
Arrays are multi-dimensional extensions of matrices that can contain elements of the same type.

### Creation:
```R
# Create an array
my_array <- array(1:24, dim = c(2, 3, 4))
```

### Useful Methods and Manipulations:
```R
# Dimension of the array
dim(my_array)

# Accessing elements
my_array[1, 2, 3]

# Adding dimensions
new_dim <- c(3, 3, 4)
my_array <- array(1:36, dim = new_dim)

# Removing dimensions
my_array <- my_array[,-1,]

# Reshaping
reshaped_array <- array(1:24, dim = c(3, 4, 2))
```

## Factors
Factors are used to represent categorical data in R.

### Creation:
```R
# Create a factor
my_factor <- factor(c("A", "B", "A", "C", "B"))
```

### Useful Methods and Manipulations:
```R
# Levels of the factor
levels(my_factor)

# Count of each level
table(my_factor)

# Changing levels
my_factor <- factor(my_factor, levels = c("A", "B", "C", "D"))

# Reordering levels
my_factor <- factor(my_factor, levels = c("B", "A", "C", "D"))
```