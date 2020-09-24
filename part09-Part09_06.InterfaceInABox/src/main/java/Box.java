
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
public class Box implements Packable {
    private ArrayList<Packable> boxes;
    private double maximumCapacity;

    public Box(double capacity) {
        this.maximumCapacity = capacity;
        this.boxes = new ArrayList<>();
    }
    
    public void add(Packable stuff) {
        double sum = weight();
        
        if ((sum + stuff.weight()) <= this.maximumCapacity) {
            this.boxes.add(stuff);
        }
    }
    
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable stuff : this.boxes) {
            totalWeight += stuff.weight();
        }
        return totalWeight;        
    }
    
    public String toString() {
        return "Box: " + this.boxes.size() + " items, total weight " + weight() + " kg"; 
    }
    
        

    
    
    
}
