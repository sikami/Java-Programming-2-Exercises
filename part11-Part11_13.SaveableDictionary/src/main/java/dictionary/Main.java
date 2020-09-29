package dictionary;

public class Main {
    public static void main(String[] args) {
        // You can test your dictionary here
        SaveableDictionary s = new SaveableDictionary("words.txt");
        s.load();
    }
}
