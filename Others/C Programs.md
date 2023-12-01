---
tags:
  - "#c-language"
  - "#college"
---

# C Questions
### 1. Armstrong number in C
```c
#include <stdio.h>
#include <math.h>

int isArmstrong(int num) {
    int originalNum, remainder, n = 0, result = 0;

    originalNum = num;

    // store the number of digits in n
    while (originalNum != 0) {
        originalNum /= 10;
        ++n;
    }

    originalNum = num;

    // check if a number is Armstrong
    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += pow(remainder, n);
        originalNum /= 10;
    }

    return result == num;
}

int main() {
    int number;

    printf("Enter a number: ");
    scanf("%d", &number);

    if (isArmstrong(number))
        printf("%d is an Armstrong number.\n", number);
    else
        printf("%d is not an Armstrong number.\n", number);

    return 0;
}
```

### 2. Factorial using recursion or iteration
#### Using Iteration:
```c
#include <stdio.h>

unsigned long long factorialIterative(int n) {
    unsigned long long fact = 1;
    for (int i = 1; i <= n; ++i) {
        fact *= i;
    }
    return fact;
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    printf("Factorial of %d using iteration: %llu\n", num, factorialIterative(num));
    return 0;
}
```

#### Using Recursion:
```c
#include <stdio.h>

unsigned long long factorialRecursive(int n) {
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * factorialRecursive(n - 1);
    }
}

int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);

    printf("Factorial of %d using recursion: %llu\n", num, factorialRecursive(num));
    return 0;
}
```

### 3. Fibonacci using recursion or iteration
#### Using Iteration:
```c
#include <stdio.h>

void fibonacciIterative(int n) {
    int prev = 0, next = 1, sum;

    printf("Fibonacci Series: ");

    for (int i = 0; i < n; ++i) {
        printf("%d, ", prev);
        sum = prev + next;
        prev = next;
        next = sum;
    }
}

int main() {
    int num;
    printf("Enter the number of terms: ");
    scanf("%d", &num);

    fibonacciIterative(num);

    return 0;
}
```

#### Using Recursion:
```c
#include <stdio.h>

int fibonacciRecursive(int n) {
    if (n <= 1)
        return n;
    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
}

int main() {
    int num;
    printf("Enter the number of terms: ");
    scanf("%d", &num);

    printf("Fibonacci Series using recursion: ");
    for (int i = 0; i < num; ++i) {
        printf("%d, ", fibonacciRecursive(i));
    }

    return 0;
}
```

### 4. Check palindrome
```c
#include <stdio.h>
#include <stdbool.h>
#include <string.h>

bool isPalindrome(const char *str) {
    int len = strlen(str);
    int i = 0, j = len - 1;

    while (i < j) {
        if (str[i] != str[j]) {
            return false;
        }
        i++;
        j--;
    }

    return true;
}

int main() {
    char str[100];
    printf("Enter a string: ");
    scanf("%s", str);

    if (isPalindrome(str))
        printf("%s is a palindrome.\n", str);
    else
        printf("%s is not a palindrome.\n", str);

    return 0;
}
```

### 5. Sort an array
```c
#include <stdio.h>

void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

int main() {
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("Original array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    bubbleSort(arr, size);

    printf("Sorted array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
```

### 6. Find an element in an array at a specific index
```c
#include <stdio.h>

int findElement(int arr[], int size, int index) {
    if (index >= size || index < 0) {
        printf("Index out of bounds\n");
        return -1;
    }
    return arr[index];
}

int main() {
    int arr[] = {1, 2, 3, 4, 5};
    int size = sizeof(arr) / sizeof(arr[0]);
    int index;

    printf("Enter the index to find element: ");
    scanf("%d", &index);

    int result = findElement(arr, size, index);
    if (result != -1)
        printf("Element at index %d is: %d\n", index, result);

    return 0;
}
```