
import java.util.ArrayList;
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
public class StorageFacility {
    private HashMap<String, ArrayList<String>> facilities;

    public StorageFacility() {
        this.facilities = new HashMap<>();
    }

    public void add(String unit, String item) {
        if(!this.facilities.containsKey(unit)) {
            this.facilities.put(unit, new ArrayList<>());
        }
        this.facilities.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if(this.facilities.containsKey(storageUnit)) {
            return this.facilities.get(storageUnit);
        }
        return new ArrayList<>();
    }
    
     public void remove(String storageUnit, String item) {
        if (this.facilities.containsKey(storageUnit)) {
            this.facilities.get(storageUnit).remove(item);
        }
        if (this.facilities.get(storageUnit).isEmpty()) {
            this.facilities.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> set : this.facilities.entrySet()) {
            if (!set.getValue().isEmpty()) {
                list.add(set.getKey());
            }
        }
        return list;
    }
    
}
