package exercises.school;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Landon Wiedenman
 */

public class StudentIdHashMap {

    public static void main(String[] args) {

        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer newId = in.nextInt();
                students.put(newStudent, newId);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<String, Integer> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
    }
}