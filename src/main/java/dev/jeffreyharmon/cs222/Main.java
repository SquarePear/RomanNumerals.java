package dev.jeffreyharmon.cs222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals();

        // User input
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        while (true) {
            System.out.print("Enter a number to convert to a Roman Numeral: ");

            try {
                number = Integer.parseInt(scanner.nextLine());

                if (number < 0) {
                    System.out.println("Please enter a positive number.");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please try again.");
            }
        }

        String romanNumeral = romanNumerals.convertNumberToNumeral(number);

        System.out.println(romanNumeral);
    }
}