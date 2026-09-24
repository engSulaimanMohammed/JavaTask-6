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
    }
}
