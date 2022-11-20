package dev.jeffreyharmon;

enum ROMAN_NUMERALS {
    M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
}

public class RomanNumerals {
    public String convertNumberToNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        while (number > 0) {
            if (number - 4 >= 0) {
                romanNumeral.append("IV");
                number -= 4;
                continue;
            }

            romanNumeral.append("I");
            number--;
        }

        return romanNumeral.toString();
    }
}
