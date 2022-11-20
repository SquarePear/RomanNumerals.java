package dev.jeffreyharmon;

import java.util.HashMap;
import java.util.Map;

enum ROMAN_NUMERALS {
    M, CM, D, CD, C, XC, L, XL, X, IX, V, IV, I
}

public class RomanNumerals {
    private static final Map<ROMAN_NUMERALS, Integer> ROMAN_NUMERALS_TO_NUMBERS = new HashMap<>() {{
        put(ROMAN_NUMERALS.D, 500);
        put(ROMAN_NUMERALS.CD, 400);
        put(ROMAN_NUMERALS.C, 100);
        put(ROMAN_NUMERALS.XC, 90);
        put(ROMAN_NUMERALS.L, 50);
        put(ROMAN_NUMERALS.XL, 40);
        put(ROMAN_NUMERALS.X, 10);
        put(ROMAN_NUMERALS.IX, 9);
        put(ROMAN_NUMERALS.V, 5);
        put(ROMAN_NUMERALS.IV, 4);
        put(ROMAN_NUMERALS.I, 1);
    }};

    public String convertNumberToNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();

        while (number > 0) {
            for (ROMAN_NUMERALS romanNumeralEnum : ROMAN_NUMERALS.values()) {
                if (!ROMAN_NUMERALS_TO_NUMBERS.containsKey(romanNumeralEnum))
                    continue;

                if (number >= ROMAN_NUMERALS_TO_NUMBERS.get(romanNumeralEnum)) {
                    romanNumeral.append(romanNumeralEnum);
                    number -= ROMAN_NUMERALS_TO_NUMBERS.get(romanNumeralEnum);

                    break;
                }
            }
        }

        return romanNumeral.toString();
    }
}
