
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author listya
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        String command = "";
        while (true) {
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            switch (command) {
                case "add" :
                    System.out.print("To add: ");
                    String input = scanner.nextLine();
                    todoList.add(input);
                    break;
                case "list" :
                    todoList.print();
                    break;
                case "remove" :
                    System.out.print("Which one is to be removed? ");
                    int number = Integer.parseInt(scanner.nextLine());
                    todoList.remove(number);
                    break;
            }
        }
    }
}
