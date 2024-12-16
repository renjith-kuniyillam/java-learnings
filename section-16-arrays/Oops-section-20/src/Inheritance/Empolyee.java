package Inheritance;

public class Empolyee extends Person {
    private String empolyeeId;
    private String title;
    private double salary;

    public Empolyee(String name, String email, String phone, String empolyeeId, String title, double salary) {
        super(name, email, phone);
        this.empolyeeId = empolyeeId;
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return String.format("Empolyee [name = %s, email=%s, phone=%s  empolyeeId=%s, title=%s, salary=%f]", getName(), getEmail(), getPhone(),empolyeeId, title, salary);
    }

    public String getEmpolyeeId() {
        return empolyeeId;
    }

    public String getTitle() {
        return title;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpolyeeId(String empolyeeId) {
        this.empolyeeId = empolyeeId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
