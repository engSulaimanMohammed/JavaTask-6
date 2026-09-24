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
        } else {
            for (int i = 0; i < productnumbers; i++) {
                IO.println("Enter product name: ");
                String productnames = scanner.nextLine();

                if (!Products.add(productnames)) {
                    IO.println("Product already exists. Duplicate entries are not allowed.");
                }
            }
        }
    }
}
