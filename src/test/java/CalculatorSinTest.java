import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorSinTest {
    @ParameterizedTest
    @CsvSource({"3, 0.1411", "-3 , -0.1411", "90, 0.894","0,0"})
    @DisplayName("Sin function for positive values")
    public void sinPositiveTest (double a,  double result, Calculator calculator){


        assertEquals(result, Math.round(calculator.sin(a)*10000d)/10000d);
    }

    @Test
    @DisplayName("Check values with Math.PI")
    public void sinForPIValueTest(){
        Calculator calculator = new Calculator();

        assertEquals(1, calculator.sin(Math.PI/2));

    }
}
