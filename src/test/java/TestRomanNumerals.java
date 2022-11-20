import dev.jeffreyharmon.RomanNumerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumerals {
    @Test
    public void testConvertZero() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("", romanNumerals.convertNumberToNumeral(0));
    }

    @Test
    public void testConvertOne() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("I", romanNumerals.convertNumberToNumeral(1));
    }

    @Test
    public void testConvertThree() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("III", romanNumerals.convertNumberToNumeral(3));
    }

    @Test
    public void testConvertFour() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("IV", romanNumerals.convertNumberToNumeral(4));
    }

    @Test
    public void testConvertFive() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("V", romanNumerals.convertNumberToNumeral(5));
    }

    @Test
    public void testConvertNine() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("IX", romanNumerals.convertNumberToNumeral(9));
    }

    @Test
    public void testConvertTen() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("X", romanNumerals.convertNumberToNumeral(10));
    }
}
