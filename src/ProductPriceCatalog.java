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
        }
    }
}
