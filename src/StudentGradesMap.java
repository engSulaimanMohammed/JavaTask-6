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


            double total = 0;
            for (double grade : studentGrades.values()) {
                total += grade;
            }
            double average = studentGrades.isEmpty() ? 0 : total / studentGrades.size();

            String classification;
            if (average < 60) {
                classification = "Needs Improvement";
            } else if (average <= 84) {
                classification = "Good Performance";
            } else {
                classification = "Excellent Performance";
            }

            IO.println("\nTotal student records: " + studentGrades.size());
            IO.println("All student IDs and grades: " + studentGrades);
            IO.println("Average grade: " + average);
            IO.println("Class performance classification: " + classification);
        }

        input.close();
    }
}
