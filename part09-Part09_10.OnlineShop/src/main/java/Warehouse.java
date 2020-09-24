
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Warehouse {
    private Map<String, Integer> stockList;
    private Map<String, Integer> prices;


    public Warehouse() {
        this.stockList = new HashMap<>();
        this.prices = new HashMap<>();
    }

    public void addProduct(String productName, int price, int stock) {
        this.stockList.put(productName, stock);
        this.prices.put(productName, price);
    }

    public int price(String product) {
        if (this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }

    public int stock(String product) {
        if (this.stockList.containsKey(product)) {
            return this.stockList.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if (this.stockList.containsKey(product)) {
            if(this.stockList.get(product) - 1 >= 0) {
                this.stockList.put(product, this.stockList.get(product) - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return stockList.keySet();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Warehouse)) return false;
        Warehouse warehouse = (Warehouse) o;
        return stockList.equals(warehouse.stockList) &&
                prices.equals(warehouse.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockList, prices);
    }
}
