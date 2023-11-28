---
tags:
- "#college"
- "#python"
---


| Statement  | Purpose                              | Effect on Loop                     | Effect on Code Execution                        |
|------------|--------------------------------------|------------------------------------|------------------------------------------------|
| `pass`     | Placeholder when no action is needed | Does nothing                       | Continues execution without any impact          |
| `continue` | Skips the current iteration          | Skips to the next iteration        | Continues loop execution, skipping current code |
| `break`    | Exits the loop prematurely           | Immediately exits the loop          | Continues execution after the loop prematurely  |

## Examples

### `pass` Statement:
The `pass` statement is a null operation and acts as a placeholder when no action is needed.

```python
x = 10

if x > 5:
    pass  # Placeholder, no action needed
else:
    print("x is not greater than 5")
# Here, the 'pass' statement allows the code to be syntactically correct without performing any specific action.
```

### `continue` Statement:
The `continue` statement skips the current iteration of a loop and moves to the next iteration.

```python
for i in range(5):
    if i == 2:
        continue  # Skips printing 2
    print(i)  # Prints 0, 1, 3, 4
# When i equals 2, 'continue' skips the print statement and moves to the next iteration.
```

### `break` Statement:
The `break` statement exits the loop prematurely if a condition is met.

```python
for i in range(5):
    if i == 3:
        break  # Exits the loop when i equals 3
    print(i)  # Prints 0, 1, 2
# When i equals 3, 'break' exits the loop immediately without completing all iterations.
```