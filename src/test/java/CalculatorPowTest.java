import com.epam.tat.module4.Calculator;
import com.epam.tat.module4.Timeout;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorPowTest {

    @ParameterizedTest
    @DisplayName("Test power of numbers with different double parameters")
    @CsvFileSource(resources = "calcDoubleValuesForPow.csv")

    public void testPowValues(double a, double b, double result, Calculator calculator){

        assertEquals(result, calculator.pow(a,b));

    }
}
