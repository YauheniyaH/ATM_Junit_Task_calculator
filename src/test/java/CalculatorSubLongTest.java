import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSubLongTest {
    static Calculator calculator;

    @BeforeEach
    public void preconditionTest(){
        calculator= new Calculator();
    }


    @Test
    @DisplayName("Sub for long values 15600 and 987400 passed successfully")
    public void testSumLong(){

        //calculator.sum(15600, 987400);
        assertEquals(-971800, calculator.sub(15600, 987400));
    }


    @Test
    //  @Disabled("Temporarily disabled")
    @DisplayName("Sub with negative value")
    public void testSumNegative(){

        assertEquals(1003000, calculator.sub(15600, -987400));
    }

    @Test
    @DisplayName("Sub of zeros")
    public void testSumZero(){

        assertEquals(0, calculator.sub( 0, 0));
    }
}
