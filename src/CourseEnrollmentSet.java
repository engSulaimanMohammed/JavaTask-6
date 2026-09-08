import java.util.HashSet;
import java.util.Scanner;


public class CourseEnrollmentSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> Courses = new HashSet<>();
        IO.println("Enter The course number: ");
        int coursenumber = scanner.nextInt();
        if (coursenumber <= 0 ) {
            IO.println("Invalid number of courses.");
        } else {
            for (int i = 0 ; i < coursenumber ; i++) {
                IO.println("Enter Course Name: ");
                String Coursename = scanner.nextLine();
                if (!Courses.add(Coursename)) {
                    IO.println("Course already exists. Duplicate entries are not allowed.");
                }
            }
            IO.println("Enter the course name to remove. ");
            String courseToRemove = scanner.next();
            boolean courseRemoved = Courses.remove(courseToRemove);

            if (courseRemoved) {
                IO.println("Course removed successfully.");
            } else {
                IO.println("Course not found.");
            }
            int remainingCourseCount = Courses.size();
            String Classification;
            if (remainingCourseCount < 4) {
                Classification = "Small Course Catalog";
            } else if (remainingCourseCount <= 8) {
                Classification = "Medium Course Catalog";
            } else {
                Classification = "Large Course Catalog";
            }

            IO.println("\nTotal courses entered: " + coursenumber);
            IO.println("Total unique courses remaining: " + remainingCourseCount);
            IO.println("All remaining course names: " + Courses);
            IO.println("Removal result: " + (courseRemoved ? "Course removed successfully." : "Course not found."));
            IO.println("Course catalog classification: " + Classification);
        }
        scanner.close();
    }
}