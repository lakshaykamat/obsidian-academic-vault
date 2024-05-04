import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            int number = Integer.parseInt(scanner.nextLine());
            int result = 100 / number;

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {

            System.out.println("Please enter a valid integer.");
        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero.");
        } finally {

            scanner.close();
        }
    }
}
