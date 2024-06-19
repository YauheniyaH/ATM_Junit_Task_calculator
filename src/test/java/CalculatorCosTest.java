import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;



@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorCosTest {
    @ParameterizedTest
    @CsvSource({"3, -0.99", "-3 , -0.99", "90, -0.4481","0,1"})
    @DisplayName("Sin function for positive values")
    public void cosPositiveTest (double a,  double result, Calculator calculator){


        assertEquals(result, Math.round(calculator.cos(a)*10000d)/10000d);
    }

    @Test
    @DisplayName("Check values with Math.PI")
    public void cosForPIValueTest(){
        Calculator calculator = new Calculator();

        assertEquals(-1, calculator.cos(Math.PI));

    }
}
