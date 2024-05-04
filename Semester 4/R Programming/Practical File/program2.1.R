# Q2.1 Write a program in R to convert matrix to 1 dimensional array

# Sample matrix
matrix_data <- matrix(1:9, nrow = 3)

# Convert matrix to 1-dimensional array
array_data <- as.vector(matrix_data)

# Print the original matrix and the converted array
print("Original Matrix:")
print(matrix_data)
print("Converted 1-D Array:")
print(array_data)
