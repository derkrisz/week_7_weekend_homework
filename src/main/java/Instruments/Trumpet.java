package Instruments;

import java.io.PrintStream;

public class Trumpet extends Instrument implements IPlay, ISell {

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
