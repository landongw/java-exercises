package exercises.school;

/**
 * Created by Landon Wiedenman
 */

import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Create Student ArrayList
        ArrayList<Student> students = new ArrayList<>();
        String newStudent;

        // Create Course ArrayList
        ArrayList<Course> courses = new ArrayList<>();
        String newCourse;

        // Create aStudents ArrayList
        ArrayList<Student> aStudents;


        // Top level menu options
        HashMap<String, String> actionChoices = new HashMap<>();
        actionChoices.put("list students", "List Students");
        actionChoices.put("list courses", "List Courses");
        actionChoices.put("add students", "Add Students");
        actionChoices.put("add courses", "Add Courses");
        actionChoices.put("add student grades", "Add Student Grades");
        actionChoices.put("enroll students in course", "Enroll Students in Course");
        // TODO: Add getGradeLevel option into UI and finish method in Student class

        System.out.println("Welcome to the Gradebook App!");

        // Allow app to run until user manually quits
        while (true) {

            String actionChoice = getUserSelection("Select an Action:", actionChoices);

            if (actionChoice.equals("list students")) {
                // List students
                System.out.println("\nStudents: ");

                for (Student student : students) {
                    String aName = student.getName();
                    int aId =  student.getStudentId();
                    double aGpa = student.getGpa();
                    int aNumberOfCredits = student.getNumberOfCredits();

                    // TODO: complete gpa calculation (but do it in the Student class
                    System.out.println("Name: " + aName + "\nID: " + aId + "\nGPA: " + aGpa + "\nCredits: " +
                                        aNumberOfCredits + "\n");
                }

            } else if (actionChoice.equals("list courses")) {
                // List courses
                System.out.println("\nCourses:\n");

                for (Course course : courses) {
                    String aCourse = course.getName();
                    int aId = course.getCourseId();
                    int aNumberOfCredits = course.getNumberOfCredits();
                    aStudents = course.getStudents();

                    if (aStudents == null) {
                        System.out.println("Course Name: " + aCourse + "\nCourse ID: " + aId +
                                "\nCredits: " + aNumberOfCredits + "\nStudents: None\n");
                    } else {
                        List<String> studentsList = new ArrayList<>();
                        for (Student student : aStudents) {
                            studentsList.add(student.getName());
                        }


                        System.out.println(Arrays.toString(studentsList.toArray()));  // TODO: find out how to print all student names in the list

                        System.out.println("Course Name: " + aCourse + "\nCourse ID: " + aId +
                                "\nCredits: " + aNumberOfCredits + "\nStudents:"
                                + "\n");
                    }
                }

            } else if (actionChoice.equals("add students")) {
                // Add students
                do {
                    System.out.print("Student: ");
                    newStudent = in.nextLine();
                    students.add(new Student(newStudent));
                } while(!newStudent.equals(""));

            } else if (actionChoice.equals("add courses")) {
                // Add courses
                do {
                    System.out.println("Course: ");
                    newCourse = in.nextLine();
                    if (!newCourse.equals("")) {
                        System.out.print("Credits: ");
                        Integer newCourseNumberOfCredits = in.nextInt();
                        courses.add(new Course(newCourse, newCourseNumberOfCredits));

                        // Read in the newline before looping back
                        in.nextLine();
                    }
                } while(!newCourse.equals(""));

            } else if (actionChoice.equals("add student grades")) {
                // Add student grades
                int aCourseCredits = 0;
                String aCourseID;
                do {
                    System.out.println("Course ID: ");
                    aCourseID = in.nextLine();
                    if (!aCourseID.equals(""))
                    {
                        // Get number of course credits and add them to aCourseCredits
                        int iCourseID = Integer.parseInt(aCourseID);
                        Course course = courses.get(iCourseID);
                        aCourseCredits = course.getNumberOfCredits();

                        System.out.println("Student ID: ");
                        Integer aStudentID = in.nextInt() - 1;
                        // Get student object by id
                        Student student = students.get(aStudentID);
                        // Set Grade
                        System.out.println("Grade (ex: 4.0): ");
                        double aGrade = in.nextDouble();
                        student.addGrade(iCourseID, aCourseCredits, aGrade);

                        // Read in the newline before looping back
                        in.nextLine();

                    }
                } while(!aCourseID.equals(""));


            } else if (actionChoice.equals("enroll students in course")) {
                // Add students to course
                String aCourseID;
                do {
                    System.out.println("Course ID: ");
                    aCourseID = in.nextLine();
                    if (!aCourseID.equals(""))
                    {
                        System.out.println("Student ID: ");
                        Integer aStudentID = in.nextInt();
                        // Get student object by id
                        students.get(aStudentID);

                        // Add student object to ArrayList of students
                        ArrayList<Student> aStudentList = new ArrayList<>();
                        aStudentList.add(students.get(aStudentID));
                        // Get course object by id
                        // setStudents with ArrayList of students
                        Integer intCourseID = Integer.parseInt(aCourseID) - 1;
                        Course aCourse = courses.get(intCourseID);
                        aCourse.setStudents(aStudentList);

                        // Read in the newline before looping back
                        in.nextLine();
                    }
                } while(!aCourseID.equals(""));

            } else {
                System.out.println("You must make a selection or quit.");
            }


        }
    }

    private static String getUserSelection(String menuHeader, HashMap<String, String> choices) {

        Integer choiceIdx;
        Boolean validChoice = false;
        String[] choiceKeys = new String[choices.size()];

        // Put the choices in an ordered structure so we can
        // associate an integer with each one
        Integer i = 0;
        for (String choiceKey : choices.keySet()) {
            choiceKeys[i] = choiceKey;
            i++;
        }

        do {

            System.out.println("\n" + menuHeader);

            // Print available choices
            for (Integer j = 0; j < choiceKeys.length; j++) {
                System.out.println("" + j + " - " + choices.get(choiceKeys[j]));
            }

            choiceIdx = in.nextInt();
            in.nextLine();

            // Validate user's input
            if (choiceIdx < 0 || choiceIdx >= choiceKeys.length) {
                System.out.println("Invalid choice. Try again.");
            } else {
                validChoice = true;
            }

        } while (!validChoice);

        return choiceKeys[choiceIdx];
    }
}





//        System.out.println("Enter your students (or ENTER to finish):");
//
//        // Get student names and grades
//        do {
//
//            System.out.print("Student: ");
//            newStudent = in.nextLine();
//            students.add(new Student(newStudent));
//
//        } while(!newStudent.equals(""));
//
//        // Print class roster
//        System.out.println("\nClass roster:");
//
//        for (Student student : students) {
//            String aName = student.getName();
//            int aId =  student.getStudentId();
//            double aGpa = student.getGpa();
//            int aNumberOfCredits = student.getNumberOfCredits();
//
//            System.out.println("Name: " + aName + "\nID: " + aId + "\nGPA: " + aGpa + "\nCredits: " + aNumberOfCredits);
//        }
//    }
