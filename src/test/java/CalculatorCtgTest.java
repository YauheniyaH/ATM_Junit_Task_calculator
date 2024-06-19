import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorCtgTest {

    @ParameterizedTest
    @CsvSource({"100, -0.1763", "45 , 1", "30, 1.7321","-4,-14.3007"})
    @DisplayName("Ctg function for positive values")
    public void ctgPositiveTest (double a,  double result, Calculator calculator){


        assertEquals(result, Math.round(calculator.ctg(Math.toRadians(a))*10000d)/10000d);
    }

//    @Test
//    @DisplayName("Test that ctg for negative value cause error")
//    public void ctgFailWithDIvByZero(){
//        Calculator calculator= new Calculator();
//
//        assertThrows( NumberFormatException.class,()-> calculator.ctg(0));
//    }
}
