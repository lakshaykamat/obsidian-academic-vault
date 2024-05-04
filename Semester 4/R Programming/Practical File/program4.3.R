# Create two matrices
matrix1 <- matrix(c(1, 2, 3, 4, 5, 6), nrow = 2, ncol = 3, byrow = TRUE)
matrix2 <- matrix(c(7, 8, 9, 10, 11, 12), nrow = 2, ncol = 3, byrow = TRUE)

# Print the matrices
print("Matrix 1:")
print(matrix1)
print("Matrix 2:")
print(matrix2)

# Addition
addition_result <- matrix1 + matrix2
print("Addition result:")
print(addition_result)

# Subtraction
subtraction_result <- matrix1 - matrix2
print("Subtraction result:")
print(subtraction_result)

# Element-wise multiplication
multiplication_result <- matrix1 * matrix2
print("Element-wise multiplication result:")
print(multiplication_result)

# Element-wise division
division_result <- matrix1 / matrix2
print("Element-wise division result:")
print(division_result)
