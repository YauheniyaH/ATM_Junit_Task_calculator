import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@ExtendWith(CalculatorParameterResolver.class)
public class CalculatorTgTest {


        @ParameterizedTest
        @CsvSource({"100, -5.6713", "45 , 1", "30, 0.5774","-4,-0.0699", "1,0.0175"})
        @DisplayName("Tg function for positive values")
        public void tgPositiveTest (double a,  double result, Calculator calculator){


            assertEquals(result, Math.round(calculator.tg(Math.toRadians(a))*10000d)/10000d);
        }

//        @Test
//        @DisplayName("Test that tg for negative value cause error")
//        public void tgFailWithDIvByZero(){
//                Calculator calculator= new Calculator();
//
//                assertThrows( NumberFormatException.class,()-> calculator.tg(Math.PI/2));
//        }
}
