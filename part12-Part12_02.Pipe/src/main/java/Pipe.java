
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
public class Pipe<T> {
    private List<T> lists;

    public Pipe() {
        this.lists = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        this.lists.add(value);
    }

    public T takeFromPipe() {
        T taken;
        int index;
        if (this.lists.size() > 0) {
            index = this.lists.size()-1;
            taken = this.lists.get(index);
            this.lists.remove(this.lists.get(index));
            return taken;
        }
        return null;
    }

    public boolean isInPipe() {
        if (this.lists.size() > 0) {
            return true;
        }
        return false;
    }
}
