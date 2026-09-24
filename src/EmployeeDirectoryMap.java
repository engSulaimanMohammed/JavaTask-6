import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDirectoryMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> employees = new HashMap<>();

        IO.print("Enter The Employee Number: ");
        int EmployeeNum = scanner.nextInt();
        scanner.nextLine();

        if (EmployeeNum <= 0) {
            IO.println("Invalid number of employees.");
        } else {
            for (int i = 0; i < EmployeeNum; i++) {
                IO.print("Enter The Employee ID: ");
                int EmployeeID = scanner.nextInt();
                scanner.nextLine();

                if (employees.containsKey(EmployeeID)) {
                    IO.println("Employee ID already exists. Please enter a unique ID.");
                } else {
                    IO.print("Enter The Employee Name: ");
                    String EmployeeName = scanner.nextLine();
                    employees.put(EmployeeID, EmployeeName);
                }
            }

            IO.print("Enter employee ID to search for: ");
            int searchId = scanner.nextInt();
            String searchResult;

            if (employees.containsKey(searchId)) {
                searchResult = "Employee Found: " + employees.get(searchId);
            } else {
                searchResult = "Employee ID not found.";
            }

            int uniqueEmployeeCount = employees.size();
            String companyClassification;

            if (uniqueEmployeeCount < 5) {
                companyClassification = "Small Company";
            } else if (uniqueEmployeeCount <= 10) {
                companyClassification = "Medium Company";
            } else {
                companyClassification = "Large Company";
            }

            IO.println("Total employee records entered: " + EmployeeNum);
            IO.println("Total unique employees: " + uniqueEmployeeCount);
            IO.println("All employee IDs and names: " + employees);
            IO.println("Search result: " + searchResult);
            IO.println("Company classification: " + companyClassification);
        }

        scanner.close();
    }
}
