public class Main {
    public static void main(String[] args) {
        //Q5. Write a java program to sort a given list of names in ascending order
        String[] names = {"John", "Alice", "Bob", "Zoe", "David"};

        System.out.println("Original list of names:");
        printArray(names);

        // Sort the array of names
        bubbleSort(names);

        System.out.println("\nSorted list of names in ascending order:");
        printArray(names);
    }

    public static void bubbleSort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(String[] arr) {
        for (String name : arr) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
