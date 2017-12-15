package Instruments;

public class Piano extends Instrument {

    private String pianoType;

    public Piano(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, String pianoType) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.pianoType = pianoType;
    }
}
