import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter the number of terms: ");
        int terms = sc.nextInt();
        
        // Generating Fibonacci sequence
        generateFibonacci(terms);
        
        sc.close();
    }
    
    // Method to generate Fibonacci sequence
    public static void generateFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Sequence: " + first + " " + second);
        
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
        System.out.println();
    }
}

/* 
I/P:
Enter the number of terms: 6
O/P:
Fibonacci Sequence: 0 1 1 2 3 5
 */
