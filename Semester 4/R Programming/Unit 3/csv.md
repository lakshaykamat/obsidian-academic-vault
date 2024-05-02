### Importing Data from CSV Files:
You can import data from CSV files into R using functions like `read.csv()` or `read.csv2()` depending on the delimiter used in your CSV file.

1. **Using `read.csv()` for Comma-Separated Files:**
   ```R
   # Read from a CSV file with comma as delimiter
   data <- read.csv("file.csv")
   ```

2. **Using `read.csv2()` for Semicolon-Separated Files:**
   ```R
   # Read from a CSV file with semicolon as delimiter
   data <- read.csv2("file.csv")
   ```

3. **Using `read.table()` with `sep` argument for Custom Separators:**
   ```R
   # Read from a CSV file with custom separator (e.g., tab)
   data <- read.table("file.csv", sep = "\t", header = TRUE)
   ```

### Exporting Data to CSV Files:
You can export data from R to a CSV file using the `write.csv()` function.

1. **Using `write.csv()`:**
   ```R
   # Export data to a CSV file
   write.csv(data, "file.csv", row.names = FALSE)
   ```

2. **Using `write.csv2()` for Semicolon-Separated CSV:**
   ```R
   # Export data to a semicolon-separated CSV file
   write.csv2(data, "file.csv", row.names = FALSE)
   ```

These functions allow you to seamlessly import data from CSV files into R and export data from R to CSV files. Remember to specify the correct file paths and options such as the separator and whether to include row names when using these functions.