import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CourseEnrollmentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> studentIds = new HashSet<>();
        HashMap<Integer, String> studentCourses = new HashMap<>();

        IO.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();

        if (numberOfStudents <= 0) {
            IO.println("Invalid number of students.");
        }
    }
}
