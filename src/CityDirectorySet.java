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
        } else {
            for (int i = 0; i < CitiesNumber; i++) {
                IO.print("Enter city name: ");
                String CityName = scanner.nextLine();

                if (!Cities.add(CityName)) {
                    IO.println("City already exists. Duplicate entries are not allowed.");
                }
            }

            IO.println("Enter The City Name To Search For: ");
            String SearchedName = scanner.nextLine();
            boolean CityFound = Cities.contains(SearchedName);

            if (CityFound) {
                IO.println("City found in the directory.");
            } else {
                IO.println("City not found in the directory.");
            }
        }
    }
}
