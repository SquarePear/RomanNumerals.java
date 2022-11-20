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

    @Test
    public void testConvert40() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("XL", romanNumerals.convertNumberToNumeral(40));
    }

    @Test
    public void testConvert50() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("L", romanNumerals.convertNumberToNumeral(50));
    }

    @Test
    public void testConvert90() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("XC", romanNumerals.convertNumberToNumeral(90));
    }

    @Test
    public void testConvert100() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("C", romanNumerals.convertNumberToNumeral(100));
    }

    @Test
    public void testConvert400() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("CD", romanNumerals.convertNumberToNumeral(400));
    }

    @Test
    public void testConvert500() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("D", romanNumerals.convertNumberToNumeral(500));
    }

    @Test
    public void testConvert900() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("CM", romanNumerals.convertNumberToNumeral(900));
    }

    @Test
    public void testConvert1000() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("M", romanNumerals.convertNumberToNumeral(1000));
    }
}
