import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Q4. Write a java program to make frequency count of words in a given text
        String text = "This is a sample text to demonstrate word frequency count. This text contains several words, and some words are repeated to test the frequency counting functionality.";
        String[] words = text.split("\\s+");

        String[] uniqueWords = removeDuplicates(words);
        int[] wordFrequency = new int[uniqueWords.length];

        for (int i = 0; i < uniqueWords.length; i++) {
            for (String word : words) {
                if (uniqueWords[i].equals(word)) {
                    wordFrequency[i]++;
                }
            }
        }

        // Display the word frequency count
        for (int i = 0; i < uniqueWords.length; i++) {
            System.out.println(uniqueWords[i] + " : " + wordFrequency[i]);
        }
    }

    public static String[] removeDuplicates(String[] arr) {
        int end = arr.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = arr[end - 1];
                    end--;
                    j--;
                }
            }
        }

        return Arrays.copyOf(arr, end);
    }
}
