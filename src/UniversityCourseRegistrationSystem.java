import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class UniversityCourseRegistrationSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashSet<Integer> studentIds = new HashSet<>();
        HashMap<Integer, HashSet<String>> registrations = new HashMap<>();

        IO.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine();

        if (numberOfStudents <= 0) {
            IO.println("Invalid number of students.");
            input.close();
            return;
        }
    }
}
