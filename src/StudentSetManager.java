import java.util.HashSet;
import java.util.Scanner;

public class StudentSetManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> StudentIDs = new HashSet<>();

        IO.print("Enter the Student ID: ");
        int NumOfStudents = scanner.nextInt();

        if (NumOfStudents <= 0) {
            IO.println("Invalid number of students.");
        } else {
            for (int i = 0; i < NumOfStudents; i++) {
                IO.print("Enter Student ID: ");
                String StudentID = scanner.next();
                if (!StudentIDs.add(StudentID)) {
                    IO.println("Duplicate ID detected. ID was not added.");
                }
            }

            int uniqueCount = StudentIDs.size();
            String Classification;

            if (uniqueCount < 5) {
                Classification = "Small Registration";
            } else if (uniqueCount <= 10) {
                Classification = "Medium Registration";
            } else {
                Classification = "Large Registration";
            }

            IO.println("\nTotal IDs entered: " + NumOfStudents);
            IO.println("Total unique student IDs: " + uniqueCount);
            IO.println("All unique student IDs: " + StudentIDs);
            IO.println("Registration classification: " + Classification);
        }

        scanner.close();
    }
}
