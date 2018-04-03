package Instruments;

import Enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    Guitar martinD28;

    @Before
    public void setUp()  {
       martinD28 = new Guitar("Martin D28", "Nice!",1500.00, 2500.00, InstrumentType.STRING);

    }

    @Test
    public void play() {
        assertEquals("Nice!", martinD28.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(1000, martinD28.calculateMarkup(), 0.1);
    }

    @Test
    public void calculateMarkupPercentage() {
        assertEquals(0.66, martinD28.calculateMarkupPercentage(), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("Martin D28", martinD28.getName());
    }


    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRING, martinD28.getInstrumentType());
    }


}