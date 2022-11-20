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
}
