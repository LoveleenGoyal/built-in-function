import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take two date inputs from user
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine());
        
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine());
        
        // Compare the dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
        
        sc.close();
    }
}

/* 
I/P:
Enter first date (yyyy-MM-dd): 2025-02-26
Enter second date (yyyy-MM-dd): 2025-03-07

O/P:
The first date is before the second date.
 */