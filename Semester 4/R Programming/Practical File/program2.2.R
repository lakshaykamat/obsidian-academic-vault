# Q2.2 Write a program in R to create an array of two 3X3 matrix each 3 column and 3 rows from given two vectors

# Given vectors
vector1 <- 1:9
vector2 <- 10:18

# Reshape vectors into 3x3 matrices
matrix1 <- matrix(vector1, nrow = 3)
matrix2 <- matrix(vector2, nrow = 3)

# Combine matrices into a 3-dimensional array
array_data <- array(c(matrix1, matrix2), dim = c(3, 3, 2))

# Print the array of matrices
print(array_data)

