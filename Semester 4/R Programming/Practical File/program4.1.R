# Prompt the user to input numbers separated by spaces
cat("Enter numbers separated by spaces: ")
input_vector <- scan()

# Determine the number of rows and columns
n_elements <- length(input_vector)
n_cols <- readline(prompt = "Enter the number of columns: ")
n_rows <- n_elements / as.numeric(n_cols)

# Create a matrix with user input
my_matrix <- matrix(input_vector, nrow = n_rows, ncol = as.numeric(n_cols), byrow = TRUE)

# Display the matrix
print("Matrix:")
print(my_matrix)
