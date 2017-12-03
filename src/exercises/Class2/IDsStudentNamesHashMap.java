package exercises.Class2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IDsStudentNamesHashMap{
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;
        Integer studentID = 1;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                students.put(studentID, newStudent);
                studentID += 1;
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue());
        }

    }
}
