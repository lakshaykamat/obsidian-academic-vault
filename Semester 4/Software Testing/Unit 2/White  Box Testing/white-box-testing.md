# White Box Testing

White-box testing looks inside a software application. It checks how the internal structure, logic, and code work. Unlike black-box testing, where we don't look inside and just check if it works, white-box testing understands how the software is built.

## White-Box Testing: Features, Advantages, and Disadvantages

### Features:

1. **Internal Knowledge:** Understand how the software works inside.
2. **Code Visibility:** Look at the actual code for testing.
3. **Structural Testing:** Check how the different parts and logic of the software are built.
4. **Various Levels:** Use it at different stages of making software.

### Advantages:

1. **Thorough Coverage:** Check everything in the code.
2. **Early Defect Detection:** Find problems early in making the software.
3. **Security Testing:** Look for ways bad people could break in.
4. **Optimized Code:** Make the code work better.
5. **Debugging Support:** Help find and fix problems in the code.

### Disadvantages:

1. **Limited External Perspective:** Might miss problems from how people use the software.
2. **Code Dependency:** Needs access to the code, which is not always possible.
3. **Complexity and Time-Consuming:** Takes a lot of time, especially for complex software.
4. **Not Ideal for UI Testing:** Doesn't work well for checking how the user interface looks.
5. **May Overlook Integration Issues:** Could miss problems when different parts of the software work together.

## Statement Coverage

Statement coverage checks how many lines of code have been tested. For example, if your software has 100 lines, and your tests go through 80 of them, you have 80% statement coverage.

### Importance

- **Thoroughness:** It shows how much of the code has been tested.
- **Bugs Detection:** Helps find basic mistakes or problems in the code.

### Limitations

- **Superficial Coverage:** Just testing every line doesn't mean all possibilities are checked.
- **Quality vs. Quantity:** Testing a lot doesn't mean the tests are good enough to find complex problems.

![Statement Coverage](https://media.geeksforgeeks.org/wp-content/uploads/StCov.png)

## Branch Coverage

Branch coverage checks if different choices in the code (like "if" statements) have been tested. It makes sure both "yes" and "no" options are checked.

### Importance

- **Decision Points:** Focuses on important choices in the code.
- **Comprehensive Testing:** Makes sure different logical paths are checked for problems.

### Limitation

- **Superficial Decision Coverage:** Testing every choice doesn't guarantee a perfect program.
- **Complexity:** It's hard to check every choice, especially in complex software.
- **Quality vs. Quantity:** Many tests are good, but they should also be good at finding problems.

![Branch Coverage](https://media.geeksforgeeks.org/wp-content/uploads/BrCov.png)

## Condition Coverage

Condition coverage checks if every condition inside choices has been tested. For example, if there's an "if" statement with many conditions, it makes sure each condition is tested as "true" and "false."

### Importance

- **Fine-Grained Testing:** Checks small details in the choices.
- **Increased Assurance:** Makes sure different conditions in a choice are tested.

### Limitations

- **Combinatorial Explosion:** Checking every condition in complex choices can take too much time.
- **Doesn't Guarantee Path Coverage:** Even if each condition is checked, not all paths through the code are tested.
- **Focus on Execution, Not Logic:** Checks if conditions work, but might miss problems in how conditions work together.

## Path Testing

Path testing looks at different routes (paths) through the code. It ensures that every possible sequence of statements and branches has been tested.

### Importance

- **Comprehensive Exploration:** Covers all possible paths in the code.
- **Complexity Detection:** Helps find problems in how different parts of the code interact.

### Limitations

- **Expensive:** Testing every path can take a lot of time and effort.
- **Infeasible in Large Programs:** For big programs, testing every path might not be practical.
- **Overlap with Other Techniques:** Path testing can sometimes overlap with other testing methods, making it less efficient.