import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubDoubleTest {
    static Calculator calculator;

    @BeforeEach
    public void preconditionTest(){
        calculator= new Calculator();
    }


    @Test
    @DisplayName("Sub for long values 0.15600 and 0.987400 passed successfully")
    public void testSumLong(){

        //calculator.sum(15600, 987400);
        assertEquals(-0.8314, calculator.sub(0.15600, 0.987400));
    }


    @Test
    //  @Disabled("Temporarily disabled")
    @DisplayName("Sub with negative value")
    public void testSumNegative(){

        assertEquals(1.1434000, calculator.sub(0.15600, -0.987400));
    }

    @Test
    @DisplayName("Sub of zeros")
    public void testSumZero(){

        assertEquals(0, calculator.sub( 00.00, 0.0000000));
    }
}

