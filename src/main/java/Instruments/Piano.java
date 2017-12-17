package Instruments;

import java.io.PrintStream;

public class Piano extends Instrument implements IPlay, ISell {

    private String pianoType;

    public Piano(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, String pianoType) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "ti ti ti";
    }

    @Override
    public double calculateMarkup() {
        double margin = getSellPrice()-getBuyPrice();
        double markup = (margin/getBuyPrice()*100);
        return markup;
    }

    @Override
    public double calculateProfit() {
        double profit = getSellPrice()-getBuyPrice();
        return profit;
    }

}
