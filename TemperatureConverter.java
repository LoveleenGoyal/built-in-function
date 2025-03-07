import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char unit = sc.next().charAt(0);
        
        if (unit == 'C' || unit == 'c') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f Fahrenheit is %.2f Celsius\n", temperature, celsius);
        } else if (unit == 'F' || unit == 'f') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", temperature, fahrenheit);
        } else {
            System.out.println("Invalid input. Please enter 'C' or 'F'.");
        }
        
        sc.close();
    }
    
    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
