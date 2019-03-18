import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculation;

    @Before
    public void before() {
        calculation = new Calculator(4, 2);
    }

    @Test
    public void addNubmers(){
        assertEquals(6, calculation.add());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(2, calculation.subtract());
    }

    @Test
    public void multiplyNumbers(){
       assertEquals(8, calculation.multiply());
    }

    @Test
    public void divideNumbers(){
        assertEquals(2, calculation.divide());
    }
}
