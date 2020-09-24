
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class ShoppingCart {
    private Map<String, Item> lists;

    public ShoppingCart() {
        this.lists = new HashMap<>();
    }

    public void add(String product, int price) {
        if(this.lists.containsKey(product)) {
            this.lists.get(product).increaseQuantity();
        } else {
            this.lists.put(product, new Item(product, 1, price));
        }
    }


    public int price() {
        int total = 0;
        for (Item item : lists.values()) {
            total += item.price();
        }
        return total;
    }

    public void print() {
        for (Map.Entry<String, Item> stuff : this.lists.entrySet()) {
            System.out.println(stuff.getKey() + ": " + stuff.getValue().getQuantity());
        }
    }
}
