import java.util.Scanner;

public class GcdAndLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        // Calculating GCD and LCM
        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2, gcd);
        
        // Displaying the result
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
        
        scanner.close();
    }
    
    // Method to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        if (b==0) return a;
		return calculateGCD(b,a%b);
    }
    
    // Method to calculate LCM using the relation LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }
}

/*
I/P: 
Enter first number: 4
Enter second number: 9
O/P:
GCD of 4 and 9 is: 1
LCM of 4 and 9 is: 36 */
