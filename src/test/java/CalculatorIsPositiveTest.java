import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorIsPositiveTest {
    static Calculator calculator;
    @BeforeEach
    public void preconditions(){
         calculator = new Calculator();

    }

    @Test
    @DisplayName("Check number is positive")
    public void isPositiveTest(){
        assertTrue(calculator.isPositive(5));
    }

    @Test
    @DisplayName("Check number is negative")
    public void isPositiveWithNegativeValueTest(){
        assertFalse(calculator.isPositive(-5));
    }
    @Test
    @DisplayName("Check number is zero")
    public void isPositiveWithZeroValueTest(){
        assertFalse(calculator.isNegative(0));
    }
}
