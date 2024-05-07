### S 3 Class Example:

```r
# Define a function to create Person objects
create_person <- function(name, age) {
  person <- list(name = name, age = age)
  class(person) <- "Person"
  return(person)
}

# Define a method for printing Person objects
print.Person <- function(x) {
  cat("Person:", x$name, "\n")
  cat("Age:", x$age, "\n")
}

# Create a Person object
john <- create_person("John", 30)

# Print the Person object
print(john)
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
