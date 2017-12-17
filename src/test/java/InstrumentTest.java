import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Guitar guitar;
    Piano piano;
    Trumpet trumpet;
    Violin violin;

    @Before
    public void before() {
        guitar = new Guitar("wood", "brown", "Fender", 300.0, 500.0, InstrumentType.STRINGS, 5, "acoustic", false);
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

}
