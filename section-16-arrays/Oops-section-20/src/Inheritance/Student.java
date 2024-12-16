package Inheritance;

public class Student extends Person {
    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private String studentId;
    private String major;
    private double gpa;

    public Student(String name, String email, String phone, String studentId, String major, double gpa) {
        super(name, email, phone);
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }
}
