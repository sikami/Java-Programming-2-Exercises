
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> number = new ArrayList<>();
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }
            number.add(input);
        }

        number.stream()
                .filter(s -> s >= 0 && s <=5)
                .forEach(s -> System.out.println(s));
    }
}
