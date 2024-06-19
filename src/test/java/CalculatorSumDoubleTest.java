import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorSumDoubleTest {
    static Calculator calculator;
    Timeout timeout = new Timeout();

    @BeforeEach
    public void preconditionTest(){
        calculator= new Calculator();
    }

    @AfterEach
    public void postTestMessage(){
        System.out.println("Wow, test executed!");
    }


    @Test
    @DisplayName("Sum for long values 1.5 and 9.07 passed successfully")
    public void testSumLong(){
        timeout.sleep(1);
        //calculator.sum(15600, 987400);
        assertEquals(10.57, calculator.sum(1.5, 9.07));
    }


    @Test
    //  @Disabled("Temporarily disabled")
    @DisplayName("Sum with negative value")
    public void testSumNegative(){
        timeout.sleep(1);
        assertEquals(-8.314, calculator.sum(1.5600, -9.87400));
    }

    @Test
    @DisplayName("Sum of zeros")
    public void testSumZero(){
        timeout.sleep(1);
        assertEquals(0, calculator.sum( 0.000, -0.0));
    }
}
