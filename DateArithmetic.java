import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Taking user input for date
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.print("Enter day: ");
        int day = sc.nextInt();
        
        LocalDate date = LocalDate.of(year, month, day);
        
        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks
        modifiedDate = modifiedDate.minusWeeks(3);
        
        // Display results
        System.out.println("Original Date: " + date);
        System.out.println("Modified Date after operations: " + modifiedDate);
        
        sc.close();
    }
}

/* 
I/P:
Enter year: 2025
Enter month: 2
Enter day: 26

O/P:
Original Date: 2025-02-26
Modified Date after operations: 2027-03-15
 */