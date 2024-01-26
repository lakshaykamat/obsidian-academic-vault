---
tags:
- "#college"
- "#python"
---

# Assignment 3

## Attempt all the questions
### a) What is a Class?
   - In Python, a class is a blueprint or a template for creating objects. It defines attributes (variables) and methods (functions) that characterize the objects created from it. It encapsulates data and behavior in a single unit.

### b) What is an Object?
   - An object is an instance of a class. It is a tangible entity created from a class that embodies the properties and behaviors defined within the class. Each object has its unique state (attributes) and behavior (methods).

### c)What is `__init__()` method in Python?
   - `__init__()` is a special method (also known as the constructor) in Python classes. It is automatically called when an object is created from a class. This method initializes the object's attributes and performs any necessary setup operations.

### d)What is `__del__()` method in Python?
   - `__del__()` is a special method (also known as the destructor) in Python classes. It is invoked just before an object is destroyed or garbage collected. This method is used to perform cleanup actions, release resources, or perform any necessary finalization before the object is removed from memory.

These methods (`__init__()` and `__del__()`), along with others like `__repr__()`, `__str__()`, etc., are special methods in Python that enable customized behavior within classes and objects.
## Q2. What are OOP's Concepts
Object-Oriented Programming (OOP) is a programming paradigm that uses the concept of "objects" to design applications and organize code. In Python, OOP revolves around the following key concepts:

1. **Classes and Objects:**
   - **Class:** A blueprint or template that defines the attributes (data) and methods (functions) common to all objects of the same type. It acts as a blueprint for creating objects.
   - **Object:** An instance of a class. It encapsulates data (attributes) and behaviors (methods) specified by the class.

2. **Encapsulation:**
   - Encapsulation refers to the bundling of data (attributes) and methods (functions) that operate on the data within a single unit (class). It hides the internal state of an object from the outside world and only exposes necessary interfaces to interact with it.

3. **Inheritance:**
   - Inheritance allows a class (called a subclass or derived class) to inherit properties and behaviors from another class (called a superclass or base class). It promotes code reusability and supports the creation of a hierarchical class structure.

4. **Polymorphism:**
   - Polymorphism refers to the ability of different classes to be treated as objects of a common superclass. It allows objects of different classes to be used interchangeably based on a common interface, promoting flexibility and extensibility.

5. **Abstraction:**
   - Abstraction focuses on providing a simplified view of complex systems by hiding unnecessary implementation details and showing only essential features. It allows the creation of abstract classes that define interfaces without providing full implementation details.

**Example:**

```python
# Example demonstrating OOP concepts in Python

# Class definition (Encapsulation)
class Animal:
    def __init__(self, name):
        self.name = name  # Attribute (Encapsulation)

    def make_sound(self):
        pass  # Abstract method

# Inheritance
class Dog(Animal):
    def make_sound(self):
        return "Woof!"  # Polymorphism

# Creating objects (Objects)
dog = Dog("Buddy")
print(f"Name: {dog.name}")  # Accessing attribute
print(f"Sound: {dog.make_sound()}")  # Accessing method
```
## Q3. What is Inheritance in Python? Explain each type with diagram?
Inheritance in Python is a powerful feature that allows a new class (derived class or subclass) to inherit properties, methods, and attributes from an existing class (base class or superclass). It promotes code reusability and establishes a hierarchical relationship between classes.

### Types of Inheritance in Python:

1. **Single Inheritance:**
   - Single inheritance occurs when a derived class inherits from only one base class.
   - Diagram:
     ```
     BaseClass
         |
      DerivedClass
     ```
   - Example:
     ```python
     class Animal:
         def sound(self):
             print("Some sound")

     class Dog(Animal):
         def bark(self):
             print("Woof!")
     ```
   
2. **Multiple Inheritance:**
   - Multiple inheritance occurs when a derived class inherits from multiple base classes.
   - Example:
     ```python
     class A:
         def method_A(self):
             print("Method A")

     class B:
         def method_B(self):
             print("Method B")

     class C(A, B):
         def method_C(self):
             print("Method C")
     ```

3. **Multilevel Inheritance:**
   - Multilevel inheritance occurs when a class is derived from a class, which is also derived from another class.
   - Example:
     ```python
     class A:
         def method_A(self):
             print("Method A")

     class B(A):
         def method_B(self):
             print("Method B")

     class C(B):
         def method_C(self):
             print("Method C")
     ```

4. **Hierarchical Inheritance:**
   - Hierarchical inheritance occurs when multiple classes are derived from a single base class
   - Example:
     ```python
     class Animal:
         def sound(self):
             print("Some sound")

     class Dog(Animal):
         def bark(self):
             print("Woof!")

     class Cat(Animal):
         def meow(self):
             print("Meow!")
     ```
![](https://static.javatpoint.com/images/core/typesofinheritance.jpg)

## Q4.Explain the concept of Random module in Python with example.
The `random` module in Python is a built-in module that provides functionalities for generating random numbers, sequences, and performing random selections. It's commonly used in various applications such as games, simulations, statistical sampling, and cryptography.

### Basic Functionalities of `random` module:

1. **Generating Random Numbers:**
   - `random()` function: Generates a random float in the range [0.0, 1.0).
     ```python
     import random

     # Generate a random float between 0.0 and 1.0
     rand_num = random.random()
     print(rand_num)
     ```

2. **Generating Random Integers:**
   - `randint(a, b)` function: Generates a random integer in the range [a, b].
     ```python
     import random

     # Generate a random integer between 1 and 10
     rand_int = random.randint(1, 10)
     print(rand_int)
     ```

3. **Random Choices and Sampling:**
   - `choice(seq)` function: Selects a random element from a sequence.
   - `sample(population, k)` function: Generates a random sample of size `k` from a population without replacement.
     ```python
     import random

     colors = ['Red', 'Blue', 'Green', 'Yellow']

     # Select a random color
     rand_color = random.choice(colors)
     print(rand_color)

     # Generate a random sample of 2 colors without replacement
     rand_sample = random.sample(colors, 2)
     print(rand_sample)
     ```

4. **Shuffling Sequences:**
   - `shuffle(seq)` function: Shuffles a sequence in-place.
     ```python
     import random

     deck = ['Ace', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'Jack', 'Queen', 'King']

     # Shuffle the deck of cards
     random.shuffle(deck)
     print(deck)
     ```

The `random` module provides various other functions like `uniform(a, b)` for generating random floats in a specific range, `randrange(start, stop, step)` for generating random integers within a given range with a specified step, among others.

These functionalities provided by the `random` module enable developers to introduce randomness into their programs, perform simulations, and make random selections or assignments within their applications.