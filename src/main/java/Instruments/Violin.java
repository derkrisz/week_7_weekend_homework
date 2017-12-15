package Instruments;

public class Violin extends Instrument {

    private int stringsNumber;

    public Violin(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, int stringsNumber) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.stringsNumber = stringsNumber;
    }
}
