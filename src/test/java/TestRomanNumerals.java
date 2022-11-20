import dev.jeffreyharmon.RomanNumerals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRomanNumerals {
    @Test
    public void testConvertZero() {
        RomanNumerals romanNumerals = new RomanNumerals();
        Assertions.assertEquals("", romanNumerals.convertNumberToNumeral(0));
    }
}
