
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            
            double number = Double.valueOf(input);
            double result = Math.pow(number, 3);
            System.out.println((int)result);
            
        }

    }
}
