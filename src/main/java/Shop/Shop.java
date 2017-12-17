package Shop;

import Instruments.ISell;
import Instruments.Trumpet;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public int countStockItems() {
        return stock.size();
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
}
