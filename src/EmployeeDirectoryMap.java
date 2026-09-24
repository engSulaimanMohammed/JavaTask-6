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
        }
    }
}
