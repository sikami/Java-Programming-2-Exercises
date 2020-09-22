
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
public class TodoList {
    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        int count = 0;
        for (String task : tasks) {
            count++;
            System.out.println(count + ": " + task);
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
