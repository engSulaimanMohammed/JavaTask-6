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
            String enrollmentClassification;
            if (studentIds.size() < 5) {
                enrollmentClassification = "Small Enrollment";
            } else if (studentIds.size() <= 15) {
                enrollmentClassification = "Medium Enrollment";
            } else {
                enrollmentClassification = "Large Enrollment";
            }

            IO.println("\n----- Enrollment Information -----");
            IO.println("Total student records entered: " + numberOfStudents);
            IO.println("Total unique students: " + studentIds.size());
            IO.println("All student IDs: " + studentIds);
            IO.println("All student IDs with their enrolled courses: " + studentCourses);
            IO.println("Enrollment classification: " + enrollmentClassification);
        }

        scanner.close();
    }
}
