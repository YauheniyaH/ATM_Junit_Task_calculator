import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorDivLongTest {
    @ParameterizedTest
    @CsvFileSource(resources = "calcLongValuesForDiv.csv")
    @DisplayName("Divide long values")
    public void divLongValueTest (long a, long b, long result, Calculator calculator){

        assertEquals(result, calculator.div(a,b));
    }

    @Test
    @DisplayName("Test that division by zero is not acceptable")
    public void divNotFailWithDIvByZero(){
        Calculator calculator= new Calculator();

        assertThrows( NumberFormatException.class,()-> calculator.div(1,0), "Attempt to divide by zero");
    }
}
