package Items;

import Enums.InstrumentType;
import Enums.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    SheetMusic sheetMusic1;

    @Before
    public void setUp() {
        sheetMusic1 = new SheetMusic("Collected Works", ItemType.SHEET_MUSIC, 5.00, 10.00);
    }

    @Test
    public void getName() {
        assertEquals("Collected Works", sheetMusic1.getName());
    }

    @Test
    public void setName() {
        sheetMusic1.setName("Some dots on a page");
        assertEquals("Some dots on a page", sheetMusic1.getName());
    }

    @Test
    public void getItemType() {
        assertEquals(ItemType.SHEET_MUSIC, sheetMusic1.getItemType());
    }


    @Test
    public void getBuyPrice() {
        assertEquals(5.00, sheetMusic1.getBuyPrice(), 0.01);
    }



    @Test
    public void getSellPrice() {
        assertEquals(10.00, sheetMusic1.getSellPrice(), 0.01);
    }

    @Test
    public void setSellPrice() {
        sheetMusic1.setSellPrice(15.00);
        assertEquals(15.00, sheetMusic1.getSellPrice(), 0.01);
    }


    @Test
    public void calculateMarkup() {
        assertEquals(5.00, sheetMusic1.calculateMarkup(), 0.1);
    }

    @Test
    public void calculateMarkupPercentage() {
        assertEquals(1.0, sheetMusic1.calculateMarkupPercentage(), 0.01);
    }
}