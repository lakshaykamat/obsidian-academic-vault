# Custom Exception
```java
// Custom exception class
class CustomException extends Exception {
    // Constructor with a custom error message
    public CustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            // Simulate a situation where a custom exception might be thrown
            int balance = 100;
            int withdrawalAmount = 200;
            if (withdrawalAmount > balance) {
                // Throw a custom exception if the withdrawal amount exceeds the balance
                throw new CustomException("Insufficient balance");
            }
            // Perform withdrawal operation
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } catch (CustomException e) {
            // Catch and handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}

```