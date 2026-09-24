import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAttendanceManager {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Integer> attendance = new HashMap<>();

      IO.print("Enter number of student records: ");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents <= 0) {
            IO.println("Invalid number of students.");
            input.close();
            return;
        }

        // Add initial records
        for (int i = 0; i < numberOfStudents; i++) {
            IO.print("Enter student ID: ");
            int studentId = input.nextInt();
            IO.print("Enter attended days: ");
            int days = input.nextInt();

            if (attendance.containsKey(studentId)) {
                IO.println("Student ID already exists. Record not added.");
            } else {
                attendance.put(studentId, days);
            }
        }

        int choice;
        do {
            IO.println("\n1. Add Student Record");
            IO.println("2. Search Student Attendance");
            IO.println("3. Update Attendance");
            IO.println("4. Remove Student Record");
            IO.println("5. Display All Attendance Records");
            IO.println("6. Display Attendance Statistics");
            IO.println("7. Exit");
            IO.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    IO.print("Enter student ID: ");
                    int newId = input.nextInt();
                    IO.print("Enter attended days: ");
                    int newDays = input.nextInt();

                    if (attendance.containsKey(newId)) {
                        IO.println("Student ID already exists. Record not added.");
                    } else {
                        attendance.put(newId, newDays);
                        IO.println("Student record added successfully.");
                    }
                    break;

                case 2:
                    IO.print("Enter student ID: ");
                    int searchId = input.nextInt();

                    if (attendance.containsKey(searchId)) {
                        IO.println("Attendance days: " + attendance.get(searchId));
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 3:
                    IO.print("Enter student ID: ");
                    int updateId = input.nextInt();

                    if (attendance.containsKey(updateId)) {
                        IO.print("Enter new attendance days: ");
                        int days = input.nextInt();
                        attendance.replace(updateId, days);
                        IO.println("Attendance updated successfully.");
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 4:
                    IO.print("Enter student ID: ");
                    int removeId = input.nextInt();

                    if (attendance.containsKey(removeId)) {
                        attendance.remove(removeId);
                        IO.println("Student record removed successfully.");
                    } else {
                        IO.println("Student not found.");
                    }
                    break;

                case 5:
                    for (Map.Entry<Integer, Integer> record : attendance.entrySet()) {
                        IO.println("Student ID: " + record.getKey() + " | Attendance days: " + record.getValue());
                    }
                    break;

                case 6:
                    if (attendance.isEmpty()) {
                        IO.println("No attendance records available.");
                    } else {
                        int totalDays = 0;
                        int highestId = -1;
                        int lowestId = -1;
                        int highestDays = -1;
                        int lowestDays = Integer.MAX_VALUE;

                        for (Map.Entry<Integer, Integer> record : attendance.entrySet()) {
                            int id = record.getKey();
                            int days = record.getValue();
                            totalDays += days;

                            if (days > highestDays) {
                                highestDays = days;
                                highestId = id;
                            }
                            if (days < lowestDays) {
                                lowestDays = days;
                                lowestId = id;
                            }
                        }

                        double average = (double) totalDays / attendance.size();
                        IO.println("Total number of students: " + attendance.size());
                        IO.println("Total attendance days: " + totalDays);
                        IO.println("Average attendance: " + average);
                        IO.println("Student with highest attendance: " + highestId + " (" + highestDays + " days)");
                        IO.println("Student with lowest attendance: " + lowestId + " (" + lowestDays + " days)");
                    }
                    break;

                case 7:
                    IO.println("Program ended.");
                    break;

                default:
                    IO.println("Invalid choice.");
            }
        } while (choice != 7);

        input.close();
    }
}
