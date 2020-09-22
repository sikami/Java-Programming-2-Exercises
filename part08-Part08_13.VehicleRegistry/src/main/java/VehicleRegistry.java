
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> licenses;

    public VehicleRegistry() {
        this.licenses = new HashMap<>();
    }
    
    public boolean add(LicensePlate plate, String owner) {
        if (this.licenses.containsKey(plate) && this.licenses.containsValue("")) {
            this.licenses.put(plate, owner);
            return true;
        } else if (!this.licenses.containsKey(plate) && !this.licenses.containsValue("")) {
            this.licenses.put(plate, owner);
            return true;
        } else if (this.licenses.containsKey(plate) && this.licenses.containsValue(owner)){
            return false;
        }
        return false;
        
    }

    public String get(LicensePlate licensePlate) {
        for (Map.Entry<LicensePlate, String> set : this.licenses.entrySet()) {
            if (set.getKey().equals(licensePlate)) {
                return set.getValue();
            }
        }
        return null;    
    }

    public boolean remove(LicensePlate licensePlate) {
        if (this.licenses.containsKey(licensePlate)) {
            this.licenses.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (Map.Entry<LicensePlate, String> set : this.licenses.entrySet()) {
            System.out.println(set.getKey());
        }
    }

    public void printOwners() {
        ArrayList<String> names = new ArrayList<>();
        for (Map.Entry<LicensePlate, String> set : this.licenses.entrySet()) {
            if (names.contains(set.getValue())) {
                continue;
            } else {
                names.add(set.getValue());
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
