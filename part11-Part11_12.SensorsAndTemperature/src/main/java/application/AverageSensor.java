/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author listya
 */
public class AverageSensor implements Sensor {
    
    private List<Sensor> lists;
    private List<Integer> reads;

    public AverageSensor() {
        this.lists = new ArrayList<>();
        this.reads = new ArrayList<>();
    }
    
    public void addSensor(Sensor toAdd) {
        this.lists.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : lists) {
            if (sensor.isOn()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
        this.lists.stream().forEach(sensor -> sensor.setOn());
        
    }

    @Override
    public void setOff() {
        this.lists.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("Average Sensor is off");
        }
        double average = 0;
        int stats = this.lists.stream().map(sensor -> sensor.read())
                .reduce(0,(prev,value) -> prev + value);
        average = (double) stats / (double) this.lists.size();
        reads.add((int)average);
        return (int) average;
                
    }
    
    public List<Integer> readings() {
        return reads;
    }
    
        
}
