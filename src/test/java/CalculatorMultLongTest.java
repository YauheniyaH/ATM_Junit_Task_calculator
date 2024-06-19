import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorMultLongTest {


    @ParameterizedTest
    @CsvFileSource(resources = "calcLongValuesForMult.csv")
    @DisplayName("Multiply long values")
    public void multLongValueTest (long a, long b, long result, Calculator calculator){

        assertEquals(result, calculator.mult(a,b));
    }
}
