# Create a matrix
my_matrix <- matrix(1:12, nrow = 4, byrow = TRUE)

# Display the matrix
print("Matrix:")
print(my_matrix)

# Access the element at third column and second row
element_3_2 <- my_matrix[2, 3]

# Access only the third row
row_3 <- my_matrix[3, ]

# Access only the fourth column
col_4 <- my_matrix[, 4]

# Print the results
print("Element at third column and second row:")
print(element_3_2)

print("Third row:")
print(row_3)

print("Fourth column:")
print(col_4)
