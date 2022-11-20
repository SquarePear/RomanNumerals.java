package dev.jeffreyharmon;

enum ROMAN_NUMERALS {
    M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
}

public class RomanNumerals {
    public String convertNumberToNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        while (number > 0) {
            if (number -5 >= 0) {
                romanNumeral.append(ROMAN_NUMERALS.V);
                number -= 5;
            } else if (number -4 >= 0) {
                romanNumeral.append(ROMAN_NUMERALS.IV);
                number -= 4;
            } else {
                romanNumeral.append(ROMAN_NUMERALS.I);
                number -= 1;
            }
        }

        return romanNumeral.toString();
    }
}
