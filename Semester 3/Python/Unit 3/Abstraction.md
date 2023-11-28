---
tags:
- "#college"
- "#python"
---

# Abstraction
1. **Hides Complex Details:**
   - Abstraction conceals complex inner workings, showing only essential features to users.
   
2. **Focuses on Essential Information:**
   - Emphasizes what an object does, rather than how it does it, simplifying usage.
   
3. **Using Interfaces or Abstract Classes:**
   - Interfaces or abstract classes define a structure with method signatures but no implementations.
   
4. **Achieved Through Encapsulation:**
   - Encapsulation bundles data and methods, controlling access and supporting abstraction.
   
5. **Improves Code Maintainability:**
   - Simplifies understanding and maintenance by isolating complex details.

### Example Demonstrating Abstraction:

```python
from abc import ABC, abstractmethod

# Abstract class defining an interface for Shapes
class Shape(ABC):
    @abstractmethod
    def area(self):
        pass

# Concrete subclass implementing the Shape interface
class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius
    
    def area(self):
        return 3.14159 * self.radius * self.radius

class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width
    
    def area(self):
        return self.length * self.width

# Usage without knowing internal complexities
circle = Circle(5)
rectangle = Rectangle(4, 6)

print(circle.area())     # Output: 78.53975
print(rectangle.area())  # Output: 24
```

In this example:

- `Shape` is an abstract class defining an interface with an abstract method `area()`.
- `Circle` and `Rectangle` are concrete subclasses that inherit from `Shape` and implement the `area()` method.
- Users can create instances of shapes (`Circle` and `Rectangle`) and use the `area()` method without understanding the internal calculations. The abstraction hides the complexities of calculating the area, providing a simple interface for users.