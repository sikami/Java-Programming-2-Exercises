
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        List<Book> start = command();
        processBook(start);
    }
    
    public static List<Book> command() {
        List<Book> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String read;
        int year;
        while(true) {
            System.out.print("Input the name of the book, empty stops: ");
            read = scan.nextLine();

            if (read.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            year = Integer.valueOf(scan.nextLine());

            books.add(new Book(read, year));
        }

        return books;
    }

    public static void processBook(List<Book> lists) {
        int count = lists.size();

        if (count < 2) {
            System.out.println(count + " book in total.");
        } else {
            System.out.println(count + " books in total.");
        }

        Comparator<Book> comparator = Comparator.comparing(Book::getAge)
                .thenComparing(Book::getName);

        Collections.sort(lists, comparator);
        for (Book list : lists) {
            System.out.println(list);
        }
    }

}
