import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double base;
        double height;
        double areaInSqCm;
        double areaInSqInches;

        // Take input
        System.out.print("Enter base in cm: ");
        base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        height = input.nextDouble();

        // Calculate area in square centimeters
        areaInSqCm = 0.5 * base * height;

        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInInches = base / 2.54;
        double heightInInches = height / 2.54;

        // Calculate area in square inches
        areaInSqInches = 0.5 * baseInInches * heightInInches;

        // Print results
        System.out.println("The Area of the triangle in sq in is "
                + areaInSqInches + " and sq cm is "
                + areaInSqCm);

        input.close();
    }
}