package exercises.school;

import org.javatuples.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Landon Wiedenman
 */

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private Map<Integer, Pair<Integer, Double>> gradesList = new HashMap<>(); // class id, credits and grade score (4.0)
    double qualityScore;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
        this.gradesList = new HashMap<>();
        this.qualityScore = 0;
    }

    public Student(String name, int studentId) {

        this(name, studentId, 0, 0.0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public Integer getStudentId() {
        return studentId;
    }

//    private void setStudentId(Integer aStudentId) {  // TODO: Figure out how to set this and make private?
//        studentId = aStudentId;
//    }

    public Integer getNumberOfCredits() {

        return numberOfCredits;
    }

    public void setNumberOfCredits(Integer aNumberOfCredits) {

        numberOfCredits = aNumberOfCredits;
    }

    public Double getGpa() {

        return gpa;
    }

    public void setGpa(Double aGpa) {
        gpa = aGpa;
    }

    public void addGrade(int courseID, int courseCredits, double grade) {
        // Add grade to the gradesList
        gradesList.put(courseID, new Pair<>(courseCredits, grade));
        int iGrade = (int) grade;
        numberOfCredits += ((courseCredits / 4) * iGrade); // TODO: This keeps evaluating to zero, WHY WHY WHY??!!
//        gpa = grade / courseCredits; // totalQualityScore is the same as GPA



        // The total quality score is the sum of the quality scores of
        // all classes, and the quality score for a class is found by
        // multiplying the point score (0.0-4.0) by the number of credits.
        // For example, if a student received an A (worth 4 points) in a
        // 3-credit course and a B (worth 3 points) in a 4-credit course,
        // their quality score would be: 4.0 * 3 + 3.0 * 4 = 24. And their
        // GPA would then be 24 / 7 = 3.43.

        // gpa = total quality score / total credits * 4

//        System.out.println(gradesList.values());

//        qualityScore = 0;

        Iterator it = gradesList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + ": " + pair.getValue());
            Pair innerPair = (Pair) pair.getValue();
            Object innerOne = innerPair.getValue0();
            int intOne = (int) innerOne;
            double diOne = (double) intOne;
            double innerTwo = (double) innerPair.getValue1();
            double innerQualityScore = diOne * innerTwo;

            qualityScore = qualityScore + innerQualityScore;
        }

        double aGpa = qualityScore / numberOfCredits;
        setGpa(aGpa);

    }

    public void getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
    }
}
