import classroom.Calculator;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {

    Calculator casio = new Calculator( "V2022");

    @Test
    public void additionMethodTest() {
        int result = casio.addition(200, 50);
        assertEquals(250, casio.addition(200, 50));
    }

    @Test
    public void subtractMethodTest() {
        int result = casio.subtract(300, 50);
        assertEquals(250, casio.subtract(300, 50));
    }

    @Test
    public void divideMethodTest() {
        int result = casio.divide(300, 50);
        assertEquals(6, casio.divide(300, 50));
    }


    @Test
    public void multiplyMethodTest() {
        int result = casio.multiply(300, 5);
        assertEquals(1500, casio.multiply(300, 5));
    }

    @Test
    public void squaredMethodTest() {
        int result = casio.squared(4);
        assertEquals(16, casio.squared(4));
    }


}
