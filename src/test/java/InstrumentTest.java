import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Guitar guitar2;
    Piano piano;
    Trumpet trumpet;
    Violin violin;

    @Before
    public void before() {
        guitar = new Guitar("wood", "brown", "Fender", 300.0, 500.0, InstrumentType.STRINGS, 5, "acoustic", false);
        guitar2 = new Guitar("plastic", "blue", "Les Paul", 600.0, 800.0, InstrumentType.STRINGS, 7, "electric", true);
        piano = new Piano("wood", "black", "Yamaha", 900.0, 1300.0, InstrumentType.KEYBOARD, "classic");
        trumpet = new Trumpet("brass", "gold", "Cecilio", 400.0, 700.0, InstrumentType.BRASS, 4, 3);
        violin = new Violin("wood", "dark brown", "Stagg", 500.0, 600.0, InstrumentType.WOODWIND, 7);
    }

    @Test
    public void instrumentsCanPlay() {
        assertEquals("dzzz dzzz", guitar.play());
        assertEquals("ti ti ti", piano.play());
        assertEquals("troom trooom", trumpet.play());
        assertEquals("trii trii", violin.play());
    }

    @Test
    public void cheaperLeftHandedGuitar() {
        guitar.getGuitarPrice();
        assertEquals(400, guitar.getSellPrice(), 0.01);
    }

    @Test
    public void samePriceGuitarRightHanded() {
        guitar2.getGuitarPrice();
        assertEquals(800, guitar2.getSellPrice(), 0.01);
    }

    @Test
    public void checkInstrumentMarkups() {
        assertEquals(33.3, guitar.calculateMarkup(), 0.1);
        assertEquals(33.3, guitar2.calculateMarkup(), 0.1);
        assertEquals(44.4, piano.calculateMarkup(),0.1);
        assertEquals(75, trumpet.calculateMarkup(), 0.1);
        assertEquals(20, violin.calculateMarkup(), 0.1);
    }

    @Test
    public void checkInstrumentProfit() {
        assertEquals(100, guitar.calculateProfit(), 0.01);
        assertEquals(200, guitar2.calculateProfit(), 0.01);
    }

}
