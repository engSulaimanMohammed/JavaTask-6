import java.util.HashSet;
import java.util.Scanner;

public class ProductInventorySet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> Products = new HashSet<>();

        IO.println("Enter The Product Numbers: ");
        int productnumbers = scanner.nextInt();

        if (productnumbers <= 0) {
            IO.println("Invalid number of products.");
        }
    }
}
