package Shop;

import Instruments.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;
    private double wallet;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
        this.wallet = 0;
    }

    public int countStockItems() {
        return stock.size();
    }

    public double getWallet() {
        return wallet;
    }

    public void addToStock(ISell item) {
        stock.add(item);
    }

    public void removeFromStock(ISell item) {
        stock.remove(item);
    }

    public void clearStock() {
        stock.clear();
    }

    public double fullEarnings() {
        double fullEarnings = 0.0;
        for (ISell item : stock) {
            fullEarnings += item.calculateMarkup();
        }
        return fullEarnings;
    }

    public double totalProfit() {
        double totalProfit = 0.0;
        for (ISell item : stock) {
            totalProfit += item.calculateProfit();
        }
        return totalProfit;
    }


    public String sellItem(ISell item) {
        if (stock.contains(item)) {
            stock.remove(item);
            wallet += item.getSellPrice();
        }
        return "This item is not in stock!";
    }
}
