---
tags:
- "#college"
- "#python"
---

# Encapsulation
![](https://waytoeasylearn.com/wp-content/uploads/2021/11/Encapsulation.png)
- **Bundling Data and Methods:** Grouping data attributes and methods within a class.
- **Access Control:** Using naming conventions (_ and __) to indicate visibility.
- **Restricted Access:** Preventing direct modification of private attributes from outside the class.
- **Indirect Access:** Encouraging access through getter and setter methods.
- **Enhanced Control:** Improving data management, security, and code maintainability.
- **Reduced Complexity:** Promoting better organization and isolation of changes within the class.

### Achieving Encapsulation in Python

1. **Private Attributes and Methods:**
   In Python, encapsulation is implemented using naming conventions and by using underscores to indicate the visibility of attributes and methods.
   
   - Attributes or methods prefixed with a single underscore (`_attribute`) indicate that they are intended to be protected, suggesting to other developers that they are internal to the class or its subclasses.
   
   - Attributes or methods prefixed with double underscores (`__attribute`) are considered private. Python performs name mangling, changing the attribute name to prevent accidental access from outside the class.

### Example Demonstrating Encapsulation:

```python
class BankAccount:
    def __init__(self, account_number, balance):
        self._account_number = account_number  # Protected attribute
        self.__balance = balance  # Private attribute

    def deposit(self, amount):
        # Method to deposit money
        self.__balance += amount

    def get_balance(self):
        # Method to get balance (accessor)
        return self.__balance

    def _calculate_interest(self):
        # Protected method to calculate interest
        pass

# Creating an object of the BankAccount class
account = BankAccount("123456789", 1000)

# Attempting to access private attribute directly (will result in an AttributeError)
# print(account.__balance)

# Accessing private attribute indirectly using a method (get_balance)
print(account.get_balance())  # Output: 1000

# Attempting to access protected attribute directly (can be accessed but not recommended)
print(account._account_number)  # Output: 123456789
```

