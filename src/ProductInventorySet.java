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

            IO.print("Enter a product name to search for: ");
            String searchProduct = scanner.next();
            boolean productFound = Products.contains(searchProduct);

            if (productFound) {
                IO.println("Product found in inventory.");
            } else {
                IO.println("Product not found in inventory.");
            }

            int uniqueProductCount = Products.size();
            String Classification;

            if (uniqueProductCount < 5) {
                Classification = "Small Inventory";
            } else if (uniqueProductCount <= 10) {
                Classification = "Medium Inventory";
            } else {
                Classification = "Large Inventory";
            }

            IO.println("\nTotal products entered: " + productnumbers);
            IO.println("Total unique products: " + uniqueProductCount);
            IO.println("All products in the inventory: " + Products);
            IO.println("Search result: " + (productFound ? "Product found in inventory." : "Product not found in inventory."));
            IO.println("Inventory classification: " + Classification);
        }
    }
}
