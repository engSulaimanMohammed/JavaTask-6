import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSalaryManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Double> employees = new HashMap<>();

        IO.print("Enter number of employees: ");
        int numberOfEmployees = input.nextInt();

        if (numberOfEmployees <= 0) {
            IO.println("Invalid number of employees.");
            input.close();
            return;
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            IO.print("Enter employee ID: ");
            int employeeId = input.nextInt();

            IO.print("Enter salary: ");
            double salary = input.nextDouble();

            if (employees.containsKey(employeeId)) {
                IO.println("Employee ID already exists. Record not added.");
            } else {
                employees.put(employeeId, salary);
            }
        }

        int choice;
        do {
            IO.println("\n1. Add Employee");
            IO.println("2. Search Employee");
            IO.println("3. Update Salary");
            IO.println("4. Remove Employee");
            IO.println("5. Display All Employees");
            IO.println("6. Display Salary Statistics");
            IO.println("7. Exit");
            IO.print("Choose: ");
            choice = input.nextInt();
        } while (choice != 7);
    }
}
