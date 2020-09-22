
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class IOU {
    private HashMap<String, Double> owings;

    public IOU() {
        this.owings = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        this.owings.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        for (String name : owings.keySet()) {
            if (name.contains(toWhom)) {
                return owings.get(name);
            }
        }
        return 0;
    }
    
}
