# Maximum and Minimum in R

#### 1. **Finding Maximum and Minimum Values**

   - **Definition:** In R programming, the maximum and minimum values of a vector or a data frame column can be found using the `max()` and `min()` functions, respectively.
   
   - **Usage:**
     ```R
     max_value <- max(x)
     min_value <- min(x)
     ```
   
   - **Example:**
     ```R
     # Example vector
     x <- c(3, 8, 2, 10, 5)
     
     # Maximum value
     max_value <- max(x)  # Output: 10
     
     # Minimum value
     min_value <- min(x)  # Output: 2
     ```

#### 2. **Finding Maximum and Minimum Across Multiple Vectors or Columns**

   - **Definition:** You can find the maximum and minimum values across multiple vectors or columns by passing multiple arguments to the `max()` or `min()` functions.
   
   - **Usage:**
     ```R
     max_value <- max(data$A, data$B)
     min_value <- min(data$A, data$B)
     ```
   
   - **Example:**
     ```R
     # Example data frame
     data <- data.frame(
       A = c(3, 8, 2, 10, 5),
       B = c(7, 1, 4, 6, 9)
     )
     
     # Maximum value across columns
     max_value <- max(data$A, data$B)  # Output: 10
     
     # Minimum value across columns
     min_value <- min(data$A, data$B)  # Output: 1
     ```

#### 3. **Finding Indices of Maximum and Minimum Values**

   - **Definition:** The `which.max()` and `which.min()` functions in R are used to find the indices of the maximum and minimum values within a vector, respectively.
   
   - **Usage:**
     ```R
     max_index <- which.max(x)
     min_index <- which.min(x)
     ```
   
   - **Example:**
     ```R
     # Indices of maximum and minimum values
     max_index <- which.max(x)  # Output: 4 (index of maximum value in vector x)
     min_index <- which.min(x)  # Output: 3 (index of minimum value in vector x)
     ```

These functions are fundamental in data analysis and are commonly used in statistical computations and data manipulation tasks in R.