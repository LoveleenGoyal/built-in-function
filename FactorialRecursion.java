import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Calculating factorial using recursion
        long factorial = calculateFactorial(num);
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        sc.close();
    }
    
    // Recursive method to calculate factorial
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

/*
I/P:
Enter a number: 6
O/P:
Factorial of 6 is: 720 
 */
