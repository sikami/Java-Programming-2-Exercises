
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
public class Herd implements Movable {
    
    private List<Organism> entries;

    public Herd() {
        this.entries = new ArrayList<>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Organism mov : entries) {
            sb.append(mov.toString() + "\n");
        }
        return sb.toString();
    }

    public void addToHerd(Movable movable) {
        Organism move = (Organism) movable;
        this.entries.add(move);
    }

    @Override
    public void move(int dx, int dy) {
        for (Organism mov: entries) {
            mov.move(dx,dy);
        }
    }
    
}
