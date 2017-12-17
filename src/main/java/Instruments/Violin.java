package Instruments;

public class Violin extends Instrument implements IPlay, ISell {

    private int stringsNumber;

    public Violin(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, int stringsNumber) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.stringsNumber = stringsNumber;
    }

    @Override
    public String play() {
        return "trii trii";
    }

    @Override
    public double calculateMarkup() {
        double margin = getSellPrice()-getBuyPrice();
        double markup = (margin-getBuyPrice()*100);
        return markup;
    }
}
