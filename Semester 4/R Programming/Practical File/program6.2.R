# Create a vector
my_vector <- c(1, 2, 3)

# Create a matrix
my_matrix <- matrix(1:6, nrow = 2)

# Create another list
inner_list <- list("A", "B", "C")

# Create the main list with named elements
my_list <- list(vec = my_vector, mat = my_matrix, lst = inner_list)

# Access the first and second elements of the list by name
first_element <- my_list$vec
second_element <- my_list$mat

# Print the first and second elements
print("First Element (Vector):")
print(first_element)

print("Second Element (Matrix):")
print(second_element)
