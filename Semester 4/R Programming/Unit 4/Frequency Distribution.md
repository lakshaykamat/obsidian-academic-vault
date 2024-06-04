# Frequency Distribution
Frequency distribution in statistics is a summary of the frequency of values or ranges of values in a dataset. In R, you can create frequency distributions using various functions, such as `table()`, `hist()`, or `cut()` combined with `table()`. Here's how you can do it:

### 1. Using `table()`

- **Definition:** The `table()` function in R creates a frequency table, which counts the occurrences of unique values in a vector.

- **Usage:**
  ```R
  frequency_table <- table(data_vector)
  ```

- **Example:**
  ```R
  # Example vector
  data_vector <- c(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
  
  # Frequency table
  frequency_table <- table(data_vector)
  print(frequency_table)
  ```

### 2. Using `hist()`

- **Definition:** The `hist()` function in R creates a histogram, which represents the frequency distribution of continuous data by dividing it into intervals (bins) and counting the number of observations in each interval.

- **Usage:**
  ```R
  hist(data_vector, breaks = n_bins)
  ```

- **Example:**
  ```R
  # Example vector
  data_vector <- c(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
  
  # Histogram
  hist(data_vector, breaks = 4)
  ```

### 3. Using `cut()` with `table()`

- **Definition:** The `cut()` function in R divides continuous data into intervals (bins), and `table()` function is then used to create a frequency table of these intervals.

- **Usage:**
  ```R
  frequency_table <- table(cut(data_vector, breaks = bins))
  ```

- **Example:**
  ```R
  # Example vector
  data_vector <- c(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
  
  # Frequency table using cut() and table()
  frequency_table <- table(cut(data_vector, breaks = 3))
  print(frequency_table)
  ```

These methods allow you to create frequency distributions in R, providing insights into the distribution of data values, whether discrete or continuous.