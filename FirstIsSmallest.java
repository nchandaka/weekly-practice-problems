// Program Name: FirstIsSmallest
// This program checks if the first number is the smallest among three numbers

import java.util.Scanner;

public class FirstIsSmallest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number1, number2, number3;

        // Taking input
        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        // Boolean condition
        boolean isFirstSmallest = (number1 < number2) && (number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        input.close();
    }
}