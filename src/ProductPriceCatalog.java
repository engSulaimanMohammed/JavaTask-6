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
        }
    }
}
