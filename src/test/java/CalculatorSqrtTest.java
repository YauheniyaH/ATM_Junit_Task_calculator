import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorSqrtTest {

    @ParameterizedTest
    @CsvFileSource(resources = "calcValuesForSqrt.csv")
    @DisplayName("Sqrt for positive values")
    public void sqrtPositiveTest (double a,  double result, Calculator calculator){

        assertEquals(result, calculator.sqrt(a));
    }

    @Test
    @DisplayName("Sqrt not fails with negative argument")
    public void sqrtFromNegativeNotFailTest(){
        Calculator calculator= new Calculator();
        assertEquals(2, calculator.sqrt(-4));
    }

}
