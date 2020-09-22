
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String input = "";
        int number = 0;
        
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+ first);
            System.out.println("Second: " + second);

            input = scanner.nextLine();
            String[] inputs = input.split(" ");

            if (inputs[0].equals("quit")) {
                break;
            }

            number = Integer.valueOf(inputs[1]);


            if (inputs[0].equals("add")) {
                first.add(number);
            } else if (inputs[0].equals("move")) {
                int move;

                if (first.contains() - number < 0) {
                    second.add(first.contains());
                    first.remove(number);
                } else if (first.contains() - number > 0) {
                    first.remove(number);

                    if (second.contains() + number < 100) {
                        second.add(number);
                    } else {
                        second.add(100);
                    }
                } else if (number - first.contains() > 0) {
                    move = first.contains();
                    first.remove(100);
                    if (second.contains() + move < 100) {
                        second.add(move);
                    } else {
                        second.add(100);
                    }
                } else if (number - first.contains() <= 0) {
                    move = first.contains() - second.contains();
                    first.remove(100);
                    if (second.contains() + move <= 100) {
                        second.add(move);
                    } else {
                        second.add(100);
                    }
                }
            } else if (inputs[0].equals("remove")) {
                second.remove(number);
            }
        
        }
    }

}
