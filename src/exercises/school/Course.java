package exercises.school;

import java.util.ArrayList;

public class Course {

    private static int nextCourseId = 1;  // TODO: Add db persistence in future
    private String name;
    private final int courseId;
    private ArrayList<Student> students;
    private int numberOfCredits;

    public Course(String name, int courseId,
                  ArrayList<Student> students, int numberOfCredits) {

        this.name = name;
        this.courseId = courseId;
        this.students = students;
        this.numberOfCredits = numberOfCredits;
    }

    public Course(String name, ArrayList<Student> students, int numberOfCredits) {

        this(name, nextCourseId++, students, numberOfCredits);
    }

    public Course(String name, int numberOfCredits) {
        this(name, nextCourseId++, null, numberOfCredits);
    }

    public String getName() {

        return name;
    }

    public void setName(String aName) {

        name = aName;
    }

    public int getCourseId() {

        return courseId;
    }

    public ArrayList<Student> getStudents() {

        return students;
    }

    public void setStudents(ArrayList<Student> students) {

        this.students = students;
    }

    public Integer getNumberOfCredits() {

        return numberOfCredits;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {

        numberOfCredits = aNumberOfCredits;
    }
}
