package Instruments;

public class Guitar extends Instrument implements IPlay {

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
}
