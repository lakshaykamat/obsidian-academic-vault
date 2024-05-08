## Frequency Count
```java
import java.util.Arrays;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "This is a sample text text with some sample words."; // Sample text

        // Split the text into words
        String[] words = text.split("\\s+");

        // Sort the array of words to group identical words together
        Arrays.sort(words);

        // Initialize variables to store current word and its count
        String currentWord = words[0];
        int count = 1;

        // Count the frequency of each word and display
        System.out.println("Word frequencies:");
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(currentWord)) {
                count++;
            } else {
                System.out.println(currentWord + ": " + count);
                currentWord = words[i];
                count = 1;
            }
        }
        // Print the count of the last word
        System.out.println(currentWord + ": " + count);
    }
}

```