import java.util.Scanner;

public class BasicCalculator {

    // Method for addition
    public static double add(double a, double b) {
        return Double.sum(a, b);
    }

    // Method for subtraction
    public static double subtract(double a, double b) {
        return Math.subtractExact((long) a, (long) b); 
    }

    // Method for multiplication
    public static double multiply(double a, double b) {
        return Math.multiplyExact((long) a, (long) b); 
    }

    // Method for division
    public static double divide(double a, double b) {
        if (b == 0) {
            try {
				throw new ArithmeticException("Cannot divide by zero!"); // Handle division by zero
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nChoose an operation: ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        double result = 0;
        boolean validChoice = true;

        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                try {
                    result = divide(num1, num2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    validChoice = false;
                }
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 4.");
                validChoice = false;
        }

        if (validChoice) {
            System.out.println("Result: " + result);
        }

        sc.close();
    }
}
