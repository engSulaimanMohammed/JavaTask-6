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
        } else {
            for (int i = 0; i < numberOfBooks; i++) {
                IO.print("Enter book ID: ");
                int bookId = input.nextInt();
                input.nextLine();

                IO.print("Enter book title: ");
                String bookTitle = input.nextLine();

                if (bookIds.contains(bookId)) {
                    IO.println("Duplicate Book ID. Record not added.");
                } else {
                    bookIds.add(bookId);
                    books.put(bookId, bookTitle);
                }
            }

            IO.print("Enter book ID to search: ");
            int searchId = input.nextInt();

            if (books.containsKey(searchId)) {
                IO.println("Book ID: " + searchId);
                IO.println("Book title: " + books.get(searchId));
            } else {
                IO.println("Book not found.");
            }
        }
    }
}
