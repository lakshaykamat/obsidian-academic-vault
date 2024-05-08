### S 3 Class Example:

```r
# Define an S3 class
circle <- list(
  radius = 0,
  area = function(x) pi * x$radius^2
)

# Create an object of S3 class
my_circle <- circle
my_circle$radius <- 5

# Access object's attributes and methods
print(my_circle$area())  # Output: 78.53982
```

### S 4 Class Example:

```r
# Define an S4 class
setClass("Rectangle",
         slots = list(length = "numeric", width = "numeric"),
         prototype = list(length = 0, width = 0),
         representation = representation(length = "numeric", width = "numeric"))

# Create an object of S4 class
my_rectangle <- new("Rectangle", length = 5, width = 3)

# Access object's slots and methods
print(slot(my_rectangle, "length"))  # Output: 5
print(slot(my_rectangle, "width"))   # Output: 3
print(slot(my_rectangle, "area"))    # Output: Error: no slot of name "area" for this object of class "Rectangle"
```

### Reference Class (RC) Example:

```r
# Load reference package
library(reference)

# Define a reference class
Circle <- setRefClass("Circle",
                      fields = list(radius = "numeric"),
                      methods = list(
                        area = function() {
                          pi * self$radius^2
                        }
                      ))

# Create an object of reference class
my_circle <- Circle$new(radius = 5)

# Access object's fields and methods
print(my_circle$area())  # Output: 78.53982
```
