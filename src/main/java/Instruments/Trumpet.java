package Instruments;

public class Trumpet extends Instrument {

    private int valvesNumber;
    private int size;

    public Trumpet(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, int valvesNumber, int size) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.valvesNumber = valvesNumber;
        this.size = size;

    }
}
