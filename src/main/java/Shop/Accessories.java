package Shop;

import Instruments.ISell;

public class Accessories implements ISell {

   private AccessoriesType accessoriesType;
   private double buyPrice;
   private double sellPrice;

    public Accessories(AccessoriesType accessoriesType, double buyPrice, double sellPrice) {
        this.accessoriesType = accessoriesType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
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
