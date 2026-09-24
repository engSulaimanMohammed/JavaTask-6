import java.util.HashSet;
import java.util.Scanner;

public class CourseEnrollmentSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> Courses = new HashSet<>();

        IO.println("Enter The course number: ");
        int coursenumber = scanner.nextInt();

        if (coursenumber <= 0) {
            IO.println("Invalid number of courses.");
        } else {
            for (int i = 0; i < coursenumber; i++) {
                IO.println("Enter Course Name: ");
                String Coursename = scanner.nextLine();

                if (!Courses.add(Coursename)) {
                    IO.println("Course already exists. Duplicate entries are not allowed.");
                }
            }
        }
    }
}
