import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            checkNumber(n);
            printNumber(n);
        }catch (InputMismatchException e){
            System.err.println("Only allowed integer");
        } catch (MyException e) {
            // Handle the custom exception
            System.err.println("Caught Exception: " + e.getMessage());
        }
    }
    static void checkNumber(int n) throws MyException{
        if(n >= 100){
            throw new MyException("\"Something went wrong\"");
        }
    }
    static void printNumber(int n){
        System.out.println("Number: "+n);
    }
}