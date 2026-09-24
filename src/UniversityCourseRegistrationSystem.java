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

        int choice;
        do {
            IO.println("\n1. Search Student");
            IO.println("2. Add Course to Student");
            IO.println("3. Remove Course from Student");
            IO.println("4. Display All Students");
            IO.println("5. Display Registration Statistics");
            IO.println("6. Exit");
            IO.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    IO.print("Enter student ID: ");
                    int searchId = input.nextInt();
                    input.nextLine();

                    if (registrations.containsKey(searchId)) {
                        IO.println("Courses: " + registrations.get(searchId));
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 2:
                    IO.print("Enter student ID: ");
                    int addId = input.nextInt();
                    input.nextLine();

                    if (registrations.containsKey(addId)) {
                        IO.print("Enter course name: ");
                        String newCourse = input.nextLine();

                        if (registrations.get(addId).add(newCourse)) {
                            IO.println("Course added successfully.");
                        } else {
                            IO.println("Course already registered.");
                        }
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 3:
                    IO.print("Enter student ID: ");
                    int removeId = input.nextInt();
                    input.nextLine();

                    if (registrations.containsKey(removeId)) {
                        IO.print("Enter course name: ");
                        String courseToRemove = input.nextLine();

                        if (registrations.get(removeId).remove(courseToRemove)) {
                            IO.println("Course removed successfully.");
                        } else {
                            IO.println("Course not found.");
                        }
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 4:
                    for (int id : registrations.keySet()) {
                        IO.println("Student ID: " + id + " | Courses: " + registrations.get(id));
                    }
                    break;

                case 5:
                    int totalCourses = 0;
                    int highestId = -1;
                    int lowestId = -1;
                    int highestCount = -1;
                    int lowestCount = Integer.MAX_VALUE;

                    for (int id : registrations.keySet()) {
                        int count = registrations.get(id).size();
                        totalCourses += count;

                        if (count > highestCount) {
                            highestCount = count;
                            highestId = id;
                        }

                        if (count < lowestCount) {
                            lowestCount = count;
                            lowestId = id;
                        }
                    }

                    double average = registrations.isEmpty()
                            ? 0
                            : (double) totalCourses / registrations.size();

                    IO.println("Total students: " + registrations.size());
                    IO.println("Total course registrations: " + totalCourses);
                    IO.println("Student with highest courses: " + highestId);
                    IO.println("Student with lowest courses: " + lowestId);
                    IO.println("Average courses per student: " + average);
                    break;

                case 6:
                    IO.println("Program ended.");
                    break;

                default:
                    IO.println("Invalid choice.");
            }
        } while (choice != 6);

        input.close();
    }
}
