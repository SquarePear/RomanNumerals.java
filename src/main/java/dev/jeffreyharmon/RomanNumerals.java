package dev.jeffreyharmon;

enum ROMAN_NUMERALS {
    M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
}

public class RomanNumerals {
    public String convertNumberToNumeral(int number) {
        String romanNumeral = "";

        if (number == 1)
            romanNumeral = "I";

        return romanNumeral;
    }
}
