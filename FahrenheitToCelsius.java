import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double fahrenheit;
        double celsiusResult;

        // Take user input
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = input.nextDouble();

        // Convert Fahrenheit to Celsius
        celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Print result
        System.out.println("The " + fahrenheit + " fahrenheit is "
                + celsiusResult + " celsius");

        input.close();
    }
}