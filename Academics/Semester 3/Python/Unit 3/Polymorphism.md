---
tags:
- "#college"
- "#python"
---

# Polymorphism
Polymorphism is a core concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables a single interface to be used for entities of different types, providing flexibility and extensibility in the code.

### Key Points about Polymorphism:

1. **Same Interface, Different Implementations:**
   - Polymorphism allows objects to be accessed or manipulated through a common interface, regardless of their specific class types.
   
2. **Method Overriding:**
   - Subclasses can provide their own specific implementation of methods defined in their superclass.
   
3. **Dynamic Binding/Runtime Polymorphism:**
   - The decision of which method to execute is made at runtime, based on the actual object type rather than the declared type.

4. **Use of Inheritance:**
   - Polymorphism is closely linked with inheritance, where subclasses inherit and override methods from their superclass.

5. **Example:**

```python
class Animal:
    def make_sound(self):
        pass

class Dog(Animal):
    def make_sound(self):
        return "Woof!"

class Cat(Animal):
    def make_sound(self):
        return "Meow!"

# Using the common interface for different objects
def animal_sound(animal):
    return animal.make_sound()

# Creating objects of different types
dog = Dog()
cat = Cat()

# Calling the same method for different objects
print(animal_sound(dog))  # Output: Woof!
print(animal_sound(cat))  # Output: Meow!
```

In this example:

- `Animal` is a superclass with the method `make_sound()`.
- `Dog` and `Cat` are subclasses of `Animal` that override the `make_sound()` method.
- The `animal_sound()` function accepts any object of type `Animal` (or its subclasses) and calls the `make_sound()` method without knowing the specific object type. This demonstrates polymorphic behavior, where the same method name (`make_sound()`) is used for different object types, and the correct method implementation is executed based on the actual object being passed.