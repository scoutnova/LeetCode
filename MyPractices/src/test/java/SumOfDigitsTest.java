import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void SumOfDigits() {
        assertEquals(16, SumOfDigits.sumOfDigit(259));
        assertEquals(15, SumOfDigits.sumOfDigit(12345));
        assertEquals(22, SumOfDigits.sumOfDigit(5566));
    }
}