import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        // Checking if the number is prime
        boolean isPrime = checkPrime(number);
        
        // Displaying the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        sc.close();
    }
    
    // Method to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

/* 
I/P:
Enter a number: 111
O/P:
111 is not a prime number.
 */