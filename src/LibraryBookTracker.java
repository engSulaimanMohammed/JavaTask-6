import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class LibraryBookTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> bookIds = new HashSet<>();
        HashMap<Integer, String> books = new HashMap<>();

        IO.print("Enter number of books: ");
        int numberOfBooks = input.nextInt();
        input.nextLine();

        if (numberOfBooks <= 0) {
            IO.println("Invalid number of books.");
        }
    }
}
