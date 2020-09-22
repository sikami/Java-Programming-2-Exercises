
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = 0;
        int second = 0;
        String input = "";
        int number = 0;

        while (true) {
             System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            input = scanner.nextLine();
            String[] inputs = input.split(" ");
            
            if (inputs[0].equals("quit")) {
                break;
            } 
            
            number = Integer.valueOf(inputs[1]);
           
            
            if (inputs[0].equals("add")) {
                if (first + number > 100 ) {
                    first = 100;
                } else if (number < 0) {
                    first += 0;
                } else if (number + first < 100) {
                    first += number;
                }
            } else if (inputs[0].equals("move")) {
                int move;
                if (number < 0) {
                    number = 0;
                }
                
                if (first - number < 0) {
                    move = first;
                    first = 0;
                    if (second + move < 100) {
                        second += move;
                    } else {
                        second = 100;
                    }
                } else if (first - number > 0) {
                    first -= number;
                    move = number;
                    if (second + move < 100) {
                        second += move;
                    } else {
                        second = 100;
                    }
                } else if (number - first > 0) {
                    move = first;
                    first = 0;
                    if (second + move < 100) {
                        second += move;
                    } else {
                        second = 100;
                    }
                } else if (number - first <= 0) {
                    move = first - second;
                    first = 0;
                    if (second + move <= 100) {
                        second += move;
                    } else {
                        second = 100;
                    }
                }
            } else if (inputs[0].equals("remove")) {
                if (second - number < 0) {
                    second = 0;
                } else {
                    second -= number;
                }
            }
        }
    }

}
