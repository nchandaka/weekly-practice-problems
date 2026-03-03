import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double celsius;
        double fahrenheitResult;

        // Take user input
        System.out.print("Enter temperature in Celsius: ");
        celsius = input.nextDouble();

        // Convert Celsius to Fahrenheit
        fahrenheitResult = (celsius * 9 / 5) + 32;

        // Print result
        System.out.println("The " + celsius + " celsius is " 
                + fahrenheitResult + " fahrenheit");

        input.close();
    }
}