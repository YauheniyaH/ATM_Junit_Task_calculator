import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.*;

import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorSumLongTest {

    static Calculator calculator;


    @BeforeEach
    public void preconditionTest(){
         calculator= new Calculator();
    }


    @Test
    @DisplayName("Sum for long values 15600 and 987400 passed successfully")
    public void testSumLong(){

        //calculator.sum(15600, 987400);
        assertEquals(1003000, calculator.sum(15600, 987400));
    }


    @Test
  //  @Disabled("Temporarily disabled")
    @DisplayName("Sum with negative value")
    public void testSumNegative(){

        assertEquals(-971800, calculator.sum(15600, -987400));
    }

    @Test
    @DisplayName("Sum of zeros")
    public void testSumZero(){

        assertEquals(0, calculator.sum( 0, 0));
    }
}
