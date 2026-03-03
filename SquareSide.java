import java.util.Scanner;

public class SquareSide {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double perimeter;
        double sideLength;

        // Take input
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();

        // Calculate side (Perimeter = 4 * side)
        sideLength = perimeter / 4;

        // Print result
        System.out.println("The length of the side is "
                + sideLength + " whose perimeter is "
                + perimeter);

        input.close();
    }
}