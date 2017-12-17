import Shop.Accessories;
import Shop.AccessoriesType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoriesTest {

    Accessories guitarStrings;
    Accessories violinStrings;
    Accessories pianoWax;
    Accessories trumpetCleaner;
    Accessories musicSheet;

    @Before
    public void before() {
        guitarStrings = new Accessories(AccessoriesType.GUITARSTRING, 30.0, 40.0);
        violinStrings = new Accessories(AccessoriesType.VIOLINSTRING, 40.0, 55.0);
        pianoWax = new Accessories(AccessoriesType.PIANOWAX, 25.0, 45.0);
        trumpetCleaner = new Accessories(AccessoriesType.TRUMPETCLEANER, 15.0, 25.0);
        musicSheet = new Accessories(AccessoriesType.MUSICSHEET, 10.0, 20.0);
    }

    @Test
    public void accessoriesHasMarkups() {
        assertEquals(33.3, guitarStrings.calculateMarkup(), 0.1);
        assertEquals(37.5, violinStrings.calculateMarkup(), 0.1);
        assertEquals(80, pianoWax.calculateMarkup(), 0.1);
        assertEquals(66.6, trumpetCleaner.calculateMarkup(), 0.1);
        assertEquals(100, musicSheet.calculateMarkup(),0.1);

    }

    @Test
    public void accessoriesHasProfit() {
        assertEquals(10.0, guitarStrings.calculateProfit(), 0.01);
        assertEquals(20.0, pianoWax.calculateProfit(), 0.01);
    }
}
