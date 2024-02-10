# Functions in R
Functions are blocks of code that perform a specific task or computation. They can be broadly categorized into two types: user-defined functions and built-in functions.

## 1. User-Defined Functions:
- **Definition:** Created by the user to perform a specific task or set of tasks.
- **Syntax:**
```R
     my_function <- function(arg1, arg2, ...) {
       # Code to perform tasks using arguments
       # Return a result if necessary
     }
```
- **Example:**
```R
     # User-defined function to calculate the square of a number
     square_function <- function(x) {
       result <- x^2
       return(result)
     }
     
     # Call the function
     result <- square_function(5)
     print(result)  # Output: 25
```

## 2. Built-in Functions:
- **Definition:** Pre-defined functions that come with R, providing a wide range of functionalities.
- **Syntax:**
```R
     result <- built_in_function(arg1, arg2, ...)
```
- **Example:**
```R
     # Built-in function to calculate the mean of a numeric vector
     numbers <- c(1, 2, 3, 4, 5)
     mean_value <- mean(numbers)
     print(mean_value)  # Output: 3
```

- **Common Built-in Functions:**
	- `mean()`: Calculates the mean of numeric values.
	- `sum()`: Computes the sum of numeric values.
	- `length()`: Returns the length of a vector or object.
	- `str()`: Displays the structure of an object.
	- `paste()`: Concatenates strings.
	- `grep()`: Searches for a pattern in a character vector.