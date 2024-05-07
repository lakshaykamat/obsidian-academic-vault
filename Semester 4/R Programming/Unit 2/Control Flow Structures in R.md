## Control Flow Structures in R

Conditional statements, loops, and switch statements (although less common in R) are all control flow structures that allow you to write code that behaves differently depending on certain conditions. Here's a breakdown of each:

### 1. Conditional Statements

#### if-else Statement
This is the most basic conditional statement. It allows you to execute different code blocks based on whether a condition is TRUE or FALSE.

```R
age <- 20
if (age >= 18) {
  print("You are eligible to vote.")
} else {
  print("You are not eligible to vote.")
}
```

#### If-else if Statement
This extends the `if` statement by allowing you to check multiple conditions sequentially.

```R
grade <- 85
if (grade >= 90) {
  print("Excellent!")
} else if (grade >= 80) {
  print("Very Good!")
} else {
  print("Good try!")
}
```

### 2. Loops

Loops allow you to repeatedly execute a block of code a specific number of times or until a certain condition is met. Here are two common loop types:

#### For Loop
This loop iterates a set number of times based on a counter variable.

```R
# Print numbers from 1 to 5
for (i in 1:5) {
  print(i)
}
```

#### While Loop
This loop continues executing the code block as long as a condition remains TRUE.

```R
# Count up to 10, but stop if the value is divisible by 3
i <- 1
while (i <= 10 & i %% 3 != 0) {
  print(i)
  i <- i + 1
}
```

### 3. Switch Statements (Less Common in R)

Switch statements, while not as widely used in R compared to if-else statements, allow you to evaluate an expression and execute code based on the matching outcome.

```R
# (This can be achieved more clearly with if-else statements)
fruit <- "apple"
switch (fruit,
  "apple" = print("This is an apple."),
  "banana" = print("This is a banana."),
  TRUE = print("This is not a recognized fruit.")
)
```

### Choosing the Right Structure

- Use `if-else` statements for simple conditions and decisions.
- Use `if-else if` for checking multiple conditions sequentially.
- Use `for` loops when you know the number of iterations beforehand.
- Use `while` loops for repetitive tasks where the end condition is unknown initially.
- While switch statements exist, `if-else` statements are generally preferred in R for readability and maintainability.

By mastering these control flow structures, you can write R code that is more flexible, adaptable, and efficient in handling various scenarios within your data analysis tasks.