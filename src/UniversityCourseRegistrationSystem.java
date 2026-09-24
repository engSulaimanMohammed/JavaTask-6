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

        for (int i = 0; i < numberOfStudents; i++) {
            IO.print("Enter student ID: ");
            int studentId = input.nextInt();
            input.nextLine();

            if (studentIds.contains(studentId)) {
                IO.println("Student ID already exists. Record skipped.");
                continue;
            }

            studentIds.add(studentId);
            HashSet<String> courses = new HashSet<>();

            IO.print("Enter number of courses: ");
            int numberOfCourses = input.nextInt();
            input.nextLine();

            for (int j = 0; j < numberOfCourses; j++) {
                IO.print("Enter course name: ");
                String courseName = input.nextLine();
                courses.add(courseName);
            }

            registrations.put(studentId, courses);
        }
    }
}
