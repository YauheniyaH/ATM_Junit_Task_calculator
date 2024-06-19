import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorDivDoubleTest {

    @ParameterizedTest
    @CsvFileSource(resources = "calcDoubleValuesForDiv.csv")
    @DisplayName("Divide double values")
    public void divLongValueTest (double a, double b, double result, Calculator calculator){

        assertEquals(result, calculator.div(a,b));
    }

    @Test
    @DisplayName("Test that division by zero will fail with error")
    public void divFailWithDIvByZero(){
        Calculator calculator= new Calculator();

        assertThrows( NumberFormatException.class,()-> calculator.div(1,0));
    }
}
