package BaseClasses;

import Enums.InstrumentType;
import Enums.ItemType;
import Instruments.Guitar;
import Interfaces.ISell;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {

    Shop bobsShop;
    SheetMusic sheetMusic1;
    Guitar guitar;

    @Before
    public void setUp() {
        bobsShop = new Shop("Bob's Shop");
        guitar = new Guitar("Martin D28", "Nice!",1500.00, 2500.00, InstrumentType.STRING);
        sheetMusic1 = new SheetMusic("Collected Works", ItemType.SHEET_MUSIC, 5.00, 10.00);
        bobsShop.addItem(guitar);
    }

    @Test
    public void addItem() {
        assertEquals(1, bobsShop.getStock().size());
        bobsShop.addItem(sheetMusic1);
        assertEquals(2, bobsShop.getStock().size());

    }

    @Test
    public void removeItem() {
        assertEquals(1, bobsShop.getStock().size());
        bobsShop.removeItem(guitar);
        assertEquals(0, bobsShop.getStock().size());
    }

    @Test
    public void totalPotentialProfit() {
        assertEquals(1000, bobsShop.totalPotentialProfit(), 0.1);
    }

    @Test
    public void getName() {
        assertEquals("Bob's Shop", bobsShop.getName());
    }


    @Test
    public void getStock() {
        bobsShop.addItem(sheetMusic1);
        for (ISell item : bobsShop.getStock()) {
            System.out.println(item.calculateMarkup());
            System.out.println(item.getClass());
        }
    }
}