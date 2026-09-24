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
    }
}
