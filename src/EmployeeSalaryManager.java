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

            switch (choice) {
                case 1:
                    IO.print("Enter employee ID: ");
                    int newId = input.nextInt();
                    IO.print("Enter salary: ");
                    double newSalary = input.nextDouble();

                    if (employees.containsKey(newId)) {
                        IO.println("Employee ID already exists. Record not added.");
                    } else {
                        employees.put(newId, newSalary);
                        IO.println("Employee added successfully.");
                    }
                    break;

                case 2:
                    IO.print("Enter employee ID: ");
                    int searchId = input.nextInt();

                    if (employees.containsKey(searchId)) {
                        IO.println("Salary: " + employees.get(searchId));
                    } else {
                        IO.println("Employee not found.");
                    }
                    break;

                case 3:
                    IO.print("Enter employee ID: ");
                    int updateId = input.nextInt();

                    if (employees.containsKey(updateId)) {
                        IO.print("Enter new salary: ");
                        double salary = input.nextDouble();
                        employees.replace(updateId, salary);
                        IO.println("Salary updated successfully.");
                    } else {
                        IO.println("Employee not found.");
                    }
                    break;

                case 4:
                    IO.print("Enter employee ID: ");
                    int removeId = input.nextInt();

                    if (employees.containsKey(removeId)) {
                        employees.remove(removeId);
                        IO.println("Employee removed successfully.");
                    } else {
                        IO.println("Employee not found.");
                    }
                    break;

                case 5:
                    for (int id : employees.keySet()) {
                        IO.println("Employee ID: " + id + " | Salary: " + employees.get(id));
                    }
                    break;

                case 7:
                    IO.println("Program ended.");
                    break;

                default:
                    if (choice != 6) {
                        IO.println("Invalid choice.");
                    }
            }
        } while (choice != 7);

        input.close();
    }
}
