/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class Book implements Comparable<Book> {
    private String name;
    private int age;

    public Book(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



    public String toString() {
        return this.name + " (recomended for " + this.age + " year-olds or older)";
    }

    @Override
    public int compareTo(Book o) {
        if(this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        }
        return -1;
    }
}
