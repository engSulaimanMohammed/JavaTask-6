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
    }
}
