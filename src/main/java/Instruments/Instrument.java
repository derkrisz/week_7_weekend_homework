package Instruments;

public abstract class Instrument {

    private String material;
    private String colour;
    private String brand;
    private double buyPrice;
    private double sellPrice;
    private InstrumentType type;

    public Instrument(String material, String colour, String brand, double buyPrice, double sellPrice, InstrumentType type) {
        this.material = material;
        this.colour = colour;
        this.brand = brand;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.type = type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
