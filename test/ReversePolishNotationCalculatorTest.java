import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public void shouldCalculateAddition() {
        String value = "1 2 3 + +";
        int result = calculator.calculatePolishNotation(value);
        assertEquals(6, result);
    }

    @Test
    public void shouldCalculateSubtraction() {
        String value = "4 2 1 - -";
        int result = calculator.calculatePolishNotation(value);
        assertEquals(3, result);
    }

    @Test
    public void shouldCalculateMultiplication() {
        String value = "2 2 3 * *";
        int result = calculator.calculatePolishNotation(value);
        assertEquals(12, result);
    }

    @Test
    public void shouldHandleSpaces() {
        String value = "1   2  3 - +";
        int result = calculator.calculatePolishNotation(value);
        assertEquals(0, result);
    }

    @Test
    public void mustCalculateNegativeNumber() {
        String value = "1 -1 2 - +";
        int result = calculator.calculatePolishNotation(value);
        assertEquals(-2, result);
    }
}