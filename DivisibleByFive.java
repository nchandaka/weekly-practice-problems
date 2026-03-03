// Program Name: DivisibleByFive
// This program checks whether a number is divisible by 5

import java.util.Scanner;

public class DivisibleByFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable declaration
        int number;

        // Taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression
        boolean isDivisible = (number % 5 == 0);

        // Output
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}