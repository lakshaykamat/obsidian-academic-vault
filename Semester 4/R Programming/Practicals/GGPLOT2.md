## Scatter Plot
```R
# Create sample data
data <- data.frame(
  x = rnorm(100),
  y = rnorm(100)
)

# Create a scatter plot
ggplot(data, aes(x = x, y = y)) +
  geom_point() +
  labs(title = "Scatter Plot", x = "X-axis", y = "Y-axis") +
  theme_minimal()

```

## Histogram
```R
# Load ggplot2 library
library(ggplot2)

# Create sample data
data <- data.frame(values = rnorm(100))

# Create a histogram plot
ggplot(data, aes(x = values)) +
  geom_histogram(binwidth = 0.5, fill = "blue", color = "black") +
  labs(title = "Histogram", x = "Values", y = "Frequency") +
  theme_minimal()

```