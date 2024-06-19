import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorMultDoubleTest {
    @ParameterizedTest
    @CsvFileSource(resources = "calcDoubleValuesForMult.csv")
    @DisplayName("Multiply double values")
    public void multDoubleValueTest (double a, double b, double result, Calculator calculator){

        assertEquals(result, calculator.mult(a,b));
    }
}
