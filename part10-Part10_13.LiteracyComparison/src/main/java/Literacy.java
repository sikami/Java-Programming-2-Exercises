/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Literacy implements Comparable<Literacy> {
    private String country;
    private String year;
    private String gender;
    private double number;

    public Literacy(String country, String year, String gender, double number) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public String getYear() {
        return year;
    }

    public String getGender() {
        return gender;
    }

    public double getNumber() {
        return number;
    }

    @Override
    public int compareTo(Literacy o) {
        if (this.getNumber() > o.getNumber()) {
            return 1;
        } else if (this.getNumber() == o.getNumber()) {
            return 0;
        }
        return -1;
    }

    public String toString() {
        return this.country + " (" + this.year +"), " + this.gender + ", " + this.number;
    }
}
