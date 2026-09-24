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
        } else {
            for (int i = 0; i < numberOfStudents; i++) {
                IO.println("\nStudent " + (i + 1));
                IO.print("Enter student ID: ");
                int studentId = scanner.nextInt();
                scanner.nextLine();

                IO.print("Enter course name: ");
                String courseName = scanner.nextLine();

                if (studentIds.contains(studentId)) {
                    IO.println("Student ID already exists. Record not added.");
                } else {
                    studentIds.add(studentId);
                    studentCourses.put(studentId, courseName);
                }
            }

            IO.print("\nEnter student ID to update: ");
            int updateStudentId = scanner.nextInt();
            scanner.nextLine();

            if (studentIds.contains(updateStudentId)) {
                IO.print("Enter new course name: ");
                String newCourseName = scanner.nextLine();
                studentCourses.replace(updateStudentId, newCourseName);
                IO.println("Course updated successfully.");
            } else {
                IO.println("Student ID not found.");
            }
        }
    }
}
