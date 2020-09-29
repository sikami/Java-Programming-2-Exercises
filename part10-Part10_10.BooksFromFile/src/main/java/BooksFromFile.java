
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try (Stream<String> stream = Files.lines(Paths.get(file))){
            stream            
            .map(word -> word.split(","))
            .map(word -> new Book(word[0], Integer.valueOf(word[1]), Integer.valueOf(word[2]), word[3]))
            .forEach(words -> books.add(words));
                    
        } catch (Exception e) {
            e.getMessage();
        }
        
        return books;
    }

}
