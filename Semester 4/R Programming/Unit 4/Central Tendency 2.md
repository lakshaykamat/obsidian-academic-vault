Measures of central tendency are statistical measures that represent the center or midpoint of a data distribution. In R, you can calculate various measures of central tendency such as mean, median, and mode using built-in functions. Here's how you can do it:

### 1. Mean

- **Definition:** The mean is the sum of all values in a dataset divided by the number of values. It is also referred to as the average.

- **Function:** `mean()`

- **Usage:**
  ```R
  mean_value <- mean(data_vector)
  ```

- **Example:**
  ```R
  # Example vector
  data_vector <- c(1, 2, 3, 4, 5)
  
  # Mean
  mean_value <- mean(data_vector)
  print(mean_value)
  ```

### 2. Median

- **Definition:** The median is the middle value in a sorted dataset. If the dataset has an odd number of values, the median is the middle value. If the dataset has an even number of values, the median is the average of the two middle values.

- **Function:** `median()`

- **Usage:**
  ```R
  median_value <- median(data_vector)
  ```

- **Example:**
  ```R
  # Example vector
  data_vector <- c(1, 2, 3, 4, 5)
  
  # Median
  median_value <- median(data_vector)
  print(median_value)
  ```

### 3. Mode

- **Definition:** The mode is the value that appears most frequently in a dataset. A dataset can have one mode, more than one mode (multimodal), or no mode (no value appears more than once).

- **Function:** There is no built-in function for mode calculation in base R. You can create a custom function to find the mode.

- **Example:**
  ```R
  # Custom function to find mode
  get_mode <- function(x) {
    ux <- unique(x)
    ux[which.max(tabulate(match(x, ux)))]
  }
  
  # Example vector
  data_vector <- c(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
  
  # Mode
  mode_value <- get_mode(data_vector)
  print(mode_value)
  ```

These measures help summarize the central tendency of data, providing insights into the typical or representative value in a dataset.