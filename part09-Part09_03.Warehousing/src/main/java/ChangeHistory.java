
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
public class ChangeHistory {
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = 0;
        if (!history.isEmpty()) {
            for (Double record : history) {
                if (record > max) {
                    max = record;
                }
            }
            return max;
        }

        return 0;
    }

    public double minValue() {
        if (!history.isEmpty()) {
            double min = history.get(0);
            for (Double record : history) {
                if (record < min) {
                    min = record;
                }
            }
            return min;
        }
        return 0;
    }

    public double average() {
        if (!history.isEmpty()) {
            double sum = 0;
            double average = 0;

            for (Double record : history) {
                sum += record;
            }

            average = sum / (double) history.size();
            return average;
        }
        return 0;
    }
}
