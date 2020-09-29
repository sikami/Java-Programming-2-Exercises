
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(Paths.get("literacy.csv"))) {
            String[] arrays;
            String country;
            String year;
            String gender;
            String[] genders;
            double number;
            String reads;
            List<Literacy> data = new ArrayList<>();

            while(reader.hasNextLine()) {
                reads = reader.nextLine();
                arrays = reads.split(",");
                country = arrays[3];
                year = arrays[4];
                gender = arrays[2].trim();
                genders = gender.split(" ");
                gender = genders[0];
                number = Double.parseDouble(arrays[5]);
                data.add(new Literacy(country, year, gender, number));
            }

            data.stream().sorted((num1, num2) -> {
                return num1.compareTo(num2);
            }).forEach(p -> System.out.println(p));
        } catch (IOException e) {
            e.getMessage();
        }
    }
}
