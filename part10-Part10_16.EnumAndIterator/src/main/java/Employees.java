
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Employees {
    private List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }
    
    public void add(Person personToAdd) {
        this.people.add(personToAdd);
    }
    
    public void add(List<Person> peopleToAdd) {
        peopleToAdd.stream().forEach(people -> this.people.add(people));
    }
    
    public void print() {
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()) {
            Person iter = iterator.next();
            System.out.println(iter);
        }
    }
    
    public void print(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()) {
            Person iter = iterator.next();
            if (iter.getEducation().equals(education)) {
                System.out.println(iter);
            }
        }
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = this.people.iterator();
        
        while(iterator.hasNext()) {
        
            if (iterator.next().getEducation().equals(education)) {
                iterator.remove();   
            }
        }
    }
    
}
