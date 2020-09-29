
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        List<String> inputs = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String words = scanner.nextLine();
            if (words.equals("end")) {
                break;
            }
            
            inputs.add(words);
        }
        
        double averages = inputs.stream()
                .mapToDouble(s -> Double.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + averages);

    }
}
