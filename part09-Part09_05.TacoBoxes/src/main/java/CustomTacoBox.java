/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class CustomTacoBox implements TacoBox {
    
    private int numberOfTacos;

    public CustomTacoBox(int tacos) {
        this.numberOfTacos = tacos;
    }

    @Override
    public int tacosRemaining() {
        return this.numberOfTacos;
    }

    @Override
    public void eat() {
        if (this.numberOfTacos > 0) {
            this.numberOfTacos -= 1;
        }
        
    }

   
    
    
}
