import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking three integer inputs from the user
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();       
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();       
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        
        // Finding the maximum of three numbers
        int maxNumber = findMax(num1, num2, num3);
        
        // Displaying the result
        System.out.println("The maximum number is: " + maxNumber);
        
        sc.close();
    }
    
    // Method to find the maximum of three numbers
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

/* 
I/P:
Enter first number: 78
Enter second number: 45
Enter third number: 67

O/P:
The maximum number is: 78
 */