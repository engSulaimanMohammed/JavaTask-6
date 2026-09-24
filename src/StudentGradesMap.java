import java.util.HashMap;
import java.util.Scanner;

public class StudentGradesMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer, Double> studentGrades = new HashMap<>();

        IO.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        if (numberOfStudents <= 0) {
            IO.println("Invalid number of students.");
        } else {
            for (int i = 0; i < numberOfStudents; i++) {
                IO.print("Enter student ID: ");
                int studentId = input.nextInt();

                IO.print("Enter grade: ");
                double grade = input.nextDouble();

                if (studentGrades.containsKey(studentId)) {
                    IO.println("Student ID already exists. Record not added.");
                } else {
                    studentGrades.put(studentId, grade);
                }
            }

            IO.print("Enter student ID to update: ");
            int updateId = input.nextInt();

            if (studentGrades.containsKey(updateId)) {
                IO.print("Enter new grade: ");
                double newGrade = input.nextDouble();
                studentGrades.replace(updateId, newGrade);
                IO.println("Grade updated successfully.");
            } else {
                IO.println("Student ID not found.");
            }
        }
    }
}
