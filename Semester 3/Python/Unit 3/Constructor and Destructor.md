---
tags:
- "#college"
- "#python"
---

# Constructor and Destructor

| Aspect           | Constructor (`__init__`)                                        | Destructor (`__del__`)                                                                          |
| ---------------- | --------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| Purpose          | Initializes the object's attributes or state upon creation      | Performs cleanup tasks before the object is destroyed or deallocated                            |
| Invocation       | Called automatically when an object is created                  | Called automatically when the object is about to be destroyed                                   |
| Naming           | `__init__` is the name of the constructor method                | `__del__` is the name of constructor method                                                     |
| Usage            | constructor method defines initializations, assignments, setuo  | Defines cleanup operations, releasing resources, final operations before object                 |
| Arguments        | Takes `self` and additional parameter for object initialization | Take `self`  only                                                                               |
| Creation Control | Control the creation of object state and attributes             | Does not control object destruction; it's invoked automatically by the Python garbage collector |
|        Usage     |             `def init(self,param):   self.param = param`   |   `def __del__(self): #Cleanup`                                                                              |