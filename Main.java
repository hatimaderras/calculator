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
                 case 4: // Division
                     double denominator = enterNumber();
                     if (denominator == 0) {
                         System.out.println("Error: Division by zero!");
                     } else {
                         System.out.println("Result: " + division(enterNumber(), denominator));
                     }
                     break;
                 case 5: // Power
                     System.out.print("Enter the exponent: ");
                     double exponent = scanner.nextInt();
                     System.out.println("Result: " + power(enterNumber(), exponent));
                     break;
                 case 6: // Square Root
                     double number = enterNumber();
                     if (number < 0) {
                         System.out.println("Error: Cannot calculate the square root of a negative number!");
                     } else {
                         System.out.println("Result: " + squareRoot(number));
                     }
                     break;




             }
}