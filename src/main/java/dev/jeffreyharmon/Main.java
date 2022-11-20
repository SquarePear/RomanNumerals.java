package dev.jeffreyharmon;

public class Main {
    public static void main(String[] args) {
        RomanNumerals romanNumerals = new RomanNumerals();

        System.out.println("The first 10 numbers in Roman numerals:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " = " + romanNumerals.convertNumberToNumeral(i));
        }
    }
}