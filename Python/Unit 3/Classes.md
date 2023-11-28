---
tags:
- "#college"
- "#python"
---

# Classes
In Python, a class is a blueprint or a template for creating objects (instances). It serves as a structure that defines the attributes (variables) and methods (functions) that will be associated with the objects created from it.

### Syntax of a Class:

```python
class ClassName:
    # Class attributes (shared by all instances)
    class_attribute = value
    
    def __init__(self, parameters):
        # Instance attributes (specific to each instance)
        self.instance_attribute = parameters
    
    def method(self):
        # Method definition
        # Access instance attributes using self
        pass
```

### Parts of a Class:

- **Class Name:** A name used to identify the class.
- **Attributes:** Variables that store data. They can be class attributes (shared by all instances) or instance attributes (specific to each instance).
- **Methods:** Functions that perform operations or actions related to the class or its instances. The `__init__` method is a special method used to initialize instance attributes.
- **self:** Refers to the instance itself and is used to access instance attributes and methods within the class.

### Example of a Class:

```python
class Car:
    # Class attribute
    wheels = 4
    
    def __init__(self, make, model):
        # Instance attributes
        self.make = make
        self.model = model
    
    def display_info(self):
        return f"{self.make} {self.model} has {self.wheels} wheels."

# Creating objects (instances) of the Car class
car1 = Car("Toyota", "Corolla")
car2 = Car("Honda", "Civic")

# Accessing instance attributes and calling methods
print(car1.display_info())  # Output: Toyota Corolla has 4 wheels.
print(car2.display_info())  # Output: Honda Civic has 4 wheels.
```

### Important Points about Classes:
- Objects (instances) are created by calling the class as if it were a function.
- The `__init__` method is called automatically when an object is created to initialize its attributes.
- Attributes and methods can be accessed using the dot notation (`object.attribute` or `object.method()`).
- Classes facilitate the creation of multiple objects with similar attributes and behaviors, promoting code reusability and organization.

## `__init__` method
In Python, the `__init__` method (short for "initialize") is a special method, also known as the constructor method. It is automatically called when an object (instance) of a class is created. The primary purpose of `__init__` is to initialize the attributes of the newly created object.

### Syntax of the `__init__` Method:
```python
class ClassName:
    def __init__(self, parameter1, parameter2, ...):
        self.attribute1 = parameter1
        self.attribute2 = parameter2
        # ... other attribute assignments
```

### Key Points about `__init__` Method:
- The `__init__` method is called automatically when an object is instantiated from a class using the class name followed by parentheses, which may contain arguments for the `__init__` method.
- It initializes the attributes of the object by assigning initial values based on the arguments passed.
- The first parameter of `__init__` is typically named `self`, which refers to the instance itself. It is used to access and modify the object's attributes within the class.
- Inside `__init__`, attributes are created and initialized using the `self` keyword followed by the attribute name.

### Example:
```python
class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

# Creating objects (instances) of the Person class
person1 = Person("Alice", 30)
person2 = Person("Bob", 25)

# Accessing instance attributes initialized by __init__
print(person1.name)  # Output: Alice
print(person2.age)   # Output: 25
```

