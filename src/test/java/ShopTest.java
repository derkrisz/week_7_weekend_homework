import Instruments.*;
import Shop.*;
import org.junit.Before;
import org.junit.Test;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Guitar guitar2;
    Piano piano;
    Trumpet trumpet;
    Violin violin;
    Accessories guitarStrings;
    Accessories violinStrings;
    Accessories pianoWax;
    Accessories trumpetCleaner;
    Accessories musicSheet;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("wood", "brown", "Fender", 300.0, 500.0, InstrumentType.STRINGS, 5, "acoustic", false);
        guitar2 = new Guitar("plastic", "blue", "Les Paul", 600.0, 800.0, InstrumentType.STRINGS, 7, "electric", true);
        piano = new Piano("wood", "black", "Yamaha", 900.0, 1300.0, InstrumentType.KEYBOARD, "classic");
        trumpet = new Trumpet("brass", "gold", "Cecilio", 400.0, 700.0, InstrumentType.BRASS, 4, 3);
        violin = new Violin("wood", "dark brown", "Stagg", 500.0, 600.0, InstrumentType.WOODWIND, 7);
        guitarStrings = new Accessories(AccessoriesType.GUITARSTRING, 30.0, 40.0);
        violinStrings = new Accessories(AccessoriesType.VIOLINSTRING, 40.0, 55.0);
        pianoWax = new Accessories(AccessoriesType.PIANOWAX, 25.0, 45.0);
        trumpetCleaner = new Accessories(AccessoriesType.TRUMPETCLEANER, 15.0, 25.0);
        musicSheet = new Accessories(AccessoriesType.MUSICSHEET, 10.0, 20.0);
    }


}