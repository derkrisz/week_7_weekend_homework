package Instruments;

import java.io.PrintStream;

public class Guitar extends Instrument implements IPlay, ISell {

    private int stringsNumber;
    private String guitarType;
    private boolean rightHanded;

    public Guitar(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type, int stringsNumber, String guitarType, boolean rightHanded) {
        super(material, colour, brand, buyPrice, sellPrice, type);
        this.stringsNumber = stringsNumber;
        this.guitarType = guitarType;
        this.rightHanded = rightHanded;
    }


    @Override
    public String play() {
        return "dzzz dzzz";
    }

    public boolean isRightHanded() {
        return rightHanded;
    }

    public void getGuitarPrice() {
        if (isRightHanded() == false ) {
            double cheaperPrice = getSellPrice()*0.8;
            setSellPrice(cheaperPrice);
        }
    }

    @Override
    public double calculateMarkup() {
        getGuitarPrice();
        double margin = getSellPrice()-getBuyPrice();
        double markup = (margin/getBuyPrice()*100.0);
        return markup;
    }

    @Override
    public double calculateProfit() {
        getGuitarPrice();
        double profit = getSellPrice()-getBuyPrice();
        return profit;
    }


}
