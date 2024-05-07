# Logical Operators in R

Logical operators are fundamental building blocks in R for performing conditional evaluations and making decisions within your code. They operate on logical values (`TRUE` or `FALSE`) and return a logical value as a result.

## Basic Operators

### `&` (AND)
Returns `TRUE` only if both operands are `TRUE`.

```r
x <- 5 > 3  # TRUE
y <- 0 == 0  # TRUE
x & y       # TRUE (both operands are TRUE)
```

### `|` (OR)
Returns `TRUE` if at least one operand is `TRUE`.

```r
x <- 5 > 3  # TRUE
y <- 0 == 1  # FALSE
x | y       # TRUE (one operand is TRUE)
```

### `!` (NOT)
Negates the operand. Returns `TRUE` if the operand is `FALSE`, and vice versa.

```r
x <- 5 > 3  # TRUE
!x          # FALSE (negates TRUE)
```

## Element-wise vs. Vectorized Operations

### Base R Operators (`&`, `|`, `!`)
These work on a character-by-character basis when applied to vectors of logical values. They only consider the first element from each vector and return a single logical value.

```r
x <- c(TRUE, FALSE, TRUE)
y <- c(FALSE, TRUE, FALSE)
x & y       # only considers the first element (TRUE & FALSE), resulting in FALSE
```

### Vectorized Operators (`&&`, `||`, `!`)
These provide element-wise operations, meaning they compare corresponding elements in vectors and return a vector of logical values.

```r
x <- c(TRUE, FALSE, TRUE)
y <- c(FALSE, TRUE, FALSE)
x && y       # TRUE, FALSE, FALSE (compares each element)
```

## Important Considerations

- When working with vectors of logical values, ensure you're using vectorized operators (`&&`, `||`, `!`) for element-wise comparisons.
- Logical operators can be combined to create complex conditional expressions.
- R also provides relational operators (`==`, `!=`, `<`, `>`, `<=`, `>=`) that compare values and return `TRUE` or `FALSE`.
