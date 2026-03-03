import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        double number1;
        double number2;
        double additionResult;
        double subtractionResult;
        double multiplicationResult;
        double divisionResult;

        // Take user input
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();

        // Perform arithmetic operations
        additionResult = number1 + number2;
        subtractionResult = number1 - number2;
        multiplicationResult = number1 * number2;

        // Avoid division by zero
        if (number2 != 0) {
            divisionResult = number1 / number2;
        } else {
            divisionResult = 0;
            System.out.println("Division by zero is not allowed.");
        }

        // Print results
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + additionResult + ", "
                + subtractionResult + ", "
                + multiplicationResult + ", and "
                + divisionResult);

        input.close();
    }
}