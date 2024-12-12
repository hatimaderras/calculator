import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean continuer = true;
        while (continuer) {
            // Main menu
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (^)");
            System.out.println("6. Square root (√)");
            System.out.println("7. Factorial (!)");
            System.out.println("8. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();
             switch (choice) {
                case 1: // Addition
                    System.out.println("Result: " + addition(enterNumber(), enterNumber()));
                    break;
                case 2: // Subtraction
                    System.out.println("Result: " + subtraction(enterNumber(), enterNumber()));
                    break;
                case 3: // Multiplication
                    System.out.println("Result: " + multiplication(enterNumber(), enterNumber()));
                    break;



            }
}