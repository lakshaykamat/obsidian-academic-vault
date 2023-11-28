---
tags:
- "#college"
- "#python"
---

# Inheritance
Inheritance in Python is a powerful feature of object-oriented programming (OOP) that allows a class (subclass/child class) to inherit attributes and methods from another class (superclass/parent class). This enables the creation of a hierarchical structure among classes, promoting code reusability and reducing redundancy.

### Key Points about Inheritance:

1. **Superclass and Subclass Relationship:**
   - Superclass (Parent Class): The class whose attributes and methods are inherited.
   - Subclass (Child Class): The class that inherits attributes and methods from the superclass.

2. **Syntax for Creating Subclasses:**
   ```python
   class ParentClass:
       # Attributes and methods
   
   class ChildClass(ParentClass):
       # Additional attributes and methods
   ```

3. **Inherited Attributes and Methods:**
   - A subclass automatically inherits all attributes and methods from its superclass.
   
4. **Method Overriding:**
   - Subclasses can provide their own implementation (override) for methods defined in the superclass.
   
5. **Access to Superclass Methods:**
   - Subclasses can access methods from the superclass using the `super()` function.
   
6. **Example:**

```python
# Parent class
class Animal:
    def __init__(self, species):
        self.species = species

    def make_sound(self):
        return "Some generic sound"

# Subclass inheriting from Animal
class Dog(Animal):
    def __init__(self, species, breed):
        super().__init__(species)
        self.breed = breed

    def make_sound(self):
        return "Woof!"

# Subclass inheriting from Animal
class Cat(Animal):
    def __init__(self, species, color):
        super().__init__(species)
        self.color = color

    def make_sound(self):
        return "Meow!"

# Creating objects of subclasses
dog = Dog("Canine", "Labrador")
cat = Cat("Feline", "Siamese")

# Accessing inherited attributes and methods
print(dog.species)         # Output: Canine
print(cat.make_sound())    # Output: Meow!
```

In this example:

- `Animal` is the superclass with attributes and methods common to all animals.
- `Dog` and `Cat` are subclasses that inherit attributes and methods from `Animal`.
- Subclasses override the `make_sound()` method to provide specific sounds for dogs and cats.
- Instances of `Dog` and `Cat` can access both their own attributes/methods and those inherited from `Animal`.

## Types of Inheritance
In Python, inheritance supports different types based on the way subclasses inherit attributes and methods from their superclasses. Here are the common types of inheritance:

### 1. Single Inheritance:
   - **Description:** A subclass inherits from only one superclass.
   - **Example:**
     ```python
     class Animal:
         pass

     class Dog(Animal):
         pass
     ```

### 2. Multiple Inheritance:
   - **Description:** A subclass inherits from multiple superclasses.
   - **Example:**
     ```python
     class Car:
         pass

     class Boat:
         pass

     class AmphibiousVehicle(Car, Boat):
         pass
     ```

### 3. Multilevel Inheritance:
   - **Description:** Involves a chain of inheritance where one class extends another, forming a hierarchy.
   - **Example:**
     ```python
     class Animal:
         pass

     class Mammal(Animal):
         pass

     class Dog(Mammal):
         pass
     ```

### 4. Hierarchical Inheritance:
   - **Description:** Multiple subclasses inherit from a single superclass.
   - **Example:**
     ```python
     class Vehicle:
         pass

     class Car(Vehicle):
         pass

     class Motorcycle(Vehicle):
         pass
     ```

### 5. Hybrid (or Cyclic) Inheritance:
   - **Description:** A combination of multiple types of inheritance.
   - **Example:**
     ```python
     class A:
         pass

     class B(A):
         pass

     class C(A):
         pass

     class D(B, C):
         pass
     ```

![](https://static.javatpoint.com/tutorial/typescript/images/typescript-classes-types-of-inheritance.png)