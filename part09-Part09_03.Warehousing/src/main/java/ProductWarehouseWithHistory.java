/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        addToWarehouse(initialBalance);
 
    }
    
    public String history() {
        String ex = changeHistory.toString();
        return ex;
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount); //To change body of generated methods, choose Tools | Templates.
        this.changeHistory.add(getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double result = super.takeFromWarehouse(amount);
        this.changeHistory.add(getBalance());
        return result;
    }
    
    public void printAnalysis() {
        
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
        System.out.println("Average: " + this.changeHistory.average());
    }
       
    
    
}
