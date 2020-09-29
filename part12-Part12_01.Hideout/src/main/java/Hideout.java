
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Hideout<T> {
    private List<T> lists;

    public Hideout() {
        this.lists = new ArrayList<>();
    }
    
    public void putInHideout(T toHide) {
        if (!this.lists.contains(toHide)) {
           this.lists.add(toHide); 
        }
    }
    
     public T takeFromHideout() {
        if (this.lists.size() == 0) {
            return null;
        }
        T taken = this.lists.get(0);
        this.lists.remove(this.lists.get(0));
        return taken;
    }

    public boolean isInHideout() {
        if (this.lists.size() > 0) {
            return true;
        }
        return false;
    }
    
    
}
