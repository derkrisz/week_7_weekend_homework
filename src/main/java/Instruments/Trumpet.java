package Instruments;

public class Trumpet extends Instrument implements IPlay {

    private int valvesNumber;
    private int size;

    public Trumpet(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, int valvesNumber, int size) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.valvesNumber = valvesNumber;
        this.size = size;

    }

    @Override
    public String play() {
        return "troom trooom";
    }
}
