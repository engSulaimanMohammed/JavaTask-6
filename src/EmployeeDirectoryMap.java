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
        }
    }
}
