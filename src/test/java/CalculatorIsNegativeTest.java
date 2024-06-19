import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Execution(ExecutionMode.CONCURRENT)
public class CalculatorIsNegativeTest {

    static Calculator calculator;
    @BeforeEach
    public void preconditions(){
        calculator = new Calculator();

    }

    @Test
    @DisplayName("Check number is negative")
    public void isNegativeTest(){
        assertTrue(calculator.isNegative(-5));
    }

    @Test
    @DisplayName("Check number is positive")
    public void isNegativeWithNegativeValueTest(){
        assertFalse(calculator.isNegative(5));
    }

    @Test
    @DisplayName("Check number is zero")
    public void isNegativeWithZeroValueTest(){
        assertFalse(calculator.isNegative(0));
    }
}

