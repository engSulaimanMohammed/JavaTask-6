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
                if (!Cities.add(CityName)) {  // If a duplicate city name is entered
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

            int UniqueCityName = Cities.size();
            String Classfication;
            if (UniqueCityName < 5) {
                Classfication = "Small Directory";
            } else if (UniqueCityName >= 5 && UniqueCityName <= 10) {
                Classfication = "Medium Directory";
            } else {
                Classfication = " Large Directory";
            }
            IO.println("Total cities entered: " + CitiesNumber);
            IO.println("Total unique cities: " + UniqueCityName);
            IO.println("All cities in alphabetical order: " + Cities);
            IO.println("Search result : " + (CityFound ? "City found in the directory." : "City not found in the directory."));
            IO.println("Directory classification : " + Classfication);
        }
    }
}
