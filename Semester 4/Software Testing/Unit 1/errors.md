# Types of Possible Errors

To comprehend various debugging approaches, it's essential to understand the types of errors that can occur in a program. Errors typically fall into three categories:

## 1. Build and Compile-Time Errors

- **Description:** Occur during the development stage when the code is being built.
- **Identification:** Thrown by the compiler or interpreter while building the source code.
- **Prevention:** Prevent the application from starting.
- **Common Causes:** Syntax errors (e.g., missing semicolons, class not found).
- **Detection:** Easily spotted and rectified, often identified by IDEs or compilers.

## 2. Runtime Errors

- **Description:** Occur during the execution of the application.
- **Identification:** Arise when there are no compiler or syntax errors in the source code.
- **Trigger:** Detected only while running the application.
- **Dependence:** Often related to user input or environmental factors.
- **Detection and Handling:** Identified using try-catch blocks, logging error messages for proper analysis.

## 3. Logic Errors

- **Description:** Occur after the program is successfully compiled and running.
- **Identification:** Result in incorrect program output.
- **Alternative Name:** Also known as semantic errors.
- **Prevention:** Cannot be caught using try-catch blocks.
- **Cause:** Stem from incorrect logic applied by the developer during application building.
- **Occurrence:** Evident when the program produces undesired or unexpected results.