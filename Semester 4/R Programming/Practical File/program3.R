# Q3. Write a program in R to create a vector which contains 10 random integer values b/w -50 to 50.

s = sample(-50:50,10)
print("Content of vector:")
print("10 random integer values b/w -50 and 50:")
print(s)

# With Replacement
s = sample(-50:50,10,replace = TRUE)
print("Content of vector:")
print("10 random integer values b/w -50 and 50:")
print(s)

# With set.seed()
set.seed(5)
s = sample(-50:50,10,replace = TRUE)
print("Content of vector:")
print("10 random integer values b/w -50 and 50:")
print(s)