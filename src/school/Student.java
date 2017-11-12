package school;

public class Student {

    private static int nextStudentId = 1;  // TODO: Add db persistence in future
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
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

    public Integer getstudentId() {
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
}
