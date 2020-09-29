
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        
        List<String> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            inputs.add(input);
        }

        double averageNegative = inputs.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s < 0)
                .average()
                .getAsDouble();

        double averagePositive = inputs.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .filter(s -> s >= 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbersor the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageNegative);
        } else if (command.equals("p")) {
            System.out.println("Average of the positive numbers: " +averagePositive);
        }

    }
}
