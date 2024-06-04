In R, there are many built-in functions and packages for working with different statistical distributions. Here are some common statistical distributions along with example code demonstrating their usage:

### 1. Normal Distribution

- **Function:** `rnorm()`, `dnorm()`, `pnorm()`, `qnorm()`

```R
# Generate random numbers from a normal distribution
random_data <- rnorm(1000, mean = 0, sd = 1)

# Plot histogram of the generated data
hist(random_data, breaks = 30, main = "Histogram of Normal Distribution")

# Calculate probability density function (pdf) at specific points
density_at_0 <- dnorm(0, mean = 0, sd = 1)
print(density_at_0)

# Calculate cumulative distribution function (cdf) at specific points
probability_less_than_1 <- pnorm(1, mean = 0, sd = 1)
print(probability_less_than_1)

# Calculate quantile function (inverse cdf) at specific probabilities
quantile_at_90_percent <- qnorm(0.9, mean = 0, sd = 1)
print(quantile_at_90_percent)
```

### 2. Binomial Distribution

- **Function:** `rbinom()`, `dbinom()`, `pbinom()`, `qbinom()`

```R
# Generate random numbers from a binomial distribution
random_data <- rbinom(1000, size = 10, prob = 0.5)

# Plot histogram of the generated data
hist(random_data, breaks = 11, main = "Histogram of Binomial Distribution")

# Calculate probability mass function (pmf) at specific points
probability_of_5_successes <- dbinom(5, size = 10, prob = 0.5)
print(probability_of_5_successes)

# Calculate cumulative distribution function (cdf) at specific points
probability_less_than_5_successes <- pbinom(5, size = 10, prob = 0.5)
print(probability_less_than_5_successes)

# Calculate quantile function (inverse cdf) at specific probabilities
quantile_at_90_percent <- qbinom(0.9, size = 10, prob = 0.5)
print(quantile_at_90_percent)
```

### 3. Poisson Distribution

- **Function:** `rpois()`, `dpois()`, `ppois()`, `qpois()`

```R
# Generate random numbers from a Poisson distribution
random_data <- rpois(1000, lambda = 3)

# Plot histogram of the generated data
hist(random_data, breaks = 20, main = "Histogram of Poisson Distribution")

# Calculate probability mass function (pmf) at specific points
probability_of_2_occurrences <- dpois(2, lambda = 3)
print(probability_of_2_occurrences)

# Calculate cumulative distribution function (cdf) at specific points
probability_less_than_5_occurrences <- ppois(5, lambda = 3)
print(probability_less_than_5_occurrences)

# Calculate quantile function (inverse cdf) at specific probabilities
quantile_at_90_percent <- qpois(0.9, lambda = 3)
print(quantile_at_90_percent)
```

These are just a few examples of statistical distributions in R. Depending on your specific needs, you can explore other distributions and their corresponding functions in R documentation or specific packages tailored to your analysis.

Sure, here's a brief explanation of each of these functions commonly used in R for working with the normal distribution:

1. **`rnorm()` - Random Number Generation from a Normal Distribution:**

   - **Definition:** The `rnorm()` function is used to generate random numbers from a normal (Gaussian) distribution with specified mean and standard deviation.

   - **Parameters:**
     - `n`: Number of random numbers to generate.
     - `mean`: Mean of the distribution.
     - `sd`: Standard deviation of the distribution.

   - **Usage:**
     ```R
     rnorm(n, mean = 0, sd = 1)
     ```

2. **`dnorm()` - Probability Density Function (PDF) of the Normal Distribution:**

   - **Definition:** The `dnorm()` function calculates the probability density function (PDF) of the normal distribution at a given set of points.

   - **Parameters:**
     - `x`: Vector of points at which to evaluate the PDF.
     - `mean`: Mean of the distribution.
     - `sd`: Standard deviation of the distribution.

   - **Usage:**
     ```R
     dnorm(x, mean = 0, sd = 1)
     ```

3. **`pnorm()` - Cumulative Distribution Function (CDF) of the Normal Distribution:**

   - **Definition:** The `pnorm()` function calculates the cumulative distribution function (CDF) of the normal distribution at a given set of points.

   - **Parameters:**
     - `q`: Vector of points at which to evaluate the CDF.
     - `mean`: Mean of the distribution.
     - `sd`: Standard deviation of the distribution.

   - **Usage:**
     ```R
     pnorm(q, mean = 0, sd = 1)
     ```

4. **`qnorm()` - Quantile Function (Inverse CDF) of the Normal Distribution:**

   - **Definition:** The `qnorm()` function calculates the quantile function (inverse CDF) of the normal distribution for a given set of probabilities.

   - **Parameters:**
     - `p`: Vector of probabilities for which to calculate the quantiles.
     - `mean`: Mean of the distribution.
     - `sd`: Standard deviation of the distribution.

   - **Usage:**
     ```R
     qnorm(p, mean = 0, sd = 1)
     ```

These functions are fundamental for generating random numbers from a normal distribution, calculating probabilities, and performing various statistical analyses involving the normal distribution in R.