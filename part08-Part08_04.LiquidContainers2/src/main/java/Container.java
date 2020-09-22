/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Container {
    private int first;

    public Container() {
        this.first = 0;
    }

    public int contains() {
        return this.first;
    }

    public void add(int amount) {
        if (amount < 0) {
            amount = 0;
        }
        if (amount + this.first > 100) {
            this.first = 100;
        } else {
            this.first += amount;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            amount = 0;
        }

        if (this.first - amount < 0) {
            this.first = 0;
        } else {
            this.first -= amount;
        }
    }

    public String toString() {
        return first + "/100";
    }
}
