# Q3.2. WAP to create data frame from four given vectors

# Given vectors
vector1 <- c(1, 2, 3, 4)
vector2 <- c("A", "B", "C", "D")
vector3 <- c(TRUE, FALSE, TRUE, FALSE)
vector4 <- c(10.5, 20.3, 15.2, 25.7)

# Create dataframe from the given vectors
df <- data.frame(Vector1 = vector1, Vector2 = vector2, Vector3 = vector3, Vector4 = vector4)

# Print the dataframe
print(df)
