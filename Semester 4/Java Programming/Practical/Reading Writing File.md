# Reading Writing in a File
## Using `FileWriter` and `FileReader`
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "example.txt";

        // Write to a file
        writeToFile(filePath, "Hello, world!");

        // Read from a file
        String content = readFromFile(filePath);
        System.out.println("Content read from file: " + content);
    }

    // Method to write content to a file
    public static void writeToFile(String filePath, String content) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try {
            FileReader reader = new FileReader(filePath);
            int character;
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return content.toString();
    }
}

```

## Using `BufferWriter` and `BufferReader`
```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "example.txt";

        // Write to a file
        writeToFile(filePath, "Hello, world!");

        // Read from a file
        String content = readFromFile(filePath);
        System.out.println("Content read from file: " + content);
    }

    // Method to write content to a file using BufferedWriter
    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
            System.out.println("Content written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read content from a file using BufferedReader
    public static String readFromFile(String filePath) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
        return content.toString();
    }
}
```