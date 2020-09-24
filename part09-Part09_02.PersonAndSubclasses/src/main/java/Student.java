/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Student extends Person {
    private int studyCredit;
    
    public Student(String name, String address) {
        super(name, address);
        this.studyCredit = 0;
        
    }
    
    public void study() {
        this.studyCredit++;
    }

    public int credits() {
        return this.studyCredit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credits(); 
    }
    
    
    
}
