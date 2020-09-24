
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class OneItemBox extends Box {
    private int capacity;
    private ArrayList<Item> itemArrayList;

    public OneItemBox() {
        this.capacity = 1;
        this.itemArrayList = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.itemArrayList.size() < this.capacity) {
            this.itemArrayList.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.itemArrayList.contains(item)) {
            return true;
        }
        return false;
    }
}
