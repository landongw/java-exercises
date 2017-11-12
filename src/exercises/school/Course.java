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

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Integer getCourseId() {
        return courseId;
    }

//    private void setCourseId(Integer aCourseId) {  // TODO: Figure out how to set this and make private?
//        courseId = aCourseId;
//    }

    public Integer getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }
}
