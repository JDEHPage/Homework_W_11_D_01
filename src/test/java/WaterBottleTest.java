import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
//        WaterBottle bottle = new WaterBottle();
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void waterDrank(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyOutBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        WaterBottle usedBottle = new WaterBottle();
        assertEquals(100, usedBottle.getVolume());
        usedBottle.drink();
        assertEquals(90, usedBottle.getVolume());
        usedBottle.fill();
        assertEquals(100, usedBottle.getVolume());
    }
}
