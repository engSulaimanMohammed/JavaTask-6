import java.util.HashMap;
import java.util.Scanner;

public class ProductPriceCatalog {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Double> products = new HashMap<>();

        IO.print("Enter number of products: ");
        int numberOfProducts = input.nextInt();
        input.nextLine();

        if (numberOfProducts <= 0) {
            IO.println("Invalid number of products.");
        } else {
            for (int i = 0; i < numberOfProducts; i++) {
                IO.print("Enter product name: ");
                String productName = input.nextLine();

                IO.print("Enter product price: ");
                double price = input.nextDouble();
                input.nextLine();

                if (products.containsKey(productName)) {
                    IO.println("Product already exists. Record not added.");
                } else {
                    products.put(productName, price);
                }
            }

            IO.print("Enter product name to search: ");
            String searchProduct = input.nextLine();
            String result;

            if (products.containsKey(searchProduct)) {
                IO.println("Current price: " + products.get(searchProduct));
                IO.print("Do you want to update the price? (Y/N): ");
                String choice = input.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    IO.print("Enter new price: ");
                    double newPrice = input.nextDouble();
                    products.replace(searchProduct, newPrice);
                    result = "Price updated successfully.";
                } else {
                    result = "Price was not updated.";
                }
            } else {
                result = "Product not found.";
            }
        }
    }
}
