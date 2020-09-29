/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author listya
 */
public class TemperatureSensor implements Sensor {
        
    private boolean isUp;

    public TemperatureSensor() {
        this.isUp = false;
    }
    

    @Override
    public boolean isOn() {
        return isUp;
    }

    @Override
    public void setOn() {
        this.isUp = true;
    }

    @Override
    public void setOff() {
        this.isUp = false;
    }

    @Override
    public int read() throws IllegalStateException {
        setOn();
        int random = (int) (Math.random() * (30 - (-30) + 1) + (-30));
        return random;
    }
    
}
