package Instruments;

public class Piano extends Instrument implements IPlay {

    private String pianoType;

    public Piano(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, String pianoType) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "ti ti ti";
    }
}
