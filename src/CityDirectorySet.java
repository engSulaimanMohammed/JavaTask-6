import java.util.Scanner;
import java.util.TreeSet;

public class CityDirectorySet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> Cities = new TreeSet<>();

        IO.print("Enter The Number Of Cities: ");
        int CitiesNumber = scanner.nextInt();
        scanner.nextLine();

        if (CitiesNumber <= 0) {
            IO.println("Invalid number of cities.");
        }
    }
}
