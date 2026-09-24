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
        }
    }
}
